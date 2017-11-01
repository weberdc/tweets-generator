package org.dcw.twitter.generator;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Resources used in the creation of the tweets and Twitter profiles. These are taken from real tweets or
 * invented and then are randomly distributed and munged (split and combined) as needed.
 */
public class Resources {
    static final List<String> LOCATIONS = asList("Adelaide", "Salisbury", "Noarlunga", "Port Adelaide", "The Moon",
        "My Living Room", null
    );
    static final List<String> NAME_PARTS = asList(
        "#BankRC","#Crime","#someprivacyplease","(((Bee's",".michelle","::Sovereign:colons::","Snoozy","Cloud","Star","Russia",
        "Heart","Coffee","100%Chelsea","6UNTR01","A","Aamer","ABC","according","ACT","Ada","ainsindahouse","Ajaxx","Ajay",
        "AK47","Alain","Alan","Alex","ALEX","All","Ambiguous","AMOS","AMSI","Andre","André","Andrew","Andy","Angela",
        "AngryWhiteTurbine","Anne","Anthony","Antigone","ap:tronym","Arabella","ARCCSS","Arduino:","Ashley","Astrid",
        "Aust","Axel","AYCC","BA'AL","backstreet","Barbara","BarbaraQ","Beau","Beck","Becky","Belle","Ben",
        "Beneviolent","Benjamin","Beth","bewildered","BigAl","Bill","Bj","Black","Blake","Blue","bman","BonyRabbit",
        "BonzaiMoon","BooksChatter","bourkie","Brandon","Brendan","Brian","Bridget","Bruno","Cablehorn","Calmette",
        "CaptClare","Carmen","Carmine","Carolyn","Cat","Catching","Census","Checkmate","Cheryl","childrensbook",
        "Chloe","Choo","choosing","chris","Chris","Čhrɨs:Ḋųçḱèŧŧ","Christian","christine","Christine","Christopher",
        "ciaomichaella","Claude","Clifton","Climate","Col","Colin","Commissioner","commoncents","Comrade","Com-rade:",
        "Cornhuskin'","CornwallProtect","CrackerNut_Ebooks","Craig","Crispin","Curmudgeon","CuteYoungAndStupid","Cyber",
        "D","d.b.","Daily","Dame","DameJenntheAmazing","Damien","Dan","Dana","Daniel","Daria","Darren","DarrenWheels",
        "Dave","David","DBClisby","Deb","Debbie","DebLamb","DelCon","Denise:C","Dennis","Descartes","Diana","Dont","Dr",
        "Dr.","Drew","dsch_78","Econodel","Ecopolitics&Freedom","EdMed","Edward","Elaine","Elisabeth","Elizabeth",
        "Emilie","Emily","Emma","Emperor","Energy","Enn","Environmental","Erin","Esquillo","Euthyphro","Ewan","Ewart",
        "Ewster","Fair&Justified","Farty","Feral","Fin","Finnigans","Fiona","Frances","Frantic","Free","Freyr","From",
        "Function/Form","Furball","gail","Gail","Gee","Gerard","Gibbsy","GillM","Glengyron","Glenys","Goblin","Graeme",
        "Graham","Grant","Greens","GreensNthernBeaches","Gry","Guy","Hannele","HARPERHP","Hayley","Heather","Henmaroo",
        "Heterodox","HoneymoonGondol","HotCoffee4me","Hugh","HUMANIST","Hy-sterical","Ian","Iceberg","Iconoclast",
        "iDrew","I'maLeftie","InfidelAngel:","Ingrid","Initially","InnovationScienceAu","Inspiring","Irritable",
        "Isabel","Islamic","Ivy","Jacinta","James","Jane","Janine","Jannine","Jarred-1337:no.,soul","Jasmine","Jason",
        "Jaymz","Jeff","Jen","Jennifer","Jenny","Jess","jill","JILL","JLWhitaker","JM","john","John","Johnny","Jordan",
        "Josh","Joshua","judywilkins","Julie","Julius","Jurgis","Just","JustSuicidePrevent","JWSpry","Kaden","kate",
        "Kate","Katey","Kathie","kathy","Kathy","Katie","Kaye","kaylene","KBG","Keep","Keith","Ken","Kenny","Kerry",
        "kezz","Kim","kirsten","knedo","L","Lady","LadyBatGirlKimberley","Larry","Latte-Sipping:","Lauda","Leanne",
        "Leigh","leon","Lesley","LibraThatsMe","Lick","lifes","Lilla","Lily","Linda","Little","LKMEB","LogicallyLeft",
        "Lord","Lorraine","luciferal","Luke","Lyn","Lynda","Mad","MadWitchWithaStick","Magma","Malcolm","Mall","Marc",
        "Margaret","Maria","marie","Marius","mark","Mark","Marlow","Martin","Mary","Mary-Ann","Mathematicians","Matt",
        "Matteo","Matthew","Mauler","Maureen","mdavidson","Meanwhile","Media","Meg","Megan","meinesichtderdinge",
        "Melbourne","Melissa","mephisto","Mercurius","Mhathuna","michael","Michael","Michal","Michelle","Midnight",
        "miguel","Mike","Miku","Milorad","Mish","Mitzie","Moi","Monique","Mountain","MrsPlumz","MrsSOS","Ms","MSM",
        "Nancy","Natalie","NationalScienceWeek","NAU","Naveen","Neil","Nick","Nigel","Niniola","Nisha","Noel",
        "NoResponsiblityTaken","Not","O_O","Off","Oh","ONLY_looking","Opportunity","Order","Oz","OzPM","Paige",
        "PamelaH","pansoph00","Pat","Patricia","Paul","paula","PC","peachpurpleblue","Perorationer","petebergs","Peter",
        "PFH007","Philip","Pint","Pistolbuttsatwinkle","PolicyInnoHub","Politico","Positively","Powerglobal","Prince",
        "princess","Princess","Private","Prof","progold","Proven","PT","punchumgum","Qld_ScienceWeek","Queensland",
        "R&G","Rachel","Raibeart","Ray","Raylene","Rebecca","Reclaim","red","Redeeming","Reds","Reezy","Regina",
        "reneb43","Review","Rhona","Rhonda","Rhys","Rick","RN","Robert","Robin","Rock","Rod","Roger","ron","Rory",
        "rosalie","Rosemary","Ross","RottnestWindTurbine","RupesBillyTeaParty","sally","Sam","SanctimoniousTweetyB",
        "sandy","Sarah","Sardar","Science","sciencegovau","Scott","ScreenMediaVU","Sean","Shane","sharon","Sharon",
        "Shayne","She","Shea","sheila","Shuan","Simon","sipawe","Sir","sixteensixteen","slooshai","Smile","Soapbox",
        "Sophie","Southern","SRPassesItOn","Stacy","STEMpunk","Stephanie","steve","Steve","Steven","Stewart",
        "Stillriver1983","Streets-of-Tears","Stuart","Sue","Suede","Sujanya","Summer","Sun","Sunny","Susanne","Sydney",
        "Take","Tamara","Tanya","Tara","Taxed","TaylahTalk","Taylor","tazmac","TC","Ted","Televised","The",
        "theyjustare","Think","Thyme","Tiff","Tim","TiPoole","Toasted","Tom","Tomtom","Tony","Trent","TruthSeeker",
        "tryingtounderstand","TurnLeft","Tweetheart","UK","Um,","una","UpYoursJack","UTS","Val.","Vale",
        "vegemiteblonde","Victor","Victoria","Volt-aire's:","VroomVroomVroom","walabytrack","watthefu?!","wendy",
        "Wendy","WeNeedToWakeUp","NickAndrew","Western","who","Will-Ie:","willy","WingecarribeeReconc","Winston",
        "wobbie","Wolf","Woman","Writer","WryBry","Yale","yanne","Yixiang","YokohamaGirl","YORICO","Zac","Zappagore",
        "Zelda","zippy","Zlatko","Zoe","Zvyozdochka","Barepnr","Mapnha"
    );
    static final List<String> URLS = asList(
        "http://BooksChatter.blogspot.co.uk/",
        "http://climatism.wordpress.com/",
        "http://cornwallprotect.org",
        "http://drgan.org",
        "http://favstar.fm/users/WryBry",
        "http://freetobelieve.com/",
        "http://instanttechnology.com.au/blog",
        "http://janwhitaker.com/",
        "http://linkd.in/A7uuxO",
        "http://nau.edu/",
        "http://nswu.academia.edu/PaulByron",
        "http://page.is/catching-up",
        "http://researchers.uq.edu.au/researcher/397",
        "http://science.uts.edu.au",
        "http://twitter.com/elichrusos",
        "http://www.abc.net.au/tv/qanda/",
        "http://www.allaboutthetea.com",
        "http://www.amazon.com/Ross-Lloyd/e/B00AGSV0ZA/ref=sr_ntt_srch_lnk_1?qid=1355171182&sr=1-1",
        "http://www.davidkindon.com.au",
        "http://www.instagram.com/captclare",
        "http://www.jsp.education",
        "http://www.powerglobal.us",
        "http://www.properliberal.com",
        "http://www.rhysward.tumblr.com",
        "http://www.scienceweek.net.au/",
        "http://www.slideshare.net/mobile/TinaTinde",
        "http://www.smart.org.au",
        "http://www.sophieellenthomas.wordpress.com",
        "http://www.threecornerjack.com/bibelots",
        "http://www.twitter.com/ciaomichaella",
        "https://musiconthemindblog.wordpress.com/",
        "https://pfh007.com/",
        "https://www.linkedin.com/in/stacy-slotnick-esq-50420795",
        "https://www.youtube.com/channel/UCI2TT-G1jJ0VPQPgPnr3sOw",
        null
    );
    static final List<String> DESCRIPTIONS = asList(
        "#Reviews, Author Q&As, #Giveaways, Features, Paavo's Pix-musings & picture journeys celebrating literature & art",
        "// murphamy and malec // Phan // Becky Lynch & Bayley //",
        "° Investment in Social Capital = Social Harmony ° Human Rights ° Southern Highlands ° Tharawal Land ° NSW Australia",
        "20. Student at @WarwickHistory. Moving to America on August 20. Bit of a social media fiend. I'll do what I have to do to win.",
        "a lover of words, art, sounds, stories, science, photography, beauty, humanity and whimsy",
        "Aging and sometimes passionate leftie - still irrationally hopeful about the future?",
        "All About The Tea is your #1 #RealityTv GOSSIP Site for #CelebrityGossip #RHOA #RHONJ #RHONY #RHOBH #RHOC #SisterWives #TeenMom2 \nEmail: tips@allaboutthetea.com",
        "anti-islam, anti-religion, true feminist, pro human rights& freedom of speech",
        "Aussie // @hitRECord Curator & Community Moderator",
        "Australia's National Science Week: 13 - 21 August, 2016 #natsciwk",
        "Cf app Thorium remix\nfor doco's on\nSafe+Small+FactoryMade+Cheap LIQUID-FUEL Molten Salt Reactors;\nWatch: ThorCon Power, Terrestrial Energy, & TransAtomic Power",
        "Chocoholic Fangirl (Bones, TWD, GoT, Doctor Who, Arrow, etc) Loves live tweeting, tv, spoilers, books, social media Lost Dad to cancer 8/16/14",
        "Conservitive Catholic cranky old cracker love America its founding principles and they way we were tend to curse at times Love anything with 4 legs",
        "DelCon. Everything I tweet is completely true, there's no need to contradict me because you would be wrong.",
        "Designer | Content Creator | Leader of EZ Studios @EZ__United | Portfolio: http://ajaxxdzn.carbonmade.com #TeamMystic",
        "Entertainment lawyer ~ PR pro ~ http://huffingtonpost.com http://allaboutthetea.com http://thefashionlaw.com http://urbangeekz.com writer ~ joyful/grateful gal",
        "Fall '15 #Ukraine @osce_odihr. @UN peacekeeping #Cambodia @refugees #Serbia @the_IDB in DC. @UMJSchool grad. Human rights #openness #diversity. Ur voice counts!",
        "Father of two girls. Researcher and Lecturer at @Sydney_Uni. Tweet with English and Chinese. \nTweets are my own views.",
        "Forensic social anthropologist. Population Health. #SDOH. #NativeTitle. Central & SE Australia. GIS. SNA. Consilience. Personal account. RT≠endorsement",
        "Former Naval Officer, long-term Canberra health advocate, now Navel Gazer. Mixing art with advocacy, see here http://bit.ly/L2q3vYIt's a dog eat dog world.",
        "Gomeroi, Wiradjuri; lefty, greenie; german shepherds; performing arts, arts; vocational education & training, course writer; forever freo",
        "gulag administrator",
        "hack",
        "I live in the Yarra Valley with my husband and daughter. I'm a bookkeeper who loves baking, gardening, beekeeping and Dr Who. I'd love to write a book one day.",
        "I try & try but I can't get my eyebrows to match. I smart in real life, on Twitter ehh, maybe-maybe not. Skin Cancer happens,hiding the scars is hard-NO TAN!",
        "I write books: http://janwhitaker.com/?page_id=8 , chat politics, women's issues, social justice, artist, music, movie buff, NO Bigots RT not neces endorsemt",
        "In Searching For A New Enemy To Unite Us, We Came Up With The Threat Of Global Warming - The Club Of Rome (Environmental consultants to the UN)",
        "Infuriated by crimes against women & children, usually by Islamists. Author of Soul Saviour, GET EMILY & For Anastasia https://www.facebook.com/SoulSaviourRyan",
        "insert witty comment here",
        "Just a humble engineer",
        "Keen on gender dialogues,vawc,diversity,music,art,news junkie,veer left. I RT stuff that may be of interest. Twitter-wit & the unexpected keeps me cheerful.",
        "Live free or die! Death is not the worst of evils! MutualFollow! MutualBlock!",
        "Mammal ecologist, conservation scientist at University of Qld, fan of permaculture, oversexed marsupials, Melanesian & Australian nature,  & scientific evidence",
        "nihil, nihilque        ..       Plagiarist",
        "Nothing is certain in life, except everything changes and nothing stays the same",
        "Old fart that wakeboards and kneeboards.Lefties and greenies not on my Christmas card list.",
        "On #QandA the audience asks the questions. Join the conversation live from 9:35pm AEST. This account is about your opinions, not ours.",
        "Organic Marriage predates the state by thousands of years and is a vital component of civil society",
        "Prince of Havoc | Demon Hunter | WoW Lore Enthusiast | Follow for Legion updates and screenshots! #Legion",
        "Professional Progressive BS Detector",
        "Researcher of sexualities, sexual health/safeties, digital intimacies, friendship, social media, gender, young people, peer-based knowledges.",
        "Scientist. Her pig-headed enthusiasm to be wronged remains unconscionable.",
        "Seeking to protect Cornwall's landscape and communities from damaging wind and solar developments.\nOther opinions my own.",
        "Snark and laughter is all I'm after. Please be 18+ (in years). In maturity?",
        "Sometimes dope sometimes ignant",
        "Sometimes, when brain-ceĺls collide, they produce sparks which I like to call tweets.\nWinery Electronics design / Consulting design.",
        "Taking the politics out of maths one tweet at a time or is that vica versa?  #mathsparty #sharemathsharelife Maths. It's a mind game.",
        "Tech Guy, Nerd @growthwise #Vend and #Kounta installer. Read more about problems I solve & IT I dabble in here: http://tinyurl.com/zw4cl57 #Snapchat: beaug-87",
        "The Conservative Voice in Global News Following @realDonaldTrump @TrumpWH2016, @Brexit @LeaveEU @TonyAbbott CEO http://www.powerglobal.us \nFollow @powerglobalus",
        "The cracks in the jigsaw must be filled by community education. SP message is one of hope.  Catherine aka Heidi. Crisis line counsellor, ex farm, puppy owner.",
        "The Glass Pyramid - Transmitting on random frequencies to no fixed schedule Click here to read TGP http://www.pfh007.com",
        "The official Twitter account for Northern Arizona University and your guide to life in Lumberjack Country.  Contact us at social@nau.edu. Snapchat @nausocial.",
        "traveller, hiker, buddhist, vegan",
        "Using MEG to understand whats going on in the brain while people are imagining music;                           Part time PhD student; Full time mum. #scicomm",
        "UTS: Science is research-driven, relevant, innovative and practical CRICOS Provider No: 00099F",
        "Working at the tissue between truth and paranoia....",
        "WoW Player | Demon Hunter | Archeologist | In general just a bad human being with low self esteem. Wanna find some artifacts?",
        "writer/director/producer. check out my upcoming film @TheHappysMovie",
        "Your life; your choice. Progressive, evidence based policy, science, rule of law, @aussexparty and above all else decency. Dogma free zone. liberal, NOT Liberal",
        "MORON LABE! Conservative Constitutional Preservationist. USMC Mom and Wife, Heritage Action Sentinel, Common sense practitioner. All opinions are my own...",
        null
    );
    static final List<String> BG_PIC_URLS = asList(
        "http://abs.twimg.com/images/themes/theme1/bg.png",
        "http://abs.twimg.com/images/themes/theme11/bg.gif",
        "http://abs.twimg.com/images/themes/theme12/bg.gif",
        "http://abs.twimg.com/images/themes/theme14/bg.gif",
        "http://abs.twimg.com/images/themes/theme3/bg.gif",
        "http://abs.twimg.com/images/themes/theme4/bg.gif",
        "http://abs.twimg.com/images/themes/theme7/bg.gif",
        "http://abs.twimg.com/images/themes/theme9/bg.gif",
        "http://pbs.twimg.com/profile_background_images/114587384/KeatinStiiting.jpg",
        "http://pbs.twimg.com/profile_background_images/378800000133160167/wAFYQ41_.jpeg",
        "http://pbs.twimg.com/profile_background_images/451914299154255873/NME2KnHQ.png",
        "http://pbs.twimg.com/profile_background_images/5258513/twitter_bg3.gif",
        "http://pbs.twimg.com/profile_background_images/550234773688295425/HO8KUBCq.jpeg",
        "http://pbs.twimg.com/profile_background_images/602484377046552576/3Jq0TtCc.jpg",
        "http://pbs.twimg.com/profile_background_images/605325427767308288/YVI7ebPr.jpg",
        "http://pbs.twimg.com/profile_background_images/623832503204184064/IMkJY8nR.jpg",
        "http://pbs.twimg.com/profile_background_images/660882977/9bsxiihhrjxe00dhe3e2.jpeg",
        "http://pbs.twimg.com/profile_background_images/664208261/92986531d2343e8aa60787d50d2d64cb.jpeg",
        "http://pbs.twimg.com/profile_background_images/676087305/fd43dee9af76f38ae2be9c1b14b3ec37.jpeg",
        "http://pbs.twimg.com/profile_background_images/689612234058674176/R1sEOqCU.jpg",
        "http://pbs.twimg.com/profile_background_images/692307636/12e7b7866aa55f0d29b1f1b7a1b6e11f.jpeg"
    );
    static final List<String> PROFILE_PIC_URLS = asList(
        "http://abs.twimg.com/sticky/default_profile_images/default_profile_1_normal.png",
        "http://pbs.twimg.com/profile_images/106641011/YouYangs_normal.jpg",
        "http://pbs.twimg.com/profile_images/1361952452/nswk_twitter_icon_normal.gif",
        "http://pbs.twimg.com/profile_images/1398228973/image_normal.jpg",
        "http://pbs.twimg.com/profile_images/1535278944/n_8_th_normal.gif",
        "http://pbs.twimg.com/profile_images/1580645679/__________normal.jpg",
        "http://pbs.twimg.com/profile_images/1980262911/naulogo_only_normal.jpg",
        "http://pbs.twimg.com/profile_images/2616745280/wtheight_normal.JPG",
        "http://pbs.twimg.com/profile_images/344513261572601394/5ee96016523c51d13ba7e7aa88c6f87d_normal.jpeg",
        "http://pbs.twimg.com/profile_images/3725167599/81fcba22949ad875c6a023f9050708a3_normal.jpeg",
        "http://pbs.twimg.com/profile_images/378800000408877465/6b5358425ebe35ad2f85ee1bbbb20ab2_normal.jpeg",
        "http://pbs.twimg.com/profile_images/378800000577116804/9ace630cc6c7f44962d9ca8bcea4178e_normal.jpeg",
        "http://pbs.twimg.com/profile_images/412000813213425664/p4Hy2ptK_normal.jpeg",
        "http://pbs.twimg.com/profile_images/432796291312017408/pPS3Lt4d_normal.jpeg",
        "http://pbs.twimg.com/profile_images/449304422888128512/85g8fAUw_normal.png",
        "http://pbs.twimg.com/profile_images/461496867717525505/dXO7bVMl_normal.jpeg",
        "http://pbs.twimg.com/profile_images/462299283085996032/5am0POKd_normal.jpeg",
        "http://pbs.twimg.com/profile_images/467944963309703168/E_Hf8UHO_normal.png",
        "http://pbs.twimg.com/profile_images/472166025249579009/fOkpkV-2_normal.jpeg",
        "http://pbs.twimg.com/profile_images/502123050188275712/0AQw9V-U_normal.jpeg",
        "http://pbs.twimg.com/profile_images/506420182839865345/eqHWzacJ_normal.jpeg",
        "http://pbs.twimg.com/profile_images/529257274598895616/cDnYp6Th_normal.jpeg",
        "http://pbs.twimg.com/profile_images/560633309164601344/yqVfk3bn_normal.jpeg",
        "http://pbs.twimg.com/profile_images/562215081971154944/SfNpSZeX_normal.jpeg",
        "http://pbs.twimg.com/profile_images/570186188096581632/aFVyL0JT_normal.jpeg",
        "http://pbs.twimg.com/profile_images/573769906925084672/EpVeUfjG_normal.jpeg",
        "http://pbs.twimg.com/profile_images/576558761843785728/R7_NiD5c_normal.jpeg",
        "http://pbs.twimg.com/profile_images/588704732966944768/GHTgvqum_normal.jpg",
        "http://pbs.twimg.com/profile_images/597861856808566785/8fTVdIvj_normal.jpg",
        "http://pbs.twimg.com/profile_images/598923913687629824/RyL1BiD8_normal.jpg",
        "http://pbs.twimg.com/profile_images/614057421535752192/rSNEWuXi_normal.jpg",
        "http://pbs.twimg.com/profile_images/614418266832834560/JwdXff7u_normal.jpg",
        "http://pbs.twimg.com/profile_images/617231522966298624/NQXtwNtH_normal.jpg",
        "http://pbs.twimg.com/profile_images/617856257941069824/JfZBN2-7_normal.jpg",
        "http://pbs.twimg.com/profile_images/646924475213049857/Mwy3mHwJ_normal.png",
        "http://pbs.twimg.com/profile_images/652415498647306240/oczyoSHw_normal.jpg",
        "http://pbs.twimg.com/profile_images/671778982132486144/zOoWOI_F_normal.jpg",
        "http://pbs.twimg.com/profile_images/672163598970433536/qubocyRk_normal.jpg",
        "http://pbs.twimg.com/profile_images/681376280072224770/U9ZmEPyW_normal.jpg",
        "http://pbs.twimg.com/profile_images/683081169978589184/4WxQcTNj_normal.jpg",
        "http://pbs.twimg.com/profile_images/687473974301704193/cacozvbI_normal.jpg",
        "http://pbs.twimg.com/profile_images/711088478553972738/mKNw_994_normal.jpg",
        "http://pbs.twimg.com/profile_images/715444876486123520/ouRJ0Epo_normal.jpg",
        "http://pbs.twimg.com/profile_images/716039399754981378/DM4zBXN4_normal.jpg",
        "http://pbs.twimg.com/profile_images/722415816499572736/iVQk0UZ9_normal.jpg",
        "http://pbs.twimg.com/profile_images/722607997143257088/rtIgdH1p_normal.jpg",
        "http://pbs.twimg.com/profile_images/725978623425961985/EcwuAPoW_normal.jpg",
        "http://pbs.twimg.com/profile_images/727000752762167297/GPCz_A4G_normal.jpg",
        "http://pbs.twimg.com/profile_images/733067842778603520/-DJLWLMc_normal.jpg",
        "http://pbs.twimg.com/profile_images/734677999614713860/vDY4uCyZ_normal.jpg",
        "http://pbs.twimg.com/profile_images/734924335543001088/EXx5liiX_normal.jpg",
        "http://pbs.twimg.com/profile_images/738965720055218177/6unsCRLp_normal.jpg",
        "http://pbs.twimg.com/profile_images/741721863555010560/AXuxfaya_normal.jpg",
        "http://pbs.twimg.com/profile_images/752063092058578944/F2MwVNCS_normal.jpg",
        "http://pbs.twimg.com/profile_images/753010916460007424/asKJCe0I_normal.jpg",
        "http://pbs.twimg.com/profile_images/754843918949154817/iGAW9fDA_normal.jpg",
        "http://pbs.twimg.com/profile_images/757066228154392576/1-OK7pRs_normal.jpg",
        "http://pbs.twimg.com/profile_images/757071216461176833/_uLMTO7f_normal.jpg",
        "http://pbs.twimg.com/profile_images/757662685039296514/pynVteUI_normal.jpg",
        "http://pbs.twimg.com/profile_images/758019999869071361/ORmgTz3q_normal.jpg",
        "http://pbs.twimg.com/profile_images/758428240478294016/zw0vucRt_normal.jpg",
        "http://pbs.twimg.com/profile_images/758887274025062400/IaasW1KU_normal.jpg",
        "http://pbs.twimg.com/profile_images/759526720915374080/Xw_9MpJ5_normal.jpg",
        "http://pbs.twimg.com/profile_images/761345062882062337/gUA3D5fA_normal.jpg",
        "http://pbs.twimg.com/profile_images/763639772237664256/aRmvvIfj_normal.jpg",
        "http://pbs.twimg.com/profile_images/764222479514468352/Eo6jM2YM_normal.jpg",
        "http://pbs.twimg.com/profile_images/764769282441883648/0sL15Aa-_normal.jpg",
        "http://pbs.twimg.com/profile_images/764879866441437184/kX1fKhIF_normal.jpg"
    );
    static final List<String> PROFILE_BANNER_URLS = asList(
        "https://pbs.twimg.com/profile_banners/1046135256/1431031262",
        "https://pbs.twimg.com/profile_banners/110316459/1469021902",
        "https://pbs.twimg.com/profile_banners/1145926820/1468788740",
        "https://pbs.twimg.com/profile_banners/1225778983/1468885940",
        "https://pbs.twimg.com/profile_banners/1263930085/1425359976",
        "https://pbs.twimg.com/profile_banners/148519189/1442660920",
        "https://pbs.twimg.com/profile_banners/1512884736/1398904158",
        "https://pbs.twimg.com/profile_banners/16213404/1460526506",
        "https://pbs.twimg.com/profile_banners/1641475784/1471170333",
        "https://pbs.twimg.com/profile_banners/1711341973/1395319652",
        "https://pbs.twimg.com/profile_banners/17353325/1418458219",
        "https://pbs.twimg.com/profile_banners/18315301/1453552534",
        "https://pbs.twimg.com/profile_banners/1890976934/1432332455",
        "https://pbs.twimg.com/profile_banners/1942245426/1438374878",
        "https://pbs.twimg.com/profile_banners/19482644/1429827492",
        "https://pbs.twimg.com/profile_banners/2199126007/1424662234",
        "https://pbs.twimg.com/profile_banners/22424037/1431979834",
        "https://pbs.twimg.com/profile_banners/23023227/1441447565",
        "https://pbs.twimg.com/profile_banners/2343205945/1431331581",
        "https://pbs.twimg.com/profile_banners/2450580301/1401369389",
        "https://pbs.twimg.com/profile_banners/2526939434/1470444864",
        "https://pbs.twimg.com/profile_banners/255807625/1465345487",
        "https://pbs.twimg.com/profile_banners/2587317438/1471001204",
        "https://pbs.twimg.com/profile_banners/25955518/1369786720",
        "https://pbs.twimg.com/profile_banners/2601524623/1418679518",
        "https://pbs.twimg.com/profile_banners/2752192451/1468366815",
        "https://pbs.twimg.com/profile_banners/277425776/1451288118",
        "https://pbs.twimg.com/profile_banners/2904178699/1465365756",
        "https://pbs.twimg.com/profile_banners/2976004395/1464649680",
        "https://pbs.twimg.com/profile_banners/301940851/1399246382",
        "https://pbs.twimg.com/profile_banners/3061473767/1424859233",
        "https://pbs.twimg.com/profile_banners/3233195874/1456054406",
        "https://pbs.twimg.com/profile_banners/3338021422/1469561028",
        "https://pbs.twimg.com/profile_banners/3834912673/1444661669",
        "https://pbs.twimg.com/profile_banners/39308766/1433978767",
        "https://pbs.twimg.com/profile_banners/426323910/1456202140",
        "https://pbs.twimg.com/profile_banners/4681564154/1453777272",
        "https://pbs.twimg.com/profile_banners/48950354/1434272028",
        "https://pbs.twimg.com/profile_banners/49190063/1453252306",
        "https://pbs.twimg.com/profile_banners/499375218/1395110666",
        "https://pbs.twimg.com/profile_banners/499636235/1456118947",
        "https://pbs.twimg.com/profile_banners/542224019/1409574950",
        "https://pbs.twimg.com/profile_banners/557468072/1461391153",
        "https://pbs.twimg.com/profile_banners/57874971/1463611966",
        "https://pbs.twimg.com/profile_banners/58012242/1431569245",
        "https://pbs.twimg.com/profile_banners/627890825/1436174271",
        "https://pbs.twimg.com/profile_banners/63871151/1467133576",
        "https://pbs.twimg.com/profile_banners/717464231122087936/1459893274",
        "https://pbs.twimg.com/profile_banners/757654829003137025/1470205906",
        "https://pbs.twimg.com/profile_banners/763582032479784960/1470955152",
        "https://pbs.twimg.com/profile_banners/76925737/1436248993",
        "https://pbs.twimg.com/profile_banners/80895456/1398254189",
        "https://pbs.twimg.com/profile_banners/87640290/1398208775",
        "https://pbs.twimg.com/profile_banners/91736168/1437568363",
        null
    );
    static List<String> SOURCES = asList(
        "web", // Twitter website
        "<a href=\"http://favstar.fm\" rel=\"nofollow\">Favstar.FM</a>",
        "<a href=\"http://gremln.com\" rel=\"nofollow\">Gremln</a>",
        "<a href=\"http://instagram.com\" rel=\"nofollow\">Instagram</a>",
        "<a href=\"http://tapbots.com/tweetbot\" rel=\"nofollow\">Tweetbot for iΟS</a>",
        "<a href=\"http://twitter.com/#!/download/ipad\" rel=\"nofollow\">Twitter for iPad</a>",
        "<a href=\"http://twitter.com/download/android\" rel=\"nofollow\">Twitter for Android</a>",
        "<a href=\"http://twitter.com/download/iphone\" rel=\"nofollow\">Twitter for iPhone</a>",
        "<a href=\"http://twitter.com\" rel=\"nofollow\">Twitter Web Client</a>",
        "<a href=\"http://www.tweetcaster.com\" rel=\"nofollow\">TweetCaster for Android</a>",
        "<a href=\"http://www.twitter.com\" rel=\"nofollow\">Twitter for BlackBerry</a>",
        "<a href=\"http://www.twitter.com\" rel=\"nofollow\">Twitter for Windows Phone</a>",
        "<a href=\"https://about.twitter.com/products/tweetdeck\" rel=\"nofollow\">TweetDeck</a>",
        "<a href=\"https://mobile.twitter.com\" rel=\"nofollow\">Mobile Web (M5)</a>"
    );
}
