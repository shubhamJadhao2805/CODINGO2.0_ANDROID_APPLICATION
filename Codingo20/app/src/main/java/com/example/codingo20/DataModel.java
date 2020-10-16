package com.example.codingo20;

import android.location.Location;

public class DataModel {

    static int clueNo = 1;
//    static int questionNo = 1;
    static int score = 00;
    static int teamNo = 0;
    static int qrCode = 0;
    static Location location;
    static Boolean admineLogIn = false;
    static Boolean isUserLogInFirst = false;






    //Clues for Teams

    static String[] team1Question = {" I have four legs, I can hop and swing, they say me ugly , I can spawn ,here I am neither living nor I can move , search around I am pouring from my mouth.","the outskirts of Cairo is near, I still exist in 7 wonders , I am one of the paraohs with human headed lion."
            ,"Publisher of hindi swaraj stands with anoy here under that palmand like tree wearing a brownish-stoned colour, find them keeping your stress-free","You say you come here to buy 2 minutes snacks, and you wait hungrily for 15 minutes but can’t sit and can’t have nap."
            ,"will all kilns and iron, with all tools and fire, nearby this you have next go, and already you are near  to the code."};

    static String[] team2Question = {" In the shadow of two intelligent minds, I’m here because the farmers are mine.","I’m so stone hearted, that your 2019 will be…..\n" +
            "“ AAO ANDERA KARE”","will all kilns and iron, with all tools and fire, nearby this you have next go, and already you are near  to the code.\n","I have four legs, I can hop and swing, they say me ugly , I can spawn ,here I am neither living nor I can move , search around I am pouring from my mouth.","the outskirts of Cairo is near, I still exist in 7 wonders , I am one of the paraohs with human headed lion.\n"};

    static String[] team3Question = {"You celebrated your 25th year here ,all where so happy with cheer, dignitary you welcomed her I am on red wall.","You say you come here to buy 2 minutes snacks, and you wait hungrily for 15 minutes but can’t sit and can’t have nap.\n" +
            "Algo.",".The dancer know this very well, A School for them with inspiring tales, You pass by this everyday, within all trees and an Indian form they say.","will all kilns and iron, with all tools and fire, nearby this you have next go, and already you are near  to the code.","Under the ashwattha I sit,Blessing and teaching the world, I speak everything right my five principle make you bright."};

    static String[] team4Question = {"You Came here because you" + "Miss your Home" + "& miss her Food," + "When you eat it" + "Then you feel Good.",
            "A place with substances and story,\n" +
            "Where many masquerade to the glory.","will all kilns and iron, with all tools and fire, nearby this you have next go, and already you are near  to the code.","You celebrated your 25th year here ,all where so happy with cheer, dignitary you welcomed her I am on red wall.","This old one runs forever, but never moves\n" +
            "At all he has not lungs nor throat, but still a mighty\n" +
            "Roaring call, What it is ?\n"};

    static String[] team5Question = {"Publisher of Hind Swaraj stand with a boy here, under the palm-like tree, wearing a brownish-stoned color,  find them keeping your mind \n" +
            "stress-free.","Carved, etched, adorned.Ornamented with soft hits on stone.All through dark cavernous spaces.Souls of craftsmanship melted, Pasted in on mountain walls.You adorn me, my emptiness.Just as the caves.Rich but empty.Dark, yet beautiful.You. ","This legend would explain his theory as ,”put your hand on a hot stove for a minute and , it seems like a hour, sit with a pretty girl for an hour, and it seems like a minute, that’s how time runs. ”","The dancer know this very well, A School for them with inspiring tales, You pass by this everyday, within all trees and an Indian form they say.","You say you come here to buy 2 minutes snacks, and you wait hungrily for 15 minutes but can’t sit and can’t have nap.\n"};

    static String[] team6Question = {"\tA place with substances and story," +
            "Where many masquerade to the glory." +
            "Journalism is my one neighbor," +
            "But I am known by another neighbor, " +
            "What am I ?","You Came here because you" +
            "Miss your Home" +
            "& miss her Food, " +
            "When you eat it" +
            "Then you feel Good.","Carved, etched, adorned.Ornamented with soft hits on stone.All through dark cavernous spaces.Souls of craftsmanship melted, Pasted in on mountain walls.You adorn me, my emptiness.Just as the grotto.Rich but empty.Dark, yet beautiful.You","I’m so stone hearted, that your 2019 will be…..\n" +
            "“ AAO ANDERA KARE”"," will all kilns and iron, with all tools and fire, nearby this you have next go, and already you are near  to the code."};

    static String[] team7Question = {"You say you come here to buy 2 minutes snacks, and you wait hungrily for 15 minutes but can’t sit and can’t have nap.","The dancer know this very well, A School for them with inspiring tales, You pass by this everyday, within all trees and an Indian form they say."," Now is the time to leave the car,if you leave from here,you’ll go far or else on the bull,there it stands near which you go,you will get in hand"," Under the ashwattha I sit,Blessing and teaching the world, I speak everything right my five principle make you bright."," This legend would explain his theory as ,”put your hand on a hot stove for a minute and , it seems like a hour, sit with a pretty girl for an hour, and it seems like a minute, that’s how time runs. ”"};


    static String[] team8Question = {"You celebrated your 25th year here ,all where so happy with cheer, dignitary you welcomed her I am on red wall."," I have four legs, I can hop and swing, they say me ugly , I can spawn ,here I am neither living nor I can move , search around I am pouring from my mouth.","the outskirts of Cairo is near, I still exist in 7 wonders , I am one of the paraohs with human headed lion.","Now is the time to leave the car,if you leave from here,you’ll go far or else on the bull,there it stands near which you go,you will get in hand.\n","Showing you 1:50 in the clock “if you never try, you will never know.” Near to five lollipop. \n"};

    static String[] team9Question = {" In the shadow of two intelligent minds, I’m here because the farmers are mine."," I’m so stone hearted, that your 2019 will be…..\n" +
            "“ AAO ANDERA KARE”","You say you come here to buy 2 minutes snacks, and you wait hungrily for 15 minutes but can’t sit and can’t have nap.","will all kilns and iron, with all tools and fire, nearby this you have next go, and already you are near  to the code.",".This old one runs forever, but never moves\n" +
            "At all he has not lungs nor throat, but still a mighty\n" +
            "Roaring call, What it is ?"};
    static String[] team10Question = {"Publisher of Hind Swaraj stand with a boy here, under the palm-like tree, wearing a brownish-stoned color,  find them keeping your mind \n" +
            "stress-free.","Carved, etched, adorned.Ornamented with soft hits on stone.All through dark cavernous spaces.Souls of craftsmanship melted, Pasted in on mountain walls.You adorn me, my emptiness.Just as the grotto.Rich but empty.Dark, yet beautiful.You","You Came here because you\n" +
            "Miss your Home" +
            "& miss her Food, " +
            "When you eat it" +
            "Then you feel Good.","A place with substances and story," +
            "Where many masquerade to the glory." +
            "Journalism is my one neighbor," +
            "But I am known by another neighbor, " +
            "What am I ?","This old one runs forever, but never moves" +
            "At all he has not lungs nor throat, but still a mighty" +
            "Roaring call, What it is ?"};

    static String[] team11Question = {"I have four legs, I can hop and swing, they say me ugly , I can spawn ,here I am neither living nor I can move , search around I am pouring from my mouth.","This legend would explain his theory as ,”put your hand on a hot stove for a minute and , it seems like a hour, sit with a pretty girl for an hour, and it seems like a minute, that’s how time runs. ”","will all kilns and iron, with all tools and fire, nearby this you have next go, and already you are near  to the code.","The dancer know this very well, A School for them with inspiring tales, You pass by this everyday, within all trees and an Indian form they say. ","This old one runs forever, but never moves\n" +
            "At all he has not lungs nor throat, but still a mighty" +
            "Roaring call, What it is ?"};

    static String[] team12Question = {"In the shadow of two intelligent minds, I’m here because the farmers are mine.","I have four legs, I can hop and swing, they say me ugly , I can spawn ,here I am neither living nor I can move , search around I am pouring from my mouth.","This legend would explain his theory as ,”put your hand on a hot stove for a minute and , it seems like a hour, sit with a pretty girl for an hour, and it seems like a minute, that’s how time runs. ”","Under the ashwattha I sit,Blessing and teaching the world, I speak everything right my five principle make you bright.","Carved, etched, adorned.Ornamented with soft hits on stone.All through dark cavernous spaces.Souls of craftsmanship melted, Pasted in on mountain walls.You adorn me, my emptiness.Just as the grotto.Rich but empty.Dark, yet beautiful.You."};

    static String[] team13Question = {"You celebrated your 25th year here ,all where so happy with cheer, dignitary you welcomed her I am on red wall.","You say you come here to buy 2 minutes snacks, and you wait hungrily for 15 minutes but can’t sit and can’t have nap."," This legend would explain his theory as ,”put your hand on a hot stove for a minute and , it seems like a hour, sit with a pretty girl for an hour, and it seems like a minute, that’s how time runs. ”","A place with substances and story,\n" +
            "Where many masquerade to the glory." +
            "Journalism is my one neighbor," +
            "But I am known by another neighbor, " +
            "What am I ?","This old one runs forever, but never moves" +
            "At all he has not lungs nor throat, but still a mighty" +
            "Roaring call, What it is ?"};
    static String[] team14Question = {"A place with substances and story," +
            "Where many masquerade to the glory." +
            "Journalism is my one neighbor," +
            "But I am known by another neighbor, " +
            "What am I ?","Under the ashwattha I sit,Blessing and teaching the world, I speak everything right my five principle make you bright.","Publisher of hindi swaraj stands with anoy here under that palmand like tree wearing a brownish-stoned colour, find them keeping your stress-free","You Came here because you\n" +
            "Miss your Home" +
            "& miss her Food, " +
            "When you eat it" +
            "Then you feel Good."," Showing you 1:50 in the clock “if you never try, you will never know.” Near to five lollipop. "};
    static String[] team15Question = {"You Came here because you" +
            "Miss your Home" +
            "& miss her Food," +
            "When you eat it" +
            "Then you feel Good.","A place with substances and story," +
            "Where many masquerade to the glory." +
            "Journalism is my one neighbor," +
            "But I am known by another neighbor, " +
            "What am I ?","Now is the time to leave the car,if you leave from here,you’ll go far or else on the bull,there it stands near which you go,you will get in hand.","the outskirts of Cairo is near, I still exist in 7 wonders , I am one of the paraohs with human headed lion.","The dancer know this very well, A School for them with inspiring tales, You pass by this everyday, within all trees and an Indian form they say."};

    static String[] team16Question = {"the outskirts of Cairo is near, I still exist in 7 wonders , I am one of the paraohs with human headed lion."," A place with substances and story,\n" +
            "Where many masquerade to the glory." +
            "Journalism is my one neighbor," +
            "But I am known by another neighbor, What am I ?","will all kilns and iron, with all tools and fire, nearby this you have next go, and already you are near  to the code.","You celebrated your 25th year here ,all where so happy with cheer, dignitary you welcomed her I am on red wall.","Carved, etched, adorned.Ornamented with soft hits on stone.All through dark cavernous spaces.Souls of craftsmanship melted, Pasted in on mountain walls.You adorn me, my emptiness.Just as the grotto.Rich but empty.Dark, yet beautiful.You. "};
    static String[] team17Question ={"You Came here because yor" +
            "Miss your Home" +
            "& miss her Food, " +
            "When you eat it" +
            "Then you feel Good.","I have four legs, I can hop and swing, they say me ugly , I can spawn ,here I am neither living nor I can move , search around I am pouring from my mouth.","This legend would explain his theory as ,”put your hand on a hot stove for a minute and , it seems like a hour, sit with a pretty girl for an hour, and it seems like a minute, that’s how time runs. ”","The dancer know this very well, A School for them with inspiring tales, You pass by this everyday, within all trees and an Indian form they say","This old one runs forever, but never moves\n" +
            "At all he has not lungs nor throat, but still a mighty\n" +
            "Roaring call, What it is ?"};

    static String[] team18Question = {"In the shadow of two intelligent minds, I’m here because the farmers are mine."," I’m so stone hearted, that your 2019 will be…..\n" +
            "“ AAO ANDERA KARE”","You say you come here to buy 2 minutes snacks, and you wait hungrily for 15 minutes but can’t sit and can’t have nap.","Under the ashwattha I sit,Blessing and teaching the world, I speak everything right my five principle make you bright.","Carved, etched, adorned.Ornamented with soft hits on stone.All through dark cavernous spaces.Souls of craftsmanship melted, Pasted in on mountain walls.You adorn me, my emptiness.Just as the grotto.Rich but empty.Dark, yet beautiful.You. "};


    static String[] team19Question ={"will all kilns and iron, with all tools and fire, nearby this you have next go, and already you are near  to the code.","Showing you 1:50 in the clock “if you never try, you will never know.” Near to five lollipop. ","I’m so stone hearted, that your 2019 will be…..\n" +
            "“ AAO ANDERA KARE”","You Came here because you" +
            "Miss your Home" +
            "& miss her Food," +
            "When you eat it" +
            "Then you feel Good.","A place with substances and story," +
            "Where many masquerade to the glory." +
            "Journalism is my one neighbor," +
            "But I am known by another neighbor, " +
            "What am I ?"};
    static String[] team20Question = {"You celebrated your 25th year here ,all where so happy with cheer, dignitary you welcomed her I am on red wall.","You Came here because you\n" +
            "Miss your Home" +
            "& miss her Food, " +
            "When you eat it" +
            "Then you feel Good.","I’m so stone hearted, that your 2019 will be…..\n" +
            "“ AAO ANDERA KARE”","This legend would explain his theory as ,”put your hand on a hot stove for a minute and , it seems like a hour, sit with a pretty girl for an hour, and it seems like a minute, that’s how time runs. ”","Under the ashwattha I sit,Blessing and teaching the world, I speak everything right my five principle make you bright."};



    static String[] team21Question = {". A place with substances and story,\n" +
            "Where many masquerade to the glory.\n" +
            "Journalism is my one neighbor,\n" +
            "But I am known by another neighbor, \n" +
            "What am I ?","This old one runs forever, but never moves\n" +
            "At all he has not lungs nor throat, but still a mighty\n" +
            "Roaring call, What it is ?","The dancer know this very well, A School for them with inspiring tales, You pass by this everyday, within all trees and an Indian form they say.","Carved, etched, adorned.Ornamented with soft hits on stone.All through dark cavernous spaces.Souls of craftsmanship melted, Pasted in on mountain walls.You adorn me, my emptiness.Just as the grotto.Rich but empty.Dark, yet beautiful.You.","You say you come here to buy 2 minutes snacks, and you wait hungrily for 15 minutes but can’t sit and can’t have nap."};


    static String[] team22Question = {"will all kilns and iron, with all tools and fire, nearby this you have next go, and already you are near  to the code."," Showing you 1:50 in the clock “if you never try, you will never know.” Near to five lollipop. ","Publisher of Hind Swaraj stand with a boy here, under the palm-like tree, wearing a brownish-stoned color,  find them keeping your mind \n" +
            "stress-free.","A place with substances and story,\n" +
            "Where many masquerade to the glory." +
            "Journalism is my one neighbor," +
            "But I am known by another neighbor, \n" +
            "What am I ?","This old one runs forever, but never moves" +
            "At all he has not lungs nor throat, but still a mighty" +
            "Roaring call, What it is ?"};

    static String[] team23Question = {"Carved, etched, adorned.Ornamented with soft hits on stone.All through dark cavernous spaces.Souls of craftsmanship melted, Pasted in on mountain walls.You adorn me, my emptiness.Just as the grotto.Rich but empty.Dark, yet beautiful.You.","You Came here because you\n" +
            "Miss your Home" +
            "& miss her Food, " +
            "When you eat it" +
            "Then you feel Good.\n","This old one runs forever, but never moves\n" +
            "At all he has not lungs nor throat, but still a mighty\n" +
            "Roaring call, What it is ?","The dancer know this very well, A School for them with inspiring tales, You pass by this everyday, within all trees and an Indian form they say.","Under the ashwattha I sit,Blessing and teaching the world, I speak everything right my five principle make you "};

    static String[] team24Question = {"In the shadow of two intelligent minds, I’m here because the farmers are mine.","I’m so stone hearted, that your 2019 will be…..\n" +
            "“ AAO ANDERA KARE”","You say you come here to buy 2 minutes snacks, and you wait hungrily for 15 minutes but can’t sit and can’t have nap."," Under the ashwattha I sit,Blessing and teaching the world, I speak everything right my five principle make you bright.","Carved, etched, adorned.Ornamented with soft hits on stone.All through dark cavernous spaces.Souls of craftsmanship melted, Pasted in on mountain walls.You adorn me, my emptiness.Just as the grotto.Rich but empty.Dark, yet beautiful.You.\",\"You Came here because you\\n\""};

    static String[] team25Question = {"A place with substances and story,\n" +
            "Where many masquerade to the glory." +
            "Journalism is my one neighbor," +
            "But I am known by another neighbor, " +
            "What am I ?","In the shadow of two intelligent minds, I’m here because the farmers are mine.","The dancer know this very well, A School for them with inspiring tales, You pass by this everyday, within all trees and an Indian form they say."," Under the ashwattha I sit,Blessing and teaching the world, I speak everything right my five principle make you ","This old one runs forever, but never moves\n" +
            "At all he has not lungs nor throat, but still a mighty\n" +
            "Roaring call, What it is ?"};

    static String[] team26Question = {" I have four legs, I can hop and swing, they say me ugly , I can spawn ,here I am neither living nor I can move , search around I am pouring from my mouth.","You celebrated your 25th year here ,all where so happy with cheer, dignitary you welcomed her I am on red wall.","Under the ashwattha I sit,Blessing and teaching the world, I speak everything right my five principle make you bright.","Publisher of hindi swaraj stands with anoy here under that palmand like tree wearing a brownish-stoned colour, find them keeping your stress-free","This legend would explain his theory as ,”put your hand on a hot stove for a minute and , it seems like a hour, sit with a pretty girl for an hour, and it seems like a minute, that’s how time runs. ”",};

    static String[] team27Question = {"Now is the time to leave the car,if you leave from here,you’ll go far or else on the bull,there it stands near which you go,you will get in hand.","the outskirts of Cairo is near, I still exist in 7 wonders , I am one of the paraohs with human headed lion.","The dancer know this very well, A School for them with inspiring tales, You pass by this everyday, within all trees and an Indian form they say.","You say you come here to buy 2 minutes snacks, and you wait hungrily for 15 minutes but can’t sit and can’t have nap.","will all kilns and iron, with all tools and fire, nearby this you have next go, and already you are near  to the code."};

    static String[] team28Question = {"In the shadow of two intelligent minds, I’m here because the farmers are mine."," I’m so stone hearted, that your 2019 will be…..\n" +
            "“ AAO ANDERA KARE”","Publisher of Hind Swaraj stand with a boy here, under the palm-like tree, wearing a brownish-stoned color,  find them keeping your mind \n" +
            "stress-free.","Carved, etched, adorned.Ornamented with soft hits on stone.All through dark cavernous spaces.Souls of craftsmanship melted, Pasted in on mountain walls.You adorn me, my emptiness.Just as the grotto.Rich but empty.Dark, yet beautiful.You. ","Showing you 1:50 in the clock “if you never try, you will never know.” Near to five lollipop."};

static String[] team29Question = {"You Came here because you\n" +
        "Miss your Home" +
        "& miss her Food, " +
        "When you eat it" +
        "Then you feel Good.","A place with substances and story," +
        "Where many masquerade to the glory." +
        "Journalism is my one neighbor," +
        "But I am known by another neighbor, " +
        "What am I ?","This old one runs forever, but never moves" +
        "At all he has not lungs nor throat, but still a mighty" +
        "Roaring call, What it is ?"," I’m so stone hearted, that your 2019 will be….." +
        "“ AAO ANDERA KARE”","In the shadow of two intelligent minds, I’m here because the farmers are mine."};
static String[] team30Question = {"You celebrated your 25th year here ,all where so happy with cheer, dignitary you welcomed her I am on red wall."," the outskirts of Cairo is near, I still exist in 7 wonders , I am one of the paraohs with human headed lion.","Under the ashwattha I sit,Blessing and teaching the world, I speak everything right my five principle make you bright.","You say you come here to buy 2 minutes snacks, and you wait hungrily for 15 minutes but can’t sit and can’t have nap.","In the shadow of two intelligent minds, I’m here because the farmers are mine."};


static String[] team31Question = {"If you were to kiss one of these\n" +
        "Then your lips you might want to rinse\n" +
        "Although it might be worth trying\n" +
        "In case it turns  into a prince","I want visa to meet Giza.","Father of Nation holding hand of a child\n" +
        " Run your Mind and be on time.","you came here to fill your hunger\n" +
        "not only coffee , Maggi is also here" +
        "Don’t go anywhere come here. ","The Building not very near" +
        "Still in limelight, Without any fear." +
        "Making noise for Piston Power" +
        "If You have heard this before, then " +
        "Come and discover……" +
        " "};

    static String[] team32Question = {"Form by the Great actor \n" +
            "Of acting Sector \n" +
            "When the Farmer thinks…" +
            "2b or not 2b he is there" +
            "To make their life Fair.","I’m so stone hearted, that your 2019 will be…..\n" +
            "“ AAO ANDHERA KARE”","The Building not very near\n" +
            "Still in limelight, Without any fear.\n" +
            "Making noise for Piston Power" +
            "If You have heard this before, then " +
            "Come and discover……","If you were to kiss one of these\n" +
            "Then your lips you might want to rinse\n" +
            "Although it might be worth trying\n" +
            "In case it turns  into a prince","I Want VISA to Meet Giza.\n"};

    static String[] team33Question = {"Place of Celebration of 25th Year,\n" +
            "Embedded on the red wall and surrounded by greenery,\n" +
            "Solve this mystery to remind us history.","you come here to fill your hunger\n" +
            "not only coffee , Maggi is also here\n" +
            "Don’t go anywhere come here.","There exists a Place  having lord Krishna’s \n" +
            "wife name…… solve it fast and earn fame.","The Building not very near\n" +
            "Still in limelight, Without any fear.\n" +
            "Making noise for Piston Power\n" +
            "If You have heard this before, then Come and discover……"," Under the ashwattha I sit,Blessing and teaching the world, I speak everything right my five principle make you bright."};

    static String[] team34Question = {"When You Miss Your mom\n" +
            "Miss her food" +
            "When, you came here" +
            "You realize how she is good" +
            "And her food.","A place with substances and story," +
            "Where many masquerade to the glory." +
            "Journalism is my one neighbor," +
            "But I am known by another neighbor," +
            "What am I ?","The Building not very near\n" +
            "Still in limelight, Without any fear.\n" +
            "Making noise for Piston Power\n" +
            "If You have heard this before, then \n" +
            "Come and discover……","Place of Celebration of 25th Year,\n" +
            "Embedded on the red wall and surrounded by greenery,\n" +
            "Solve this mystery to remind us history.","This old one runs forever, but never moves\n" +
            "At all he has not lungs nor throat, but still a mighty\n" +
            "Roaring call, What it is ?"};

    static String[] team35Question = {"Father of Nation holding hand of a child\n" +
            " Run your Mind and be on time.","Carved, etched, adorned.Ornamented with soft hits on stone.All through dark cavernous spaces.Souls of craftsmanship melted, Pasted in on mountain walls.You adorn me, my emptiness.Just as the grotto.Rich but empty.Dark, yet beautiful.You.","Theory of relativity explained very well.\n" +
            "Also About the mass energy equivalent he tell," +
            "If you know him then good and well," +
            "Otherwise goto hell. ","There exists a Place  having lord Krishna’s \n" +
            "wife name…… solve it fast and earn fame."," you came here to fill your hunger\n" +
            "not only coffee , Maggi is also here\n" +
            "Don’t go anywhere come here."};

    static String[] team36Question = {"\tA place with substances and story,\n" +
            "Where many masquerade to the glory." +
            "Journalism is my one neighbor," +
            "But I am known by another neighbor," +
            "What am I ?","When You Miss Your mom\n" +
            "Miss her food" +
            "When, you came here" +
            "You realize how she is good\n" +
            "And her food.","Carved, etched, adorned.Ornamented with soft hits on stone.All through dark cavernous spaces.Souls of craftsmanship melted, Pasted in on mountain walls.You adorn me, my emptiness.Just as the grotto.Rich but empty.Dark, yet beautiful.You","I’m so stone hearted, that your 2019 will be…..\n" +
            "“ AAO ANDERA KARE”","The Building not very near\n" +
            "Still in limelight, Without any fear." +
            "Making noise for Piston Power" +
            "If You have heard this before, then " +
            "Come and discover……"};

    static String[] team37Question = {"you came here to fill your hunger\n" +
            "not only coffee , Maggi is also here\n" +
            "Don’t go anywhere come here.","There exists a Place  having lord Krishna’s \n" +
            "wife name…… solve it fast and earn fame.","Now is the time to leave the car,if you leave from here,you’ll go far or else on the bull,there it stands near which you go,you will get in hand.","Under the ashwattha I sit,Blessing and teaching the world, I speak everything right my five principle make you bright.","Theory of relativity explained very well.\n" +
            "Also About the mass energy equivalent he tell," +
            "If you know him then good and well," +
            "Otherwise goto hell."};

    static String[] team38Question = {"Place of Celebration of 25th Year,\n" +
            "Embedded on the red wall and surrounded by greenery,\n" +
            "Solve this mystery to remind us history.","If you were to kiss one of these\n" +
            "Then your lips you might want to rinse\n" +
            "Although it might be worth trying\n" +
            "In case it turns  into a prince","\tI Want VISA to Meet Giza","Now is the time to leave the car,if you leave from here,you’ll go far or else on the bull,there it stands near which you go,you will get in hand.","Showing you 1:50 in the clock “if you never try, you will never know.” Near to five lollipop. "};



    static String[] team39Question = {"Form by the Great actor \n" +
            "Of acting Sector \n" +
            "When the Farmer thinks…" +
            "2b or not 2b he is there" +
            "To make their life Fair.","I’m so stone hearted, that your 2019 will be…..\n" +
            "“ AAO ANDERA KARE”\n","you came here to fill your hunger" +
            "not only coffee , Maggi is also here" +
            "Don’t go anywhere come here."," The Building not very near\n" +
            "Still in limelight, Without any fear.\n" +
            "Making noise for Piston Power" +
            "If You have heard this before, then " +
            "Come and discover……","This old one runs forever, but never moves\n" +
            "At all he has not lungs nor throat, but still a mighty\n" +
            "Roaring call, What it is ?"};

    static String[] team40Question = {"Publisher of Hind Swaraj stand with a boy here, under the palm-like tree, wearing a brownish-stoned color,  find them keeping your mind \n" +
            "stress-free.","Carved, etched, adorned.Ornamented with soft hits on stone.All through dark cavernous spaces.Souls of craftsmanship melted, Pasted in on mountain walls.You adorn me, my emptiness.Just as the grotto.Rich but empty.Dark, yet beautiful.You","You Came here because you\n" +
            "Miss your Home" +
            "& miss her Food, " +
            "When you eat it" +
            "Then you feel Good.","A place with substances and story," +
            "Where many masquerade to the glory." +
            "Journalism is my one neighbor," +
            "But I am known by another neighbor, " +
            "What am I ?","This old one runs forever, but never moves" +
            "At all he has not lungs nor throat, but still a mighty" +
            "Roaring call, What it is ?"};







    //C programming Question

//    static String[] programmingQuestion1 = {"1 st question","2 nd question","3 rd question","4 th question","5 th question no"};
//
//    static String[] programmingQuestion2 = {"1 st question1","2 nd question2","3 rd question3","4 th question4","5 th question no5"};

   // programming Question Answer
//
//    static String[] questionAnswer1 = {"1","2","3","4","5"};
//
//    static String[] questionAnswer2 = {"6","7","8","9","10"};




static String[] qrCodeForTeam1 = {"te1qr1","te1qr2","te1qr3","te1qr4","te1qr5"};
static String[] qrCodeForTeam2 = {"te2qr1","te2qr2","te2qr3","te2qr4","te2qr5"};
static String[] qrCodeForTeam3 = {"te3qr1","te3qr2","te3qr3","te3qr4","te3qr5"};

    static String[] qrCodeForTeam4 = {"te4qr1","te4qr2","te4qr3","te4qr4","te4qr5"};
    static String[] qrCodeForTeam5 = {"te5qr1","te5qr2","te5qr3","te5qr4","te5qr5"};
    static String[] qrCodeForTeam6 = {"te6qr1","te6qr2","te6qr3","te6qr4","te6qr5"};
    static String[] qrCodeForTeam7 = {"te7qr1","te7qr2","te7qr3","te7qr4","te7qr5"};
    static String[] qrCodeForTeam8 = {"te8qr1","te8qr2","te8qr3","te8qr4","te8qr5"};
    static String[] qrCodeForTeam9 = {"te9qr1","te9qr2","te9qr3","te9qr4","te9qr5"};
    static String[] qrCodeForTeam10 = {"te10qr1","te10qr2","te10qr3","te10qr4","te10qr5"};
    static String[] qrCodeForTeam11 = {"te11qr1","te11qr2","te11qr3","te11qr4","te11qr5"};
    static String[] qrCodeForTeam12 = {"te12qr1","te12qr2","te12qr3","te12qr4","te12qr5"};
    static String[] qrCodeForTeam13 = {"te13qr1","te13qr2","te13qr3","te13qr4","te13qr5"};
    static String[] qrCodeForTeam14 = {"te14qr1","te14qr2","te14qr3","te14qr4","te14qr5"};
    static String[] qrCodeForTeam15 = {"te15qr1","te15qr2","te15qr3","te15qr4","te15qr5"};
    static String[] qrCodeForTeam16 = {"te16qr1","te16qr2","te16qr3","te16qr4","te16qr5"};
    static String[] qrCodeForTeam17 = {"te17qr1","te17qr2","te17qr3","te17qr4","te17qr5"};
    static String[] qrCodeForTeam18 = {"te18qr1","te18qr2","te18qr3","te18qr4","te18qr5"};
    static String[] qrCodeForTeam19 = {"te19qr1","te19qr2","te19qr3","te19qr4","te19qr5"};
    static String[] qrCodeForTeam20 = {"te20qr1","te20qr2","te20qr3","te20qr4","te20qr5"};




    static String[] getQrCodeForTeam21 = {"te21qr1","te21qr2","te21qr3","te21qr4","te21qr5"};
    static String[] getQrCodeForTeam22 = {"te22qr1","te22qr2","te22qr3","te22qr4","te22qr5"};

    static String[] getQrCodeForTeam23 = {"te23qr1","te23qr2","te23qr3","te23qr4","te23qr5"};
    static String[] getQrCodeForTeam24 = {"te24qr1","te24qr2","te24qr3","te24qr4","te24qr5"};

    static String[] getQrCodeForTeam25 = {"te25qr1","te25qr2","te25qr3","te25qr4","te25qr5"};
    static String[] getQrCodeForTeam26 = {"te26qr1","te26qr2","te26qr3","te26qr4","te26qr5"};

    static String[] getQrCodeForTeam27 = {"te27qr1","te27qr2","te27qr3","te27qr4","te27qr5"};
    static String[] getQrCodeForTeam28 = {"te28qr1","te28qr2","te28qr3","te28qr4","te28qr5"};

    static String[] getQrCodeForTeam29 = {"te29qr1","te29qr2","te29qr3","te29qr4","te29qr5"};
    static String[] getQrCodeForTeam30 = {"te30qr1","te30qr2","te30qr3","te30qr4","te30qr5"};

    static String[] getQrCodeForTeam31 = {"te5qr1","te5qr2","te5qr3","te5qr4","te5qr5"};
    static String[] getQrCodeForTeam32 = {"te6qr1","te6qr2","te6qr3","te6qr4","te6qr5"};

    static String[] getQrCodeForTeam33 = {"te12qr1","te12qr2","te12qr3","te12qr4","te12qr5"};
    static String[] getQrCodeForTeam34 = {"te16qr1","te16qr2","te16qr3","te16qr4","te16qr5"};

    static String[] getQrCodeForTeam35 = {"te21qr1","te21qr2","te21qr3","te21qr4","te21qr5"};
    static String[] getQrCodeForTeam36 = {"te22qr1","te22qr2","te22qr3","te22qr4","te22qr5"};

    static String[] getQrCodeForTeam37 = {"te23qr1","te23qr2","te23qr3","te23qr4","te23qr5"};
    static String[] getQrCodeForTeam38 = {"te24qr1","te24qr2","te24qr3","te24qr4","te24qr5"};

    static String[] getQrCodeForTeam39 = {"te26qr1","te26qr2","te26qr3","te26qr4","te26qr5"};
    static String[] getQrCodeForTeam40 = {"te27qr1","te27qr2","te27qr3","te27qr4","te27qr5"};

//Array of teamQrCode

  static   String[][] qrCodeNameArray = {qrCodeForTeam1,qrCodeForTeam2,qrCodeForTeam3,qrCodeForTeam4,qrCodeForTeam5,qrCodeForTeam6,qrCodeForTeam7,qrCodeForTeam8,qrCodeForTeam9,qrCodeForTeam10,qrCodeForTeam11,qrCodeForTeam12,qrCodeForTeam13,qrCodeForTeam14,qrCodeForTeam15,qrCodeForTeam16,qrCodeForTeam17,qrCodeForTeam18,qrCodeForTeam19,qrCodeForTeam20,getQrCodeForTeam21,getQrCodeForTeam22,getQrCodeForTeam23,getQrCodeForTeam24,getQrCodeForTeam25,getQrCodeForTeam26,getQrCodeForTeam27,getQrCodeForTeam28,getQrCodeForTeam29,getQrCodeForTeam30,getQrCodeForTeam31,getQrCodeForTeam32,getQrCodeForTeam33,getQrCodeForTeam34,getQrCodeForTeam35,getQrCodeForTeam36,getQrCodeForTeam37,getQrCodeForTeam38,getQrCodeForTeam39,getQrCodeForTeam40};

    //Array of teamQuestions




    static  String[][] questionArray = {team1Question,team2Question,team3Question,team4Question,team5Question,team6Question,team7Question,team8Question,team9Question,team10Question,team11Question,team12Question,team13Question,team14Question,team15Question,team16Question,team17Question,team18Question,team19Question,team20Question,team21Question,team22Question,team23Question,team24Question,team25Question,team26Question,team27Question,team28Question,team29Question,team30Question,team31Question,team32Question,team33Question,team34Question,team35Question,team36Question,team37Question,team38Question,team39Question,team40Question};

    //Array of programming question

//    static String[][] programmingQuestionArray = {programmingQuestion1,programmingQuestion2};

    //Array of answer

//    static String[][] answerArray = {questionAnswer1,questionAnswer2};



    //Array of Co-ordinates

    static String[] latitudeTeam1 = {"19.87935778221104", "19.879764388333893", "19.879361889343595", "19.879744104128218", "19.880464361067748"};
    static String[] longitudeTeam1 = {"75.35675003200336", "75.35597009591325", "75.35673662095829", "75.3557651583807", "75.35626564181908"};


//
    static String[] latitudeTeam2 = {"19.879738865438735", "19.87919085660938", "19.88047395834688", "19.87935778221104", "19.879764388333893" };
    static String[] longitudeTeam2 = { "75.35623865209087", "75.35633068538769", "75.3561972454892", "75.35675003200336", "75.35597009591325"};


    static String[] latitudeTeam3 = {"19.879511841591334", "19.87974733116094", "19.879385191034412", "19.88047244960431", "19.880004362221694"};
    static String[] longitudeTeam3 = { "75.35632926046415", "75.35575627356334", "75.35681423738166", "75.35622440285547", "75.3559020348595"};


    static String[] latitudeForTeam4 = {"19.879976031388974","19.879488372262454","19.880464361067748","19.879511841591334","19.878939483333266"};
    static String[] longitudeForTeam4 = {"75.35572852946385","75.35602130934163","75.35626564181908","75.35632926046415","75.35653931095763"};


    static String[] latitudeForTeam5 = {"19.879361889343595","19.878864339571333","19.879779643397665","19.879385191034412","19.879744104128218"};
    static String[] longitudeForTeam5 = {"75.35673662095829","75.35660510889753","75.35623429350122","75.35681423738166","75.3557651583807"};


    static String[] latitudeForTeam6 = {"19.879488372262454","19.879976031388974","19.878864339571333","19.87919085660938","19.880464361067748"};
    static String[] longitudeForTeam6 = {"75.35602130934163","75.35572852946385","75.35660510889753","75.35633068538769","75.35626564181908"};


    static String[] latitudeForTeam7 = {"19.879744104128218","19.879385191034412","19.878929969873166","19.880004362221694","19.879779643397665"};
    static String[] longitudeForTeam7 = {"75.3557651583807","75.35681423738166","75.35678406253024","75.3559020348595","75.35623429350122"};


    static String[] latitudeForTeam8 = {"19.879511841591334","19.87935778221104","19.879764388333893","19.878929969873166","19.879826162960267"};
    static String[] longitudeForTeam8 = {"75.35632926046415","75.35675003200336","75.35597009591325","75.35678406253024","75.3561692499326"};


    static String[] latitudeForTeam9 = {"19.879738865438735","19.87919085660938","19.879744104128218","19.880464361067748","19.878955995682514"};
    static String[] longitudeForTeam9 = {"75.35623865209087","75.35633068538769","75.3557651583807","75.35626564181908","75.35658398650153"};

    static String[] latitudeForTeam10 = {"19.879361889343595","19.878864339571333","19.879976031388974","19.879488372262454","19.878955995682514"};
    static String[] longitudeForTeam10 = {"75.35673662095829","75.35660510889753","75.35572852946385","75.35602130934163","75.35658398650153"};


    static String[] latitudeForTeam11 = {"19.87935778221104","19.879779643397665","19.88047395834688","19.879385191034412","19.878955995682514"};
    static String[] longitudeForTeam11 = {"75.35675003200336","75.35623429350122","75.3561972454892","75.35681423738166","75.35658398650153"};


    static String[] latitudeForTeam12 = {"19.879738865438735","19.87935778221104","19.879779643397665","19.880004362221694","19.878864339571333"};
    static String[] longitudeForTeam12 = {"75.35623865209087","75.35675003200336","75.35623429350122","75.3559020348595","75.35660510889753"};

    static String[] latitudeForTeam13 = {"19.879511841591334","19.879744104128218","19.879779643397665","19.879488372262454","19.878955995682514"};
    static String[] longitudeForTeam13 = {"75.35632926046415","75.3557651583807","75.35623429350122","75.35602130934163","75.35658398650153"};

    static String[] latitudeForTeam14 = {"19.879488372262454","19.880004362221694","19.879361889343595","19.879976031388974","19.879826162960267"};
    static String[] longitudeForTeam14 = {"75.35602130934163","75.3559020348595","75.35673662095829","75.35572852946385","75.3561692499326"};

    static String[] latitudeForTeam15 = {"19.879976031388974","19.879488372262454","19.878929969873166","19.879764388333893","19.879385191034412"};
    static String[] longitudeForTeam15= {"75.35572852946385","75.35602130934163","75.35678406253024","75.35597009591325","75.35681423738166"};



    static String[] latitudeForTeam16 = {"19.879764388333893","19.879488372262454","19.88047395834688","19.879511841591334","19.878864339571333"};
    static String[] longitudeForTeam16 = {"75.35597009591325","75.35602130934163","75.3561972454892","75.35632926046415","75.35660510889753"};

    static String[] latitudeForTeam17 = {"19.879976031388974","19.87935778221104","19.879779643397665","19.879385191034412","19.878955995682514"};
    static String[] longitudeForTeam17 = {"75.35572852946385","75.35675003200336","75.35623429350122","75.35681423738166","75.35658398650153"};

    static String[] latitudeForTeam18 = {"19.879738865438735","19.87919085660938","19.879976031388974","19.880004362221694","19.878864339571333"};
    static String[] longitudeForTeam18 = {"75.35623865209087","75.35633068538769","75.35572852946385","75.3559020348595","75.35660510889753"};

    static String[] latitudeForTeam19 = {"19.88047395834688","19.879826162960267","19.87919085660938","19.879976031388974","19.879488372262454"};
    static String[] longitudeForTeam19 = {"75.3561972454892","75.3561692499326","75.35633068538769","75.35572852946385","75.35602130934163"};

    static String[] latitudeForTeam20 = {"19.879511841591334","19.879976031388974","19.87919085660938","19.879779643397665","19.880004362221694"};
    static String[] longitudeForTeam20 = { "75.35632926046415","75.35572852946385","75.35633068538769","75.35623429350122","75.3559020348595"};

    static String[] latitudeForTeam21 = {"19.879488372262454","19.878955995682514","19.879385191034412","19.878864339571333","19.879744104128218"};
    static String[] longitudeForTeam21 = {"75.35602130934163","75.35658398650153","75.35681423738166","75.35660510889753","75.3557651583807" };

    static String[] latitudeForTeam22 = {"19.88047395834688","19.879826162960267","19.879361889343595","19.879488372262454","19.878955995682514"};
    static String[] longitudeForTeam22 = {"75.3561972454892","75.3561692499326","75.35673662095829","75.35602130934163","75.35658398650153"};

    static String[] latitudeForTeam23 = {"19.878864339571333","19.879976031388974","19.878955995682514","19.879385191034412","19.880004362221694"};
    static String[] longitudeForTeam23 = {"75.35660510889753","75.35572852946385","75.35658398650153","75.35681423738166","75.3559020348595"};

    static String[] latitudeForTeam24 = {"19.879738865438735","19.87919085660938","19.879744104128218","19.880004362221694","19.878864339571333"};
    static String[] longitudeForTeam24 = {"75.35623865209087","75.35633068538769","75.3557651583807","75.3559020348595","75.35660510889753"};

    static String[] latitudeForTeam25 = {"19.879488372262454","19.879738865438735","19.879385191034412","19.880004362221694","19.878955995682514"};
    static String[] longitudeForTeam25 = {"75.35602130934163","75.35623865209087","75.35681423738166","75.3559020348595","75.35658398650153"};

    static String[] latitudeForTeam26 = {"19.87935778221104","19.879511841591334","19.880004362221694","19.879361889343595","19.879779643397665"};
    static String[] longitudeForTeam26 = {"75.35675003200336","75.35632926046415","75.3559020348595","75.35673662095829","75.35623429350122"};

    static String[] latitudeForTeam27 = {"19.878929969873166","19.879764388333893","19.879385191034412","19.879744104128218","19.88047395834688"};
    static String[] longitudeForTeam27 = {"75.35678406253024","75.35597009591325","75.35681423738166","75.3557651583807","75.3561972454892"};

    static String[] latitudeForTeam28 = {"19.879738865438735","19.87919085660938","19.879361889343595","19.878864339571333","19.879826162960267"};
    static String[] longitudeForTeam28 = {"75.35623865209087","75.35633068538769","75.35673662095829","75.35660510889753","75.3561692499326"};

    static String[] latitudeForTeam29 = {"19.879976031388974","19.879488372262454","19.878955995682514","19.87919085660938","19.879738865438735"};
    static String[] longitudeForTeam29 = {"75.35572852946385","75.35602130934163","75.35658398650153","75.35633068538769","75.35623865209087"};

    static String[] latitudeForTeam30 = {"19.879511841591334","19.879764388333893","19.880004362221694","19.879976031388974","19.879738865438735"};
    static String[] longitudeForTeam30 = {"75.35632926046415","75.35597009591325","75.3559020348595","75.35572852946385","75.35623865209087"};


    static String[] latitudeTeam31 = {"19.87935778221104", "19.879764388333893", "19.879361889343595", "19.879744104128218", "19.880464361067748"};
    static String[] longitudeTeam31 = {"75.35675003200336", "75.35597009591325", "75.35673662095829", "75.3557651583807", "75.35626564181908"};


    //
    static String[] latitudeTeam32 = {"19.879738865438735", "19.87919085660938", "19.88047395834688", "19.87935778221104", "19.879764388333893" };
    static String[] longitudeTeam32 = { "75.35623865209087", "75.35633068538769", "75.3561972454892", "75.35675003200336", "75.35597009591325"};


    static String[] latitudeTeam33 = {"19.879511841591334", "19.87974733116094", "19.879385191034412", "19.88047244960431", "19.880004362221694"};
    static String[] longitudeTeam33 = { "75.35632926046415", "75.35575627356334", "75.35681423738166", "75.35622440285547", "75.3559020348595"};


    static String[] latitudeForTeam34 = {"19.879976031388974","19.879488372262454","19.880464361067748","19.879511841591334","19.878939483333266"};
    static String[] longitudeForTeam34 = {"75.35572852946385","75.35602130934163","75.35626564181908","75.35632926046415","75.35653931095763"};


    static String[] latitudeForTeam35 = {"19.879361889343595","19.878864339571333","19.879779643397665","19.879385191034412","19.879744104128218"};
    static String[] longitudeForTeam35 = {"75.35673662095829","75.35660510889753","75.35623429350122","75.35681423738166","75.3557651583807"};


    static String[] latitudeForTeam36 = {"19.879488372262454","19.879976031388974","19.878864339571333","19.87919085660938","19.880464361067748"};
    static String[] longitudeForTeam36 = {"75.35602130934163","75.35572852946385","75.35660510889753","75.35633068538769","75.35626564181908"};


    static String[] latitudeForTeam37 = {"19.879744104128218","19.879385191034412","19.878929969873166","19.880004362221694","19.879779643397665"};
    static String[] longitudeForTeam37 = {"75.3557651583807","75.35681423738166","75.35678406253024","75.3559020348595","75.35623429350122"};


    static String[] latitudeForTeam38 = {"19.879511841591334","19.87935778221104","19.879764388333893","19.878929969873166","19.879826162960267"};
    static String[] longitudeForTeam38 = {"75.35632926046415","75.35675003200336","75.35597009591325","75.35678406253024","75.3561692499326"};


    static String[] latitudeForTeam39 = {"19.879738865438735","19.87919085660938","19.879744104128218","19.880464361067748","19.878955995682514"};
    static String[] longitudeForTeam39 = {"75.35623865209087","75.35633068538769","75.3557651583807","75.35626564181908","75.35658398650153"};

    static String[] latitudeForTeam40 = {"19.879361889343595","19.878864339571333","19.879976031388974","19.879488372262454","19.878955995682514"};
    static String[] longitudeForTeam40 = {"75.35673662095829","75.35660510889753","75.35572852946385","75.35602130934163","75.35658398650153"};


    static String[][] arrayForlatitudes = {latitudeTeam1,latitudeTeam2,latitudeTeam3,latitudeForTeam4,latitudeForTeam5,latitudeForTeam6,latitudeForTeam7,latitudeForTeam8,latitudeForTeam9,latitudeForTeam10,latitudeForTeam11,latitudeForTeam12,latitudeForTeam13,latitudeForTeam14,latitudeForTeam15,latitudeForTeam16,latitudeForTeam17,latitudeForTeam18,latitudeForTeam19,latitudeForTeam20,latitudeForTeam21,latitudeForTeam22,latitudeForTeam23,latitudeForTeam24,latitudeForTeam25,latitudeForTeam26,latitudeForTeam27,latitudeForTeam28,latitudeForTeam29,latitudeForTeam30,latitudeTeam31,latitudeTeam32,latitudeTeam33,latitudeForTeam34,latitudeForTeam35,latitudeForTeam36,latitudeForTeam37,latitudeForTeam38,latitudeForTeam39,latitudeForTeam40};
    static String[][] arrayForLongitude = {longitudeTeam1,longitudeTeam2,longitudeTeam3,longitudeForTeam4,longitudeForTeam5,longitudeForTeam6,longitudeForTeam7,longitudeForTeam8,longitudeForTeam9,longitudeForTeam10,longitudeForTeam11,longitudeForTeam12,longitudeForTeam13,longitudeForTeam14,longitudeForTeam15,longitudeForTeam16,longitudeForTeam17,longitudeForTeam18,longitudeForTeam19,longitudeForTeam20,longitudeForTeam21,longitudeForTeam22,longitudeForTeam23,longitudeForTeam24,longitudeForTeam25,longitudeForTeam26,longitudeForTeam27,longitudeForTeam28,longitudeForTeam29,longitudeForTeam30,longitudeTeam31,longitudeTeam32,longitudeTeam33,longitudeForTeam34,longitudeForTeam35,longitudeForTeam36,longitudeForTeam37,longitudeForTeam38,longitudeForTeam39,longitudeForTeam40};


}
