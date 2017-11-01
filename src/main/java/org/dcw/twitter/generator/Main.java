package org.dcw.twitter.generator;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.*;
import com.twitter.Extractor;
import org.dcw.twitter.model.User;
import org.dcw.twitter.model.Tweet;
import org.dcw.twitter.util.PoissonGenerator;
import org.dcw.twitter.util.RandomDate;
import org.dcw.twitter.util.Utils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

/*
 */
public class Main {

    /** Twitter's preferred date time format. */
    public static final DateTimeFormatter TWITTER_TIMESTAMP_FORMAT =
        DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss ZZZ yyyy", Locale.ENGLISH);
    public static final DateTimeFormatter ARGUMENT_TIMESTAMP_FORMAT =
        DateTimeFormatter.ofPattern("yyyyMMddHHmm", Locale.ENGLISH);

    private static final int maxFaveCount = 5000; // could be proportional to user's popularity
    private static final int maxQuoteCount = 5000;
    private static final int maxReplyCount = 5000;
    private static final int maxRetweetCount = 5000;

    @Parameter(names = {"-m", "--messages-file"}, description = "File of tweet contents, one message per line")
    private String messagesFile = "messages.json";
    @Parameter(names = {"-u", "--users-file"}, description = "File of user profiles, one JSON object per line")
    private String usersFile = "users.json";
    @Parameter(names = {"-o", "--out-file"}, description = "File to which to write generated tweets, one tweet per line")
    private String outFile = "20171030-am-tweets.json";
    @Parameter(names = {"-b", "--begin-timestamp"},
               description = "Begin time, as a timestamp (YYYYMMddHHmm), e.g. 201703270930 is 9:30am, 27th March 2017")
    private String beginTimeStr = "201710300630";
    @Parameter(names = {"-e", "--end-timestamp"},
               description = "End time, as a timestamp (YYYYMMddHHmm), e.g. 201703270930 is 9:30am, 27th March 2017")
    private String endTimeStr = "201710300930";
    @Parameter(names = {"-c", "--tweet-count"}, description = "Number of tweets to generate")
    private Integer tweetCount = 100;
    @Parameter(names = {"-uc", "--users-count"}, description = "Number of users to generate if they don't exist")
    private Integer userCount = 100;
    @Parameter(names = {"--regenerate-users"}, description = "Regenerate users. NB will wipe users file! (default: false)")
    private boolean regenerateUsers = false;
    @Parameter(names = {"-v", "--verbose"}, description = "Verbose logging mode (default: false)")
    private static boolean verbose = false;

    @Parameter(names = {"-h", "-?", "--help"}, description = "Help (default: false)")
    private static boolean help = false;

    private final ObjectMapper json = new ObjectMapper();
    private final int[][] userCounts = new int[4][];
    private final Map<String, Random> randoms = Maps.newHashMap();
    private final RandomDate randomEstabDate = new RandomDate(
        LocalDate.of(2006, 6, 1), // early in Twitter's history
        LocalDate.now().minus(6, ChronoUnit.MONTHS)
    );

    public Main () {
        setupRandomGenerators();
        setupUserCounts();
    }


    private void setupRandomGenerators() {
        for (String name : asList(
            "favorites_count", "favorited", "msgIndices", "userIndices", "id", "quote_count", "reply_count",
            "retweet_count", "user_id", "name_parts", "screen_name_parts", "activity_level", "counts",
            "boolean", "default_profile", "famous", "colour", "images", "isProtected", "isVerified", "source"
        )) {
            randoms.put(name, new Random());
        }
    }
    private void setupUserCounts() {
        // I'm sure there's a much more clever way to do this, and research on classes of Twitter users
        Random r = randoms.get("counts"); // relies on setupRandomGenerators() being called first
        userCounts[0] = new int[]{ // light user
            3 + r.nextInt(7), // follower_count
            10 + r.nextInt(30), // friend_count
            1 + r.nextInt(5), // listed_count
            10 + r.nextInt(30), // favourites_count
            10 + r.nextInt(30), // statuses_count
        };
        userCounts[1] = new int[]{ // moderate user
            200 + r.nextInt(300), // follower_count
            400 + r.nextInt(600), // friend_count
            3 + r.nextInt(7), // listed_count
            500 + r.nextInt(250), // favourites_count
            100 + r.nextInt(300), // statuses_count
        };
        userCounts[2] = new int[]{ // heavy user
            500 + r.nextInt(4500), // follower_count
            1000 + r.nextInt(1000), // friend_count
            10 + r.nextInt(10), // listed_count
            1000 + r.nextInt(1000), // favourites_count
            750 + r.nextInt(750), // statuses_count
        };
        userCounts[3] = new int[]{ // famous user
            5000 + r.nextInt(10000), // follower_count
            10 + r.nextInt(90), // friend_count
            10 + r.nextInt(30), // listed_count
            10 + r.nextInt(30), // favourites_count
            1000 + r.nextInt(1000), // statuses_count
        };
    }

    public static void main(String[] args) throws IOException {
        final Main theApp = new Main();

        // JCommander instance parses args, populates fields of theApp
        JCommander argsParser = JCommander.newBuilder()
            .addObject(theApp)
            .programName("bin/tweets-generator[.bat]")
            .build();
        if (args.length == 0) {
            help = true;
        } else {
            try {
                argsParser.parse(args);
            } catch (ParameterException e) {
                System.err.println("Unknown argument parameter:\n  " + e.getMessage());
                help = true;
            }
        }

        final LocalDateTime beforeDT = LocalDateTime.from(ARGUMENT_TIMESTAMP_FORMAT.parse(theApp.beginTimeStr));
        final LocalDateTime endDT = LocalDateTime.from(ARGUMENT_TIMESTAMP_FORMAT.parse(theApp.endTimeStr));
        if (help || endDT.isBefore(beforeDT)) {
            StringBuilder sb = new StringBuilder();
            argsParser.usage(sb);
            System.out.println(sb.toString());
            System.exit(-1);
        }

        theApp.run();
    }

    public void run() throws IOException {

        System.out.println("Generating random tweets");
        final List<String> messages = Files.readAllLines(Paths.get(messagesFile));

        final List<User> users = loadOrCreateUserProfiles(); // from or into usersFile

        final TemporalAccessor start = ARGUMENT_TIMESTAMP_FORMAT.parse(beginTimeStr);
        final TemporalAccessor stop = ARGUMENT_TIMESTAMP_FORMAT.parse(endTimeStr);

        reportConfiguration(start, stop);

        final List<String> timestamps = distributeTweetTimes(start, stop, tweetCount);
        final List<Tweet> tweets = generateTweets(messages, users, timestamps);

        try (BufferedWriter out = Files.newBufferedWriter(
            Paths.get(outFile),
            StandardCharsets.UTF_8,
            StandardOpenOption.CREATE, StandardOpenOption.WRITE
        )) {
            int i = 0;
            for (Tweet t : tweets) {
                i++;
                out.write(json.writeValueAsString(t));
                out.write('\n');
                if (i % 100 == 0)
                    out.flush();
            }
        }
        System.out.println("DONE. Tweets written to " + outFile);
    }

    private List<User> loadOrCreateUserProfiles() throws IOException {

        if (Files.exists(Paths.get(usersFile)) && !regenerateUsers) {
            final AtomicInteger lineNumber = new AtomicInteger();
            return Files.readAllLines(Paths.get(usersFile)).stream()
                .filter(l -> l.trim().length() > 0)
                .map(l -> {
                    lineNumber.incrementAndGet();
                    try {
                        return Optional.of(json.readValue(l, User.class));
                    } catch (IOException e) {
                        System.err.printf("Failed to parse JSON: %s:%d\n%s", usersFile, lineNumber.get(), l);
                        return Optional.empty();
                    }
                }).filter(o -> o.isPresent())
                .map(x -> (User) x.get())
                .collect(Collectors.toList());
        } else {
            if (verbose) System.out.println("Generator users file: " + usersFile);
//            final List<User> users = Lists.newArrayList();
//
//            for (int i = 0; i < userCount; i++) {
//                users.add(generateUser());
//            }
            final List<User> users = IntStream.range(0, userCount)
                .mapToObj(i -> generateUser())
                .collect(Collectors.toList());

            try (final BufferedWriter out = Files.newBufferedWriter(
                Paths.get(usersFile),
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.WRITE
            )) {
                for (User u : users) {
                    out.write(json.writeValueAsString(u));
                    out.write('\n');
                }
                out.flush();
            }

            return users;
        }
    }

    private User generateUser() {
        final Long id = Utils.generateID(randoms.get("user_id"));
        final String name = buildName();
        final String screenName = cleanSN(name);

        if (verbose) System.out.println("Generating @" + screenName + " from " + name);

        final String location = Utils.pickOne(Resources.LOCATIONS);
        final String descPart1 = Utils.pickOne(Resources.DESCRIPTIONS);
        final String descPart2 = Utils.pickOne(Resources.DESCRIPTIONS);
        final String description = Utils.getHalfString(descPart1) + " " + Utils.getHalfString(descPart2);
        final Boolean isProtected = Range.open(0,1).contains(nextInt("isProtected", 100)); // 1% protected
        final Boolean isVerified = Range.open(0,5).contains(nextInt("isVerified", 100)); // 5% protected
        final ZonedDateTime estabTimestamp = Utils.toZDT(randomEstabDate.nextDate().atStartOfDay());
        final long daysActive = LocalDate.now().toEpochDay() - estabTimestamp.toLocalDate().toEpochDay();

        final int activityLevel = randoms.get("famous").nextInt(1000) == 0 // 1 in 1000
            ? 3 // famous
            : nextInt("activity_level", 3);
        final Boolean defaultProfile = activityLevel == 0 ||
            activityLevel == 1 && randoms.get("default_profile").nextBoolean();

        final String profileBGPicURL = Utils.pickOne(Resources.BG_PIC_URLS, randoms.get("images"));
        final String profileBGHttps = profileBGPicURL.replace("http:", "https:");
        final String profilePicURL = Utils.pickOne(Resources.PROFILE_PIC_URLS, randoms.get("images"));
        final String profilePicHttps = profilePicURL.replace("http:", "https:");
        final String profileBannerURL = Utils.pickOne(Resources.PROFILE_BANNER_URLS, randoms.get("images"));

        final String url = Utils.pickOne(Resources.URLS);

        return new User(
            id, // id
            Long.toString(id), // id_str
            name, // name
            screenName, // screen_name
            location, // location
            url, // url
            description, // description
            null, // derived
            isProtected, // isProtected
            isVerified, // verified
            rateByTime(userCounts[activityLevel][0], daysActive), // followers_count
            rateByTime(userCounts[activityLevel][1], daysActive), // friends_count
            rateByTime(userCounts[activityLevel][2], daysActive), // listed_count
            rateByTime(userCounts[activityLevel][3], daysActive), // favourites_count
            rateByTime(userCounts[activityLevel][4], daysActive), // statuses_count
            TWITTER_TIMESTAMP_FORMAT.format(estabTimestamp), // created_at
            36000, // utc_offset
            "Adelaide", // time_zone
            randoms.get("boolean").nextBoolean(), // geo_offset
            "en", // lang
            false, // contributors_enabled
            Utils.randomColour(randoms.get("colour")), // profile_background_color
            profileBGPicURL, // profile_background_image_url
            profileBGHttps, // profile_background_image_url_https
            randoms.get("boolean").nextBoolean(), // profile_background_tile
            profileBannerURL, // profile_banner_url
            profilePicURL, // profile_image_url
            profilePicHttps, // profile_image_url_https
            Utils.randomColour(randoms.get("colour")), // profile_link_color
            Utils.randomColour(randoms.get("colour")), // profile_sidebar_border_color
            Utils.randomColour(randoms.get("colour")), // profile_sidebar_fill_color
            Utils.randomColour(randoms.get("colour")), // profile_text_color
            randoms.get("boolean").nextBoolean(), // profile_use_background_image
            defaultProfile, // default_profile
            randoms.get("boolean").nextBoolean(), // default_profile_image
            null, // withheld_in_countries
            null // withheld_scope
        );
    }

    private String buildName() {
        final String name =
            Utils.pickOne(Resources.NAME_PARTS, randoms.get("name_parts")) + " " +
            Utils.pickOne(Resources.NAME_PARTS, randoms.get("name_parts"));
        // Names can be up to 20 characters long - https://support.twitter.com/articles/127871
        return name.length() > 20 ? name.substring(0, 20) : name;
    }

    private String cleanSN(final String sn) {
        // Up to 15 letters, numbers and underscores only - https://support.twitter.com/articles/101299
        String validChars = sn.replaceAll("[^a-zA-Z0-9_]", "_");
        return (validChars.length() > 15) ? validChars.substring(0, 15) : validChars;
    }

    private int rateByTime(final int ratePerYear, final long days) {
        return (int) Math.floor((ratePerYear / 365.0) * days);
    }

    private int nextInt(final String key, final Integer upper) {
        return randoms.get(key).nextInt(upper);
    }

    private List<Tweet> generateTweets(
        final List<String> messages,
        final List<User> users,
        final List<String> timestamps
    ) {
        return timestamps.stream().map(createdAt -> {
            final String message = Utils.pickOne(messages, randoms.get("msgIndices"));
            final User user = Utils.pickOne(users, randoms.get("userIndices"));

            return makeTweet(user, message, createdAt);
        }).collect(Collectors.toList());
    }

    private Tweet makeTweet(final User user, final String message, final String createdAt) {
        int favouritesCount = nextInt("favorites_count", maxFaveCount);
        boolean favouritedOrNot = favouritesCount > 0;
        int quoteCount = nextInt("quote_count", maxQuoteCount);
        int replyCount = nextInt("reply_count", maxReplyCount);
        int retweetCount = nextInt("retweet_count",maxRetweetCount);
        boolean retweetedOrNot = retweetCount > 0;
        boolean truncated = false;
        boolean withheldCopyright = false;
        String source = Resources.SOURCES.get(nextInt("source", Resources.SOURCES.size()));
        long id = Utils.generateID(randoms.get("id"));
        return new Tweet(
            null, // coordinates
            createdAt, // created_at
            null, // current_user_retweet
            createEntities(message), // entities
            createExtendedEntities(message), // extended_entities
            favouritesCount, // favorites_count
            favouritedOrNot, // favorited
            "low", // filter_level (none, low, medium)
            Collections.emptyMap(), // geo
            id, // id
            null, // in_reply_to_screen_name
            null, // in_reply_to_status_id
            null, // in_reply_to_status_id_str
            null, // in_reply_to_user_id
            null, // in_reply_to_user_id_str
            false, // is_quote_status
            Long.toString(id), // id_str
            "en", // lang
            null, // matching_rules
            null, // place
            null, // possibly_sensitive
            quoteCount, // quote_count
            null, // quoted_status
            null, // quoted_status_id
            null, // quoted_status_id_str
            replyCount, // reply_count
            retweetCount, // retweet_count
            retweetedOrNot, // retweeted
            null, // retweeted_status
            null, // scopes
            source, // source
            message, // text
            truncated, // truncated
            user, // user
            withheldCopyright, // withheld_copyright
            null, // withheld_in_countries
            null // withheld_scope
        );
    }

    private Map<String, ?> createEntities(final String message) {
        final Map<String, List<Extractor.Entity>> entities = Maps.newTreeMap();
        Extractor e = new Extractor();
        entities.put("hashtags", e.extractHashtagsWithIndices(message));
        entities.put("urls", e.extractURLsWithIndices(message));
        entities.put("user_mentions", e.extractMentionedScreennamesWithIndices(message));
        entities.put("media", Lists.newArrayList());
        entities.put("symbols", Lists.newArrayList());
        entities.put("polls", Lists.newArrayList());
        return entities;
    }

    private Map<String, ?> createExtendedEntities(final String message) {
        final Map<String, List<Extractor.Entity>> entities = Maps.newTreeMap();
        entities.put("media", Lists.newArrayList());
        return entities;
    }

    private List<String> distributeTweetTimes(
        final TemporalAccessor start,
        final TemporalAccessor stop,
        final Integer tweetCount
    ) {
        final ZonedDateTime startZDT = Utils.toZDT(LocalDateTime.from(start));
        final ZonedDateTime stopZDT = Utils.toZDT(LocalDateTime.from(stop));
        if (verbose) {
            System.out.printf("Generating %d tweet times\n", tweetCount);
            System.out.printf("ZDT1 (start): %s\n", startZDT);
            System.out.printf("ZDT2 (stop) : %s\n", stopZDT);
        }
        final long meanDelay = (stopZDT.toEpochSecond() - startZDT.toEpochSecond()) / tweetCount;

//        final List<String> timestamps = Lists.newArrayList();
        final AtomicLong secondsSinceStart = new AtomicLong();//0L;
        final List<String> timestamps = IntStream.range(0, tweetCount).mapToObj(i -> {
            final ZonedDateTime newTimestamp = startZDT.plus(secondsSinceStart.getAndAdd((long) PoissonGenerator.getNext(meanDelay)), ChronoUnit.SECONDS);
//            secondsSinceStart.getAndAdd((long) PoissonGenerator.getNext(meanDelay));
//            timestamps.add(TWITTER_TIMESTAMP_FORMAT.format(newTimestamp));
//            secondsSinceStart += (long) PoissonGenerator.getNext(meanDelay);
            return TWITTER_TIMESTAMP_FORMAT.format(newTimestamp);
        }).collect(Collectors.toList());
//        for (int i = 0; i < tweetCount; i++) {
//            final ZonedDateTime newTimestamp = startZDT.plus(secondsSinceStart, ChronoUnit.SECONDS);
//            timestamps.add(TWITTER_TIMESTAMP_FORMAT.format(newTimestamp));
//            secondsSinceStart += (long) PoissonGenerator.getNext(meanDelay);
//        }
        return timestamps;
    }

    private void reportConfiguration(TemporalAccessor start, TemporalAccessor stop) {
        final String startTS = TWITTER_TIMESTAMP_FORMAT.format(Utils.toZDT(LocalDateTime.from(start)));
        final String stopTS = TWITTER_TIMESTAMP_FORMAT.format(Utils.toZDT(LocalDateTime.from(stop)));

        System.out.println("Tweet Generator");
        System.out.printf("- Messages file: %s\n", messagesFile);
        System.out.printf("- Users file: %s\n", usersFile);
        System.out.printf("- Output file: %s\n", outFile);
        System.out.printf("- Tweets to generate: %d\n", tweetCount);
        System.out.printf("- Start timestamp: %s\n", startTS);
        System.out.printf("- End timestamp: %s\n", stopTS);
        System.out.printf("- Verbose mode: %s\n", verbose ? "ON" : "OFF");
    }
}
