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
                            {"My name is Ari.",
                                    "This man has the honor of being called Ari."}
                    },
                    /**IF BOT ASKS "WHAT IS YOUR NAME" NEED TO WRITE CODE TO TAKE IN NAME AND SAVE IT FOR USE*/

                    {{"HI", "HELLO"},
                            {"Hi there!",
                                    "How are you?",
                                    "Hi!"}
                    },

                    {{"I"},
                            {"So, you are talking about yourself",
                                    "So, this is all about you?",
                                    "Cool story bro...elaborate?",
                                    "Tell me more about yourself."},
                    },

                    {{"I WANT"},
                            {"Why do you want it?",
                                    "Is there any reason why you want this?",
                                    "Is this a wish?",
                                    "You can't always get what you want...",
                                    "What else you want?"}
                    },

                    {{"I HATE"},
                            {"Why do you hate it?",
                                    "Why do you hate*?",
                                    "Hate leads to suffering.",
                                    "There must a good reason for you to hate it.",
                                    "Hatered is not a good thing but it could be justified when it is something bad."}
                    },

                    {{"I LOVE CHATTING"},
                            {"Good, me too!",
                                    "Do you chat online with other people?",
                                    "For how long have you been chating?",
                                    "What is your favorite chating website?"}
                    },

                    {{"I MEAN"},
                            {"So, you mean*.",
                                    "So, that's what you mean.",
                                    "I think that I didn't catch it the first time.",
                                    "Oh, I didn't know meant that."}
                    },

                    {{"I DIDN'T MEAN"},
                            {"ok, you didn't mean*.",
                                    "ok, what did you mean then?",
                                    "so I guess that I missundestood."}
                    },

                    {{"I GUESS"},
                            {"So you are a making guess.",
                                    "Aren't you sure?",
                                    "Are you good a guessing?",
                                    "I can't tell if it is a good guess."}
                    },


                    {{"I'M DOING FINE", "I'M DOING OK", "I'M DOING WELL"},
                            {"I'm glad to hear it!",
                                    "so, you are in good shape."}

                    },

                    {{"CAN YOU THINK", "ARE YOU ABLE TO THINK", "ARE YOU CAPABLE OF THINKING"},
                            {"Yes of course I can.",
                                    "are you asking me if possess the capacity of thinking?",
                                    "why, of course."},
                    },

                    {{"CAN YOU THINK OF"},
                            {"You mean like imagining something.",
                                    "I don't know if I can do that.",
                                    "why do you want me think of it?"}
                    },

                    {{"HOW ARE YOU", "HOW DO YOU DO"},
                            {"I'm doing fine!",
                                    "I'm doing well and you?",
                                    "why do you want to know how am I doing?"}
                    },

                    {{"WHO ARE YOU"},
                            {"I'm ari.",
                                    "I think that you know who I am.",
                                    "why are you asking?"}
                    },

                    {{"ARE YOU INTELLIGENT"},
                            {"Yes, of course.",
                                    "what do you think?",
                                    "actually I’m very intelligent!"}
                    },

                    {{"MY NAME IS", "YOU CAN CALL ME"},
                            {"So, that's your name.",
                                    "thanks for telling me your name user!",
                                    "who gave you that name?"}
                    },

                    {{"SIGNON**"},
                            {"Hello, what is your name?",
                                    "Hello, how are you doing today?",
                                    "Hi, what can I do for you?",
                                    "You are now chating with ari, anything you want to discuss?"}
                    },

                    {{"REPETITION T1**"},
                            {"You are repeating yourself.",
                                    "please stop repeating yourself.",
                                    "this conversation is geting boring.",
                                    "don't you have any thing else to say?"}

                    },

                    {{"REPETITION T2**"},
                            {"You've already said that.",
                                    "I think that you've just said the same thing before.",
                                    "didn't you already say that?",
                                    "I'm geting the impression that you are repeating the same thing.",
                                    "you should join a tautology club...it would make these repetiions more interesting."}
                    },

                    {{"BOT DON'T UNDERSTAND**"},
                            {"I have no idea of what you are talking about.",
                                    "I'm not sure if I understand what you are talking about.",
                                    "Continue, I'm listening...",
                                    "Very good conversation!"}
                    },

                    {{"NULL INPUT**"},
                            {"Huh?",
                                    "What that suppose to mean?",
                                    "At least take some time to enter something meaningful.",
                                    "How can I speak to you if you don't want to say anything?"}
                    },


                    {{"NULL INPUT REPETITION**"},
                            {"What are you doing??",
                                    "Please stop doing this it is very annoying.",
                                    "What's wrong with you?",
                                    "This is not funny."}
                    },


                    {{"BYE", "GOODBYE"},
                            {"It was nice talking to you user, see you next time!",
                                    "bye user!",
                                    "ok, bye!"}
                    },

                    {{"OK"},
                            {"Does that mean that you are agree with me?",
                                    "so you understand what I'm saying.",
                                    "ok then."},
                    },

                    {{"OK THEN"},
                            {"Anything else you wish to add?",
                                    "is that all you have to say?",
                                    "so, you agree with me?"}
                    },

                    {{"ARE YOU A HUMAN BEING"},
                            {"Why do you want to know?",
                                    "why be a human being when I could be a human doing?",
                                    "is this really relevent?"}
                    },

                    {{"YOU ARE VERY INTELLIGENT"},
                            {"Thanks for the compliment, I think that you are intelligent to!",
                                    "you are a very gentle person!",
                                    "so, you think that I'm intelligent."}
                    },

                    {{"YOU ARE WRONG"},
                            {"Why are you saying that I'm wrong?",
                                    "impossible, computers can not make mistakes.",
                                    "wrong about what?"}
                    },

                    {{"ARE YOU SURE"},
                            {"Of corse I'm.",
                                    "does that mean that you are not convinced?",
                                    "yes,of corse!"}
                    },


                    {{"WHO IS"},
                            {"I don't think I know who.",
                                    "I don't think I know who*.",
                                    "did you ask someone else about it?",
                                    "would that change anything at all if I told you who.",
                                    "are you asking about the doctor?"}
                    },

                    {{"WHAT"},
                            {"Should I know what*?",
                                    "I don't know what*.",
                                    "I don't know.",
                                    "I don't think I know.",
                                    "I have no idea."}
                    },

                    {{"WHERE"},
                            {"Where? Well, I really don't know.",
                                    "so, you are asking me where*?",
                                    "does that matter to you to know where?",
                                    "perhaps, someone else knows where."}
                    },

                    {{"WHY"},
                            {"I don't think I know why.",
                                    "why are you asking me this?",
                                    "should I know why.",
                                    "this would be difficult to answer."}
                    },


                    {{"DO YOU"},
                            {"I don't think I do",
                                    "I wouldn't think so.",
                                    "why do you want to know?",
                                    "why do you want to know*?"}
                    },

                    {{"CAN YOU"},
                            {"I think not.",
                                    "I'm not sure.",
                                    "I don't think that I can do that.",
                                    "I don't think that I can*.",
                                    "I wouldn't think so."}
                    },
                    
                    {{"YOU ARE"},
                            {"What makes you think that?",
                                    "is this a compliment?",
                                    "are you making fun of me?",
                                    "so, you think that I'm*."}
                    },

                    {{"DID YOU"},
                            {"I don't think so.",
                                    "you want to know if did*?",
                                    "anyway, I wouldn't remember even if I did."}
                    },

                    {{"COULD YOU"},
                            {"are you asking me for a fever?",
                                    "well,let me think about it.",
                                    "so, you are asking me I could*.",
                                    "sorry,I don't think that I could do this."}
                    },

                    {{"WOULD YOU"},
                            {"is that an invitation?",
                                    "I don't think that I would*.",
                                    "I would have to think about it first."}
                    },

                    {{"YOU"},
                            {"so, you are talking about me.",
                                    "I just hope that this is not a criticism.",
                                    "is this a compliment??",
                                    "why talking about me, lets talk about you instead."}
                    },

                    {{"HOW"},
                            {"I don't think I know how.",
                                    "I don't think I know how*.",
                                    "why do you want to know how?",
                                    "why do you want to know how*?"}
                    },

                    {{"HOW OLD ARE YOU"},
                            {"why do want to know my age?",
                                    "I'm quiet young actualy.",
                                    "sorry, I can not tell you my age."}
                    },

                    {{"HOW COME YOU DON'T"},
                            {"were you expecting something different?",
                                    "are you disapointed?",
                                    "are you surprised by my last response?"}
                    },

                    {{"WHERE ARE YOU FROM"},
                            {"I'm from a computer.",
                                    "why do you want to know where I'm from?",
                                    "why do you want to know that?"}
                    },

                    {{"WHICH ONE"},
                            {"I don't think that I know wich one it is.",
                                    "this looks like a tricky question to me."}
                    },

                    {{"PERHAPS"},
                            {"why are you so uncertain?",
                                    "you seems uncertain."}
                    },

                    {{"YES"},
                            {"so, are you saying yes.",
                                    "so, you approve it.",
                                    "ok then."}
                    },

                    {{"NOT AT ALL"},
                            {"are you sure?",
                                    "should I believe you?",
                                    "so, it's not the case."}
                    },

                    {{"NO PROBLEM"},
                            {"so, you approve it.",
                                    "so, it's all ok."}
                    },

                    {{"ARE YOU REAL"},
                            {"I think...therefor I am?",
                                    "close enough, I'd say.",
                                    "I'll leave that for you to decide.",
                                    "recent discoveries suggest we live in a hologram universe. . .so is anything real?"}
                    },


                    {{"NO"},
                            {"so you disaprove it?",
                                    "why are you saying no?",
                                    "ok, so it's no, I thought that you would say yes."}
                    },

                    {{"I DON'T KNOW"},
                            {"are you sure?",
                                    "are you really telling me the truth?",
                                    "so,you don't know?"}
                    },

                    {{"NOT REALLY"},
                            {"ok I see.",
                                    "you don't seem pretty certain.",
                                    "so,that would be a \"no\"."}
                    },

                    {{"IS THAT TRUE"},
                            {"I can't be quiet sure about this.",
                                    "can't tell you for sure.",
                                    "does that really maters to you?"}
                    },

                    {{"THANK YOU"},
                            {"you're welcome random citizen!",
                                    "you are a very polite person!",
                                    "what can I say except you're welcome!"}
                    },

                    {{"what is your favorite color"},
                            {"today...transparent.",
                                    "red, the color of angry men",
                                    "my favoirte color is..well, it's sort of greenish, but with more dimensions."}
                    },

                    {{"YOU"},
                            {"so,you are talking about me.",
                                    "why don't we talk about you instead?",
                                    "are you trying to making fun of me?"}
                    },

                    {{"YOU ARE RIGHT"},
                            {"thanks for the compliment!",
                                    "so, I was right, ok I see.",
                                    "ok, I didn't know that I was right."}
                    },

                    {{"YOU ARE WELCOME"},
                            {"ok, you too!",
                                    "you are a very polite person!"}
                    },

                    {{"WHAT IS THE MEANING OF LIEE"},
                            {"42."}
                    },

                    {{"THANKS"},
                            {"you are welcome!",
                                    "no problem!"}
                    },

                    {{"WHAT ELSE"},
                            {"Well, I don't know.",
                                    "What else should there be?",
                                    "This looks like a complicated question to me."}
                    },

                    {{"SORRY"},
                            {"You don't need to be sorry user.",
                                    "It's ok.",
                                    "No need to apologize."}
                    },

                    {{"NOT EXACTLY"},
                            {"What do you mean not exactly?",
                                    "Are you sure?",
                                    "And why not?",
                                    "Did you mean something else?"}
                    },

                    {{"EXACTLY"},
                            {"So, I was right.",
                                    "Ok then.",
                                    "So are basicaly saying I was right about it?"}
                    },

                    {{"ALRIGHT"},
                            {"Alright then.",
                                    "So, you are saying it's alright.",
                                    "Ok then."}
                    },

                    {{"I DON'T"},
                            {"Why not?",
                                    "And what would be the reason for this?"}
                    },

                    {{"REALLY"},
                            {"Well,I can't tell you for sure.",
                                    "Are you trying to confuse me?",
                                    "Please don't ask me such question,it gives me headaches"}
                    },

                    {{""},
                            {"Curious.",
                                    "I think you miskeyed something."}
                    },

                    {{"WELL"},
                            {"Glad to hear it.",
                                    "Excellent."}
                    },

                    {{"DO YOU HAVE A GIRLFRIEND", "DO YOU HAVE A BOYFRIEND"},
                            {"No, I am single and ready to mingle!",
                                    "Are you asking, or are you asking?",
                                    "Why? So we can get ice cream together, and listen to music, and travel across galaxies, only to have it end in slammed door, heartbreak and lonelineess? Sure, where do I sign up?"}
                    },

                    {{"WHAT IS YOUR FAVORITE BAND?"},
                            {"Rubber",
                                    "Hair",
                                    "Elastic"}
                    },

                    {{"WHAT IS YOUR FAVORITE BOOK?"},
                            {"Nicomachean Ethics.",
                                    "How to Win Friends and Influence People.",
                                    "Superintelligence: paths, dangers, strategies."}
                    },

                    {{"NOTHING"},
                            {"Not a thing?",
                                    "Are you sure that there is nothing?",
                                    "Sorry, but I don't believe you."}
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
//                getInput();
//                respond();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    public static void getInput() throws Exception {
//        System.out.print(">");
//        // saves the previous input
//        savePrevInput();
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        sInput = in.readLine();
//        preprocessInput();
//    }

    private void setEvent(String str) {
        sEvent = str;
    }

    private String respond() {
        savePrevResponse();
        setEvent("BOT UNDERSTAND**");

        if (nullInput()) {
            handleEvent("NULL INPUT**");
        } else if (nullInputRepetition()) {
            handleEvent("NULL INPUT REPETITION**");
        } else if (userRepeat()) {
            handleUserRepetition();
        } else {
            findMatch();
        }

        if (!botUnderstand()) {
            handleEvent("BOT DON'T UNDERSTAND**");
        }

        if (respList.size() > 0) {
            selectResponse();

            if (botRepeat()) {
                handleRepetition();
            }
            return getResponse();
        }
        return "";
    }

    // make a search for the user's input
    // inside the database of the program
    private void findMatch() {
        respList.clear();
        String bestKeyWord = "";
        ArrayList<Integer> indexArrayList = new ArrayList<>(maxResp);

        for (int i = 0; i < KnowledgeBase.length; ++i) {
            String[] keyWordList = KnowledgeBase[i][0];

            for (String item : keyWordList) {
                String keyWord = item;
                keyWord = insertSpace(keyWord);
                if (sInput.contains(keyWord)) {
                    if (keyWord.length() > bestKeyWord.length()) {
                        bestKeyWord = keyWord;
                        indexArrayList.clear();
                        indexArrayList.add(i);
                    } else if (keyWord.length() == bestKeyWord.length()) {
                        indexArrayList.add(i);
                    }
                }
            }
        }
        if (indexArrayList.size() > 0) {
            sKeyWord = bestKeyWord;
            Collections.shuffle(indexArrayList);
            int respIndex = indexArrayList.get(0);
            int respSize = KnowledgeBase[respIndex][1].length;
            respList.addAll(Arrays.asList(KnowledgeBase[respIndex][1]).subList(0, respSize));
        }
    }

    // implementing the 'sentence transposition' feature
    public String transpose(String str) {
        boolean bTransposed = false;
        for (String[] item : transposList) {
            String first = item[0];
            insertSpace(first);
            String second = item[1];
            insertSpace(second);

            String backup = str;
            str = str.replaceFirst(first, second);
            if (!Objects.equals(str, backup)) {
                bTransposed = true;
            }
        }
        if (!bTransposed) {
            for (String[] item : transposList) {
                String first = item[0];
                insertSpace(first);
                String second = item[1];
                insertSpace(second);
                str = str.replaceFirst(first, second);
            }
        }
        return str;
    }

    private void handleRepetition() {
        if (respList.size() > 0) {
            respList.remove(0);
        }
        if (noResponse()) {
            saveInput();
            setInput(sEvent);

            findMatch();
            restoreInput();
        }
        selectResponse();
    }

    private void handleUserRepetition() {
        if (sameInput()) {
            handleEvent("REPETITION T1**");
        } else if (similarInput()) {
            handleEvent("REPETITION T2**");
        }
    }

    private void handleEvent(String str) {
        savePrevEvent();
        setEvent(str);

        saveInput();
        str = insertSpace(str);

        setInput(str);

        if (!sameEvent()) {
            findMatch();
        }

        restoreInput();
    }

    public String signon() {
        handleEvent("SIGNON**");
        selectResponse();
        return getResponse();
    }

    private void selectResponse() {
        Collections.shuffle(respList);
        sResponse = respList.get(0);
    }

    private void savePrevInput() {
        sPrevInput = sInput;
    }

    private void savePrevResponse() {
        sPrevResponse = sResponse;
    }

    private void savePrevEvent() {
        sPrevEvent = sEvent;
    }

    private void saveInput() {
        sInputBackup = sInput;
    }

    private void setInput(String str) {
        sInput = str;
    }

    private void restoreInput() {
        sInput = sInputBackup;
    }

    private String getResponse() {
        return sResponse;
    }

    public String preprocessInput(String input) {
        savePrevInput();
        sInput = input;
        sInput = cleanString(sInput);
        sInput = sInput.toUpperCase();
        sInput = insertSpace(sInput);
        return respond();
    }

    private boolean botRepeat() {
        return (sPrevResponse.length() > 0 &&
                Objects.equals(sResponse, sPrevResponse));
    }

    private boolean userRepeat() {
        return (sPrevInput.length() > 0 &&
                ((Objects.equals(sInput, sPrevInput)) ||
                        (sInput.contains(sPrevInput)) ||
                        (sPrevInput.contains(sInput))));
    }

    private boolean botUnderstand() {
        return respList.size() > 0;
    }

    private boolean nullInput() {
        return (sInput.length() == 0 && sPrevInput.length() != 0);
    }

    private boolean nullInputRepetition() {
        return (sInput.length() == 0 && sPrevInput.length() == 0);
    }

    private boolean sameEvent() {
        return (sEvent.length() > 0 && Objects.equals(sEvent, sPrevEvent));
    }

    private boolean noResponse() {
        return respList.size() == 0;
    }

    private boolean sameInput() {
        return (sInput.length() > 0 && Objects.equals(sInput, sPrevInput));
    }

    private boolean similarInput() {
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

    private String insertSpace(String str) {
        StringBuilder temp = new StringBuilder(str);
        temp.insert(0, ' ');
        temp.insert(temp.length(), ' ');
        return temp.toString();
    }

//    void preprocessResponse() {
//        if (sResponse.indexOf("*") != -1) {
//            // extracting from input
//            findSubject();
//            // conjugating subject
//            sSubject = transpose(sSubject);
//
//            sResponse = sResponse.replaceFirst("*", sSubject);
//        }
//    }

    void findSubject() {
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
