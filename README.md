# tweets-generator

Author: **Derek Weber**

Last updated: **2017-10-31**

A tool to mock up tweets and Twitter profiles for datasets.


## Description

This app generates tweets based on a file of messages to use as tweet content. It will
use user profiles provided to it, or generate its own, and will generate `created_at`
values over a given period, provided start and stop timestamps are provided (over the
current 24 hour period is used as a default).

### Acknowledgements

Thank you to Project Gutenberg for the text of Lewis Carroll's 
[Alice in Wonderland](https://www.gutenberg.org/files/11/11-h/11-h.htm), which was used
as test data.

## Requirements:

 + Java Development Kit 1.8
 + [FasterXML](http://wiki.fasterxml.com/JacksonHome) (Apache 2.0 licence)
 + [Google Guava](https://github.com/google/guava) (Apache 2.0 licence)
 + [jcommander](http://jcommander.org) (Apache 2.0 licence)

Built with [Gradle 4.2](http://gradle.org), included via the wrapper.


## To Build

The Gradle wrapper has been included, so it's not necessary for you to have
Gradle installed - it will install itself as part of the build process. All that
is required is the Java Development Kit.

By running

`$ ./gradlew installDist` or `$ gradlew.bat installDist`

you will create an installable copy of the app in `PROJECT_ROOT/build/tweets-generator`.


## Usage
If you've just downloaded the binary distribution, do this from within the
unzipped archive (i.e. in the `tweets-generator` directory). Otherwise, if you've
just built the app from source, do this from within
`PROJECT_ROOT/build/install/tweets-generator`:

<pre>
Usage: bin/tweets-generator[.bat] [options]
  Options:
    -b, --begin-timestamp
      Begin time, as a timestamp (YYYYMMddHHmm), e.g. 201703270930 is 9:30am,
      27th March 2017
      Default: 201710300630
    -e, --end-timestamp
      End time, as a timestamp (YYYYMMddHHmm), e.g. 201703270930 is 9:30am,
      27th March 2017
      Default: 201710300930
    -h, -?, --help
      Help (default: false)
      Default: false
    -m, --messages-file
      File of tweet contents, one message per line
      Default: messages.json
    -o, --out-file
      File to which to write generated tweets, one tweet per line
      Default: 20171030-am-tweets.json
    --regenerate-users
      Regenerate users. NB will wipe users file! (default: false)
      Default: false
    -c, --tweet-count
      Number of tweets to generate
      Default: 100
    -uc, --users-count
      Number of users to generate if they don't exist
      Default: 100
    -u, --users-file
      File of user profiles, one JSON object per line
      Default: users.json
    -v, --verbose
      Verbose logging mode (default: false)
      Default: false
</pre>

Run the app, requesting user profiles be regenerated (into `my-users.json`):
<pre>
prompt> bin/tweets-generator -m data/alice-in-wonderland-snippets.txt \
  --begin-timestamp 201711200830 --end-timestamp 201711201730 \
  --out-file 20171120-am-10k.json \
  --regenerate-users \
  --users-file my-users.json \
  --users-count 150 \
  --tweet-count 10000 \
  --verbose
</pre>

This will create a file `20171020-am-10k.json` containing 10,000 tweets, as
one JSON object per line. It will also create a file `my-users.json` with 150 user
profiles (one JSON object per line).

