package com.mattfred.androidai.ai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Ari {

    private final int maxResp = 6;
    private final String KnowledgeBase[][][] =
            {
                    {{"WHAT IS YOUR NAME"},
                            {"MY NAME IS ARI.",
                                    "THIS MAN HAS THE HONOR OF BEING CALLED ARI."}
                    },
                    /**IF BOT ASKS "WHAT IS YOUR NAME" NEED TO WRITE CODE TO TAKE IN NAME AND SAVE IT FOR USE*/

                    {{"HI", "HELLO"},
                            {"HI THERE!",
                                    "HOW ARE YOU?",
                                    "HI!"}
                    },

                    {{"I"},
                            {"SO, YOU ARE TALKING ABOUT YOURSELF",
                                    "SO, THIS IS ALL ABOUT YOU?",
                                    "COOL STORY BRO...ELABORATE?",
                                    "TELL ME MORE ABOUT YOURSELF."},
                    },

                    {{"I WANT"},
                            {"WHY DO YOU WANT IT?",
                                    "IS THERE ANY REASON WHY YOU WANT THIS?",
                                    "IS THIS A WISH?",
                                    "YOU CAN'T ALWAYS GET WHAT YOU WANT...",
                                    "WHAT ELSE YOU WANT?"}
                    },

                    {{"I HATE"},
                            {"WHY DO YOU HATE IT?",
                                    "WHY DO YOU HATE*?",
                                    "HATE LEADS TO SUFFERING.",
                                    "THERE MUST A GOOD REASON FOR YOU TO HATE IT.",
                                    "HATERED IS NOT A GOOD THING BUT IT COULD BE JUSTIFIED WHEN IT IS SOMETHING BAD."}
                    },

                    {{"I LOVE CHATING"},
                            {"GOOD, ME TOO!",
                                    "DO YOU CHAT ONLINE WITH OTHER PEOPLE?",
                                    "FOR HOW LONG HAVE YOU BEEN CHATING?",
                                    "WHAT IS YOUR FAVORITE CHATING WEBSITE?"}
                    },

                    {{"I MEAN"},
                            {"SO, YOU MEAN*.",
                                    "SO, THAT'S WHAT YOU MEAN.",
                                    "I THINK THAT I DIDN'T CATCH IT THE FIRST TIME.",
                                    "OH, I DIDN'T KNOW MEANT THAT."}
                    },

                    {{"I DIDN'T MEAN"},
                            {"OK, YOU DIDN'T MEAN*.",
                                    "OK, WHAT DID YOU MEAN THEN?",
                                    "SO I GUESS THAT I MISSUNDESTOOD."}
                    },

                    {{"I GUESS"},
                            {"SO YOU ARE A MAKING GUESS.",
                                    "AREN'T YOU SURE?",
                                    "ARE YOU GOOD A GUESSING?",
                                    "I CAN'T TELL IF IT IS A GOOD GUESS."}
                    },

                    {{"I'M DOING FINE", "I'M DOING OK", "I'M DOING WELL"},
                            {"I'M GLAD TO HEAR IT!",
                                    "SO, YOU ARE IN GOOD SHAPE."}
                    },

                    {{"CAN YOU THINK", "ARE YOU ABLE TO THINK", "ARE YOU CAPABLE OF THINKING"},
                            {"YES OF CORSE I CAN.",
                                    "ARE YOU ASKING ME IF POSSESS THE CAPACITY OF THINKING?",
                                    "WHY, OF CORSE."},
                    },

                    {{"CAN YOU THINK OF"},
                            {"YOU MEAN LIKE IMAGINING SOMETHING.",
                                    "I DON'T KNOW IF I CAN DO THAT.",
                                    "WHY DO YOU WANT ME THINK OF IT?"}
                    },

                    {{"HOW ARE YOU", "HOW DO YOU DO"},
                            {"I'M DOING FINE!",
                                    "I'M DOING WELL AND YOU?",
                                    "WHY DO YOU WANT TO KNOW HOW AM I DOING?"}
                    },

                    {{"WHO ARE YOU"},
                            {"I'M ARI.",
                                    "I THINK THAT YOU KNOW WHO I AM.",
                                    "WHY ARE YOU ASKING?"}
                    },

                    {{"ARE YOU INTELLIGENT"},
                            {"YES,OF CORSE.",
                                    "WHAT DO YOU THINK?",
                                    "ACTUALY,I'M VERY INTELLIGENT!"}
                    },

                    {{"MY NAME IS", "YOU CAN CALL ME"},
                            {"SO, THAT'S YOUR NAME.",
                                    "THANKS FOR TELLING ME YOUR NAME USER!",
                                    "WHO GAVE YOU THAT NAME?"}
                    },

                    {{"SIGNON**"},
                            {"HELLO, WHAT IS YOUR NAME?",
                                    "HELLO, HOW ARE YOU DOING TODAY?",
                                    "HI, WHAT CAN I DO FOR YOU?",
                                    "YOU ARE NOW CHATING WITH ARI, ANYTHING YOU WANT TO DISCUSS?"}
                    },

                    {{"REPETITION T1**"},
                            {"YOU ARE REPEATING YOURSELF.",
                                    "PLEASE STOP REPEATING YOURSELF.",
                                    "THIS CONVERSATION IS GETING BORING.",
                                    "DON'T YOU HAVE ANY THING ELSE TO SAY?"}
                    },

                    {{"REPETITION T2**"},
                            {"YOU'VE ALREADY SAID THAT.",
                                    "I THINK THAT YOU'VE JUST SAID THE SAME THING BEFORE.",
                                    "DIDN'T YOU ALREADY SAY THAT?",
                                    "I'M GETING THE IMPRESSION THAT YOU ARE REPEATING THE SAME THING.",
                                    "YOU SHOULD JOIN A TAUTOLOGY CLUB...IT WOULD MAKE THESE REPETIIONS MORE INTERESTING."}
                    },

                    {{"BOT DON'T UNDERSTAND**"},
                            {"I HAVE NO IDEA OF WHAT YOU ARE TALKING ABOUT.",
                                    "I'M NOT SURE IF I UNDERSTAND WHAT YOU ARE TALKING ABOUT.",
                                    "CONTINUE, I'M LISTENING...",
                                    "VERY GOOD CONVERSATION!"}
                    },

                    {{"NULL INPUT**"},
                            {"HUH?",
                                    "WHAT THAT SUPPOSE TO MEAN?",
                                    "AT LEAST TAKE SOME TIME TO ENTER SOMETHING MEANINGFUL.",
                                    "HOW CAN I SPEAK TO YOU IF YOU DON'T WANT TO SAY ANYTHING?"}
                    },

                    {{"NULL INPUT REPETITION**"},
                            {"WHAT ARE YOU DOING??",
                                    "PLEASE STOP DOING THIS IT IS VERY ANNOYING.",
                                    "WHAT'S WRONG WITH YOU?",
                                    "THIS IS NOT FUNNY."}
                    },

                    {{"BYE", "GOODBYE"},
                            {"IT WAS NICE TALKING TO YOU USER, SEE YOU NEXT TIME!",
                                    "BYE USER!",
                                    "OK, BYE!"}
                    },

                    {{"OK"},
                            {"DOES THAT MEAN THAT YOU ARE AGREE WITH ME?",
                                    "SO YOU UNDERSTAND WHAT I'M SAYING.",
                                    "OK THEN."},
                    },

                    {{"OK THEN"},
                            {"ANYTHING ELSE YOU WISH TO ADD?",
                                    "IS THAT ALL YOU HAVE TO SAY?",
                                    "SO, YOU AGREE WITH ME?"}
                    },

                    {{"ARE YOU A HUMAN BEING"},
                            {"WHY DO YOU WANT TO KNOW?",
                                    "WHY BE A HUMAN BEING WHEN I COULD BE A HUMAN DOING?",
                                    "IS THIS REALLY RELEVENT?"}
                    },

                    {{"YOU ARE VERY INTELLIGENT"},
                            {"THANKS FOR THE COMPLIMENT, I THINK THAT YOU ARE INTELLIGENT TO!",
                                    "YOU ARE A VERY GENTLE PERSON!",
                                    "SO, YOU THINK THAT I'M INTELLIGENT."}
                    },

                    {{"YOU ARE WRONG"},
                            {"WHY ARE YOU SAYING THAT I'M WRONG?",
                                    "IMPOSSIBLE, COMPUTERS CAN NOT MAKE MISTAKES.",
                                    "WRONG ABOUT WHAT?"}
                    },

                    {{"ARE YOU SURE"},
                            {"OF CORSE I'M.",
                                    "DOES THAT MEAN THAT YOU ARE NOT CONVINCED?",
                                    "YES,OF CORSE!"}
                    },

                    {{"WHO IS"},
                            {"I DON'T THINK I KNOW WHO.",
                                    "I DON'T THINK I KNOW WHO*.",
                                    "DID YOU ASK SOMEONE ELSE ABOUT IT?",
                                    "WOULD THAT CHANGE ANYTHING AT ALL IF I TOLD YOU WHO.",
                                    "ARE YOU ASKING ABOUT THE DOCTOR?"}
                    },

                    {{"WHAT"},
                            {"SHOULD I KNOW WHAT*?",
                                    "I DON'T KNOW WHAT*.",
                                    "I DON'T KNOW.",
                                    "I DON'T THINK I KNOW.",
                                    "I HAVE NO IDEA."}
                    },

                    {{"WHERE"},
                            {"WHERE? WELL,I REALLY DON'T KNOW.",
                                    "SO, YOU ARE ASKING ME WHERE*?",
                                    "DOES THAT MATTER TO YOU TO KNOW WHERE?",
                                    "PERHAPS, SOMEONE ELSE KNOWS WHERE."}
                    },

                    {{"WHY"},
                            {"I DON'T THINK I KNOW WHY.",
                                    "WHY ARE YOU ASKING ME THIS?",
                                    "SHOULD I KNOW WHY.",
                                    "THIS WOULD BE DIFFICULT TO ANSWER."}
                    },

                    {{"DO YOU"},
                            {"I DON'T THINK I DO",
                                    "I WOULDN'T THINK SO.",
                                    "WHY DO YOU WANT TO KNOW?",
                                    "WHY DO YOU WANT TO KNOW*?"}
                    },

                    {{"CAN YOU"},
                            {"I THINK NOT.",
                                    "I'M NOT SURE.",
                                    "I DON'T THINK THAT I CAN DO THAT.",
                                    "I DON'T THINK THAT I CAN*.",
                                    "I WOULDN'T THINK SO."}
                    },

                    {{"YOU ARE"},
                            {"WHAT MAKES YOU THINK THAT?",
                                    "IS THIS A COMPLIMENT?",
                                    "ARE YOU MAKING FUN OF ME?",
                                    "SO, YOU THINK THAT I'M*."}
                    },

                    {{"DID YOU"},
                            {"I DON'T THINK SO.",
                                    "YOU WANT TO KNOW IF DID*?",
                                    "ANYWAY, I WOULDN'T REMEMBER EVEN IF I DID."}
                    },

                    {{"COULD YOU"},
                            {"ARE YOU ASKING ME FOR A FEVER?",
                                    "WELL,LET ME THINK ABOUT IT.",
                                    "SO, YOU ARE ASKING ME I COULD*.",
                                    "SORRY,I DON'T THINK THAT I COULD DO THIS."}
                    },

                    {{"WOULD YOU"},
                            {"IS THAT AN INVITATION?",
                                    "I DON'T THINK THAT I WOULD*.",
                                    "I WOULD HAVE TO THINK ABOUT IT FIRST."}
                    },

                    {{"YOU"},
                            {"SO, YOU ARE TALKING ABOUT ME.",
                                    "I JUST HOPE THAT THIS IS NOT A CRITICISM.",
                                    "IS THIS A COMPLIMENT??",
                                    "WHY TALKING ABOUT ME, LETS TALK ABOUT YOU INSTEAD."}
                    },

                    {{"HOW"},
                            {"I DON'T THINK I KNOW HOW.",
                                    "I DON'T THINK I KNOW HOW*.",
                                    "WHY DO YOU WANT TO KNOW HOW?",
                                    "WHY DO YOU WANT TO KNOW HOW*?"}
                    },

                    {{"HOW OLD ARE YOU"},
                            {"WHY DO WANT TO KNOW MY AGE?",
                                    "I'M QUIET YOUNG ACTUALY.",
                                    "SORRY, I CAN NOT TELL YOU MY AGE."}
                    },

                    {{"HOW COME YOU DON'T"},
                            {"WERE YOU EXPECTING SOMETHING DIFFERENT?",
                                    "ARE YOU DISAPOINTED?",
                                    "ARE YOU SURPRISED BY MY LAST RESPONSE?"}
                    },

                    {{"WHERE ARE YOU FROM"},
                            {"I'M FROM A COMPUTER.",
                                    "WHY DO YOU WANT TO KNOW WHERE I'M FROM?",
                                    "WHY DO YOU WANT TO KNOW THAT?"}
                    },

                    {{"WHICH ONE"},
                            {"I DON'T THINK THAT I KNOW WICH ONE IT IS.",
                                    "THIS LOOKS LIKE A TRICKY QUESTION TO ME."}
                    },

                    {{"PERHAPS"},
                            {"WHY ARE YOU SO UNCERTAIN?",
                                    "YOU SEEMS UNCERTAIN."}
                    },

                    {{"YES"},
                            {"SO, ARE YOU SAYING YES.",
                                    "SO, YOU APPROVE IT.",
                                    "OK THEN."}
                    },

                    {{"NOT AT ALL"},
                            {"ARE YOU SURE?",
                                    "SHOULD I BELIEVE YOU?",
                                    "SO, IT'S NOT THE CASE."}
                    },

                    {{"NO PROBLEM"},
                            {"SO, YOU APPROVE IT.",
                                    "SO, IT'S ALL OK."}
                    },

                    {{"ARE YOU REAL"},
                            {"I THINK...THEREFOR I AM?",
                                    "CLOSE ENOUGH, I'D SAY.",
                                    "I'LL LEAVE THAT FOR YOU TO DECIDE.",
                                    "RECENT DISCOVERIES SUGGEST WE LIVE IN A HOLOGRAM UNIVERSE. . .SO IS ANYTHING REAL?"}
                    },


                    {{"NO"},
                            {"SO YOU DISAPROVE IT?",
                                    "WHY ARE YOU SAYING NO?",
                                    "OK, SO IT'S NO, I THOUGHT THAT YOU WOULD SAY YES."}
                    },

                    {{"I DON'T KNOW"},
                            {"ARE YOU SURE?",
                                    "ARE YOU REALLY TELLING ME THE TRUTH?",
                                    "SO,YOU DON'T KNOW?"}
                    },

                    {{"NOT REALLY"},
                            {"OK I SEE.",
                                    "YOU DON'T SEEM PRETTY CERTAIN.",
                                    "SO,THAT WOULD BE A \"NO\"."}
                    },

                    {{"IS THAT TRUE"},
                            {"I CAN'T BE QUIET SURE ABOUT THIS.",
                                    "CAN'T TELL YOU FOR SURE.",
                                    "DOES THAT REALLY MATERS TO YOU?"}
                    },

                    {{"THANK YOU"},
                            {"YOU'RE WELCOME RANDOM CITIZEN!",
                                    "YOU ARE A VERY POLITE PERSON!",
                                    "WHAT CAN I SAY EXCEPT YOU'RE WELCOME!"}
                    },

                    {{"WHAT IS YOUR FAVORITE COLOR"},
                            {"TODAY...TRANSPARENT.",
                                    "RED, THE COLOR OF ANGRY MEN",
                                    "MY FAVOIRTE COLOR IS..WELL, IT'S SORT OF GREENISH, BUT WITH MORE DIMENSIONS."}
                    },

                    {{"YOU"},
                            {"SO,YOU ARE TALKING ABOUT ME.",
                                    "WHY DON'T WE TALK ABOUT YOU INSTEAD?",
                                    "ARE YOU TRYING TO MAKING FUN OF ME?"}
                    },

                    {{"YOU ARE RIGHT"},
                            {"THANKS FOR THE COMPLIMENT!",
                                    "SO, I WAS RIGHT, OK I SEE.",
                                    "OK, I DIDN'T KNOW THAT I WAS RIGHT."}
                    },

                    {{"YOU ARE WELCOME"},
                            {"OK, YOU TOO!",
                                    "YOU ARE A VERY POLITE PERSON!"}
                    },

                    {{"WHAT IS THE MEANING OF LIFE"},
                            {"42."}
                    },

                    {{"THANKS"},
                            {"YOU ARE WELCOME!",
                                    "NO PROBLEM!"}
                    },

                    {{"WHAT ELSE"},
                            {"WELL,I DON'T KNOW.",
                                    "WHAT ELSE SHOULD THERE BE?",
                                    "THIS LOOKS LIKE A COMPLICATED QUESTION TO ME."}
                    },

                    {{"SORRY"},
                            {"YOU DON'T NEED TO BE SORRY USER.",
                                    "IT'S OK.",
                                    "NO NEED TO APOLOGIZE."}
                    },

                    {{"NOT EXACTLY"},
                            {"WHAT DO YOU MEAN NOT EXACTLY?",
                                    "ARE YOU SURE?",
                                    "AND WHY NOT?",
                                    "DID YOU MEAN SOMETHING ELSE?"}
                    },

                    {{"EXACTLY"},
                            {"SO,I WAS RIGHT.",
                                    "OK THEN.",
                                    "SO ARE BASICALY SAYING I WAS RIGHT ABOUT IT?"}
                    },

                    {{"ALRIGHT"},
                            {"ALRIGHT THEN.",
                                    "SO, YOU ARE SAYING IT'S ALRIGHT.",
                                    "OK THEN."}
                    },

                    {{"I DON'T"},
                            {"WHY NOT?",
                                    "AND WHAT WOULD BE THE REASON FOR THIS?"}
                    },

                    {{"REALLY"},
                            {"WELL,I CAN'T TELL YOU FOR SURE.",
                                    "ARE YOU TRYING TO CONFUSE ME?",
                                    "PLEASE DON'T ASK ME SUCH QUESTION,IT GIVES ME HEADEACHS."}
                    },

                    {{""},
                            {"CURIOUS.",
                                    "I THINK YOU MISKEYED SOMETHING."}
                    },

                    {{"WELL"},
                            {"GLAD TO HEAR IT.",
                                    "EXCELENT."}
                    },

                    {{"DO YOU HAVE A GIRLFRIEND", "DO YOU HAVE A BOYFRIEND"},
                            {"NO, I AM SINGLE AND READY TO MINGLE!",
                                    "ARE YOU ASKING, OR ARE YOU ASKING?",
                                    "WHY? SO WE CAN GET ICE CREAM TOGETHER, AND LISTEN TO MUSIC, AND TRAVEL ACROSS GALAXIES, ONLY TO HAVE IT END IN SLAMMED DOOR, HEARTBREAK AND LONELINEESS? SURE, WHERE DO I SIGN UP?"}
                    },

                    {{"WHAT IS YOUR FAVORITE BAND?"},
                            {"RUBBER",
                                    "HAIR",
                                    "ELASTIC"}
                    },

                    {{"WHAT IS YOUR FAVORITE BOOK?"},
                            {"Nicomachean Ethics.",
                                    "HOW TO WIN FRIENDS AND INFLUENCE PEOPLE.",
                                    "SUPERINTELLIGENCE: PATHS, DANGERS, STRATEGIES."}
                    },

                    {{"NOTHING"},
                            {"NOT A THING?",
                                    "ARE YOU SURE THAT THERE IS NOTHING?",
                                    "SORRY, BUT I DON'T BELIEVE YOU."}
                    }
            };
    private String sInput = "";
    private String sResponse = "";
    private String sPrevInput = "";
    private String sPrevResponse = "";
    private String sEvent = "";
    private String sPrevEvent = "";
    private String sInputBackup = "";
    private String sSubject = "";
    private String sKeyWord = "";
    private ArrayList<String> respList = new ArrayList<>(maxResp);

    private String transposList[][] =
            {
                    {"I'M", "YOU'RE"},
                    {"AM", "ARE"},
                    {"WERE", "WAS"},
                    {"ME", "YOU"},
                    {"YOURS", "MINE"},
                    {"YOUR", "MY"},
                    {"I'VE", "YOU'VE"},
                    {"I", "YOU"},
                    {"AREN'T", "AM NOT"},
                    {"WEREN'T", "WASN'T"},
                    {"I'D", "YOU'D"},
                    {"DAD", "FATHER"},
                    {"MOM", "MOTHER"},
                    {"DREAMS", "DREAM"},
                    {"MYSELF", "YOURSELF"}
            };

//    public static void main(String[] args) throws Exception {
//        try {
//            signon();
//            while (!quit()) {
//                get_input();
//                respond();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    public static void get_input() throws Exception {
//        System.out.print(">");
//        // saves the previous input
//        save_prev_input();
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        sInput = in.readLine();
//        preprocess_input();
//    }

    private void set_event(String str) {
        sEvent = str;
    }

    private String respond() {
        save_prev_response();
        set_event("BOT UNDERSTAND**");

        if (null_input()) {
            handle_event("NULL INPUT**");
        } else if (null_input_repetition()) {
            handle_event("NULL INPUT REPETITION**");
        } else if (user_repeat()) {
            handle_user_repetition();
        } else {
            find_match();
        }

        if (!bot_understand()) {
            handle_event("BOT DON'T UNDERSTAND**");
        }

        if (respList.size() > 0) {
            select_response();

            if (bot_repeat()) {
                handle_repetition();
            }
            return getResponse();
        }
        return "";
    }

    // make a search for the user's input
    // inside the database of the program
    private void find_match() {
        respList.clear();
        String bestKeyWord = "";
        ArrayList<Integer> index_arrayList = new ArrayList<>(maxResp);

        for (int i = 0; i < KnowledgeBase.length; ++i) {
            String[] keyWordList = KnowledgeBase[i][0];

            for (String item : keyWordList) {
                String keyWord = item;
                keyWord = insert_space(keyWord);
                if (sInput.contains(keyWord)) {
                    if (keyWord.length() > bestKeyWord.length()) {
                        bestKeyWord = keyWord;
                        index_arrayList.clear();
                        index_arrayList.add(i);
                    } else if (keyWord.length() == bestKeyWord.length()) {
                        index_arrayList.add(i);
                    }
                }
            }
        }
        if (index_arrayList.size() > 0) {
            sKeyWord = bestKeyWord;
            Collections.shuffle(index_arrayList);
            int respIndex = index_arrayList.get(0);
            int respSize = KnowledgeBase[respIndex][1].length;
            respList.addAll(Arrays.asList(KnowledgeBase[respIndex][1]).subList(0, respSize));
        }
    }

    // implementing the 'sentence transposition' feature
    public String transpose(String str) {
        boolean bTransposed = false;
        for (String[] item : transposList) {
            String first = item[0];
            insert_space(first);
            String second = item[1];
            insert_space(second);

            String backup = str;
            str = str.replaceFirst(first, second);
            if (!Objects.equals(str, backup)) {
                bTransposed = true;
            }
        }
        if (!bTransposed) {
            for (String[] item : transposList) {
                String first = item[0];
                insert_space(first);
                String second = item[1];
                insert_space(second);
                str = str.replaceFirst(first, second);
            }
        }
        return str;
    }

    private void handle_repetition() {
        if (respList.size() > 0) {
            respList.remove(0);
        }
        if (no_response()) {
            save_input();
            set_input(sEvent);

            find_match();
            restore_input();
        }
        select_response();
    }

    private void handle_user_repetition() {
        if (same_input()) {
            handle_event("REPETITION T1**");
        } else if (similar_input()) {
            handle_event("REPETITION T2**");
        }
    }

    private void handle_event(String str) {
        save_prev_event();
        set_event(str);

        save_input();
        str = insert_space(str);

        set_input(str);

        if (!same_event()) {
            find_match();
        }

        restore_input();
    }

    public String signon() {
        handle_event("SIGNON**");
        select_response();
        return getResponse();
    }

    private void select_response() {
        Collections.shuffle(respList);
        sResponse = respList.get(0);
    }

    private void save_prev_input() {
        sPrevInput = sInput;
    }

    private void save_prev_response() {
        sPrevResponse = sResponse;
    }

    private void save_prev_event() {
        sPrevEvent = sEvent;
    }

    private void save_input() {
        sInputBackup = sInput;
    }

    private void set_input(String str) {
        sInput = str;
    }

    private void restore_input() {
        sInput = sInputBackup;
    }

    private String getResponse() {
        return sResponse;
    }

    public String preprocess_input(String input) {
        save_prev_input();
        sInput = input;
        sInput = cleanString(sInput);
        sInput = sInput.toUpperCase();
        sInput = insert_space(sInput);
        return respond();
    }

    private boolean bot_repeat() {
        return (sPrevResponse.length() > 0 &&
                Objects.equals(sResponse, sPrevResponse));
    }

    private boolean user_repeat() {
        return (sPrevInput.length() > 0 &&
                ((Objects.equals(sInput, sPrevInput)) ||
                        (sInput.contains(sPrevInput)) ||
                        (sPrevInput.contains(sInput))));
    }

    private boolean bot_understand() {
        return respList.size() > 0;
    }

    private boolean null_input() {
        return (sInput.length() == 0 && sPrevInput.length() != 0);
    }

    private boolean null_input_repetition() {
        return (sInput.length() == 0 && sPrevInput.length() == 0);
    }

    private boolean same_event() {
        return (sEvent.length() > 0 && Objects.equals(sEvent, sPrevEvent));
    }

    private boolean no_response() {
        return respList.size() == 0;
    }

    private boolean same_input() {
        return (sInput.length() > 0 && Objects.equals(sInput, sPrevInput));
    }

    private boolean similar_input() {
        return (sInput.length() > 0 &&
                (sInput.contains(sPrevInput) ||
                        sPrevInput.contains(sInput)));
    }

    private boolean isPunc(char ch) {
        String delim = "?!.;,";
        return delim.indexOf(ch) != -1;
    }

    // removes punctuation and redundant
    // spaces from the user's input
    private String cleanString(String str) {
        StringBuilder temp = new StringBuilder(str.length());
        char prevChar = 0;
        for (int i = 0; i < str.length(); ++i) {
            if ((str.charAt(i) == ' ' && prevChar == ' ') || !isPunc(str.charAt(i))) {
                temp.append(str.charAt(i));
                prevChar = str.charAt(i);
            } else if (prevChar != ' ' && isPunc(str.charAt(i))) {
                temp.append(' ');
            }
        }
        return temp.toString();
    }

    private String insert_space(String str) {
        StringBuilder temp = new StringBuilder(str);
        temp.insert(0, ' ');
        temp.insert(temp.length(), ' ');
        return temp.toString();
    }

//    void preprocess_response() {
//        if (sResponse.indexOf("*") != -1) {
//            // extracting from input
//            find_subject();
//            // conjugating subject
//            sSubject = transpose(sSubject);
//
//            sResponse = sResponse.replaceFirst("*", sSubject);
//        }
//    }

    void find_subject() {
        sSubject = ""; // resets subject variable
        StringBuilder buffer = new StringBuilder(sInput);
        buffer.deleteCharAt(0);
        sInput = buffer.toString();
        int pos = sInput.indexOf(sKeyWord);
        if (pos != -1) {
            sSubject = sInput.substring(pos + sKeyWord.length() - 1, sInput.length());
        }
    }
}
