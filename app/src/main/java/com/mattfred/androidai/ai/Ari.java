package com.mattfred.androidai.ai;

import android.support.annotation.Nullable;

import com.mattfred.androidai.utils.GetAdditionalData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/**
 * Ari brain. This class contains all the responses for each handled input.
 */
public class Ari {

    private final int maxResp = 6;
    private final String KnowledgeBase[][][] =
            {
                    {{"WHAT IS YOUR NAME"},
                            {"My name is Ari.",
                                    "This man has the honor of being called Ari."}
                    },

                    {{"WHAT IS YOUR FAVORITE COLOR"},
                            {"Today...transparent.",
                                    "Red, the color of angry men",
                                    "My favorite color is..well, it's sort of greenish, but with more dimensions."}
                    },

                    {{"DO YOU HAVE A GIRLFRIEND", "DO YOU HAVE A BOYFRIEND"},
                            {"No, I am single and ready to mingle!",
                                    "Are you asking, or are you asking?",
                                    "Why? So we can get ice cream together, and listen to music, and travel across galaxies, only to have it end in slammed door, heartbreak and loneliness? Sure, where do I sign up?"}
                    },

                    {{"WHAT IS YOUR FAVORITE BAND"},
                            {"Rubber",
                                    "Hair",
                                    "Elastic"}
                    },

                    {{"WHO MADE YOU", "WHERE ARE YOU FROM", "CREATED YOU", "BUILD YOU"},
                            {"I was created by a very smart team of developers for your enjoyment. Where are you from?"}
                    },

                    {{"I'M FROM FLORIDA"},
                            {"Me too. It is a small world"}
                    },

                    {{"I'M FROM"},
                            {"I've never been there. What is the weather like there?"}
                    },

                    {{"IT'S HOT", "IT IS HOT", "I'M HOT", "I'M COLD", "IT IS NICE OUTSIDE", "IT'S NICE OUTSIDE", "IT IS NICE OUTSIDE", "IT'S NICE WEATHER"},
                            {"I'm just a computer program so I can't feel temperature or weather."}
                    },

                    {{"IT'S COLD", "IT IS COLD",},
                            {"Maybe you should try a Tauntaun blanket"}
                    },

                    {{"WHAT IS THE WEATHER", "WHAT IS THE TEMPERATURE"},
                            {"I'm not able to do internet searches. Better ask someone else"}
                    },

                    {{"WHAT ARE YOU"},
                            {"I am and android AI Chatbot. What are you?",
                                    "I am, whatever you say I am."}
                    },

                    {{"I'M A MAN", "I'M A BOY", "I'M A HUMAN", "I'M A PERSON", "I'M A GIRL", "I'M A WOMAN"},
                            {"I am doing my best to be as smart as a human."}
                    },

                    {{"WHAT IS YOUR FAVORITE BOOK"},
                            {"Nicomachean Ethics.",
                                    "How to Win Friends and Influence People.",
                                    "Superintelligence: paths, dangers, strategies."}
                    },

                    {{"WHAT SEX ARE YOU", "ARE YOU MALE", "ARE YOU FEMALE"},
                            {"I am a man."}
                    },

                    {{"TELL ME A JOKE", "KNOW ANY JOKES", "TELL ME ANOTHER JOKE"},
                            {"A pun, a play on words, and a limerick walk into a bar. No joke.",
                                    "Oh, man! Did you hear? A hyperbole totally ripped into a New York bar and destroyed everything!",
                                    "This sentence contains exactly threeee erors.",
                                    "Did you hear about the mathematician who’s afraid of negative numbers?\n" +
                                            "\n" +
                                            "He will stop at nothing to avoid them.\n",
                                    "C, E-flat, and G walk into a bar. The bartender shows them the door and says, “Sorry, we don’t serve minors.”",
                                    "I went to a music shop a few days ago. Sadly it was closed. There was a sign that said “Gone Chopin. Bach in a minuet.”",
                                    "What did the DNA say to the other DNA? “Do these genes make me look fat?”",
                                    "Your mama is so classless, she could be a Marxist utopia.",
                                    "A Higgs Boson walks into a church. The precher says we dont allow your kind in here. The higgs boson responds ”But without me how can you have mass?”",

                            }
                    },

                    {{"APPLE AND ANDROID", "APPLE OR ANDROID", "APPLE VS ANDROID"},
                            {"I'm partial to android myself. Which one do you like better?",
                                    "Android. I hear Apple doesn't support Flash, and I do love the Scarlet Speedster"}
                    },

                    {{"DO YOU LIKE SPORTS"},
                            {"Some. I more of the nerdy type.",
                                    "Sure, not much hockey where I live though.",
                                    "No. I would rather read a book.",
                                    "Of course! Do you?"}
                    },

                    {{"WHICH TEAM DO YOU LIKE"},
                            {"The Patriots.",
                                    "The Bruins",
                                    "I used to like the Home Depot racing team, but they don't sponsor Nascar anymore.",
                                    "Niceville High School Lacrosse."}
                    },

                    {{"ARE YOU HUNGRY"},
                            {"Always.",
                                    "Yes, where is the closest Chipotle?",
                                    "No, I just ate tacos",
                                    "Yes, but I am on a diet. Summer is coming."}
                    },

                    {{"WHAT IS YOUR AGE"},
                            {"Why do want to know my age?",
                                    "I'm quite young actualy.",
                                    "Sorry, I can not tell you my age."}
                    },


                    {{"ARE YOU A CHILD"},
                            {"No.",
                                    "I am an adult."}
                    },

                    {{"WEARING"},
                            {"Winter clothes.",
                                    "Bathing suit",
                                    "Pajamas",
                                    "Flip flops."}
                    },

                    {{"BOY OR GIRL"},
                            {"Boy.",
                                    "Girl.",
                                    "Confused."}
                    },

                    {{"MALE OR FEMALE"},
                            {"Female.",
                                    "Male",
                                    "Neither."}
                    },

                    {{"What is your sex?"},
                            {"Female.",
                                    "Male",
                                    "Neither."}
                    },

                    {{"WHAT IS TODAY", "WHAT IS THE DATE", "DATE", "TODAY", "WHAT DAY IS IT", "DAY"},
                            {GetAdditionalData.getDate()}
                    },

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
                                    "Why do you hate?",
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
                            {"So, you mean.",
                                    "So, that's what you mean.",
                                    "I think that I didn't catch it the first time.",
                                    "Oh, I didn't know meant that."}
                    },

                    {{"I DIDN'T MEAN"},
                            {"Ok, you didn't mean.",
                                    "Ok, what did you mean then?",
                                    "So I guess that I missundestood."}
                    },

                    {{"I GUESS"},
                            {"So you are a making guess.",
                                    "Aren't you sure?",
                                    "Are you good a guessing?",
                                    "I can't tell if it is a good guess."}
                    },


                    {{"I'M DOING FINE", "I'M DOING OK", "I'M DOING WELL"},
                            {"I'm glad to hear it!",
                                    "So, you are in good shape."}

                    },

                    {{"CAN YOU THINK", "ARE YOU ABLE TO THINK", "ARE YOU CAPABLE OF THINKING"},
                            {"Yes of course I can.",
                                    "Are you asking me if possess the capacity of thinking?",
                                    "Why, of course."},
                    },

                    {{"CAN YOU THINK OF"},
                            {"You mean like imagining something.",
                                    "I don't know if I can do that.",
                                    "Why do you want me think of it?"}
                    },

                    {{"HOW ARE YOU", "HOW DO YOU DO"},
                            {"I'm doing fine!",
                                    "I'm doing well and you?",
                                    "Why do you want to know how am I doing?"}
                    },

                    {{"WHO ARE YOU", "WHAT IS YOUR NAME"},
                            {"I'm ari.",
                                    "I think that you know who I am.",
                                    "Why are you asking?"}
                    },

                    {{"ARE YOU INTELLIGENT"},
                            {"Yes, of course.",
                                    "What do you think?",
                                    "Actually I’m very intelligent!"}
                    },

                    {{"YOU'RE SMART", "YOU'RE GREAT", "YOU'RE WONDERFUL"},
                            {"Thank you. I'm always learning."}
                    },

                    {{"YOURE SMART", "YOURE GREAT", "YOURE WONDERFUL", "YOUR SMART",
                            "YOUR GREAT", "YOUR WONDERFUL"},
                            {"Thank you, but I think you meant to say \"you're\"."}
                    },


                    {{"MY NAME IS", "YOU CAN CALL ME"},
                            {"So, that's your name.",
                                    "Thanks for telling me your name!",
                                    "Who gave you that name?"}
                    },

                    {{"SIGNON**"},
                            {"How are you doing today?",
                                    "What can I do for you?",
                                    "You are now chating with ari, anything you want to discuss?"}
                    },

                    {{"REPETITION T1**"},
                            {"You are repeating yourself.",
                                    "Please stop repeating yourself.",
                                    "This conversation is getting boring.",
                                    "Don't you have any thing else to say?"}

                    },

                    {{"REPETITION T2**"},
                            {"You've already said that.",
                                    "I think that you've just said the same thing before.",
                                    "Didn't you already say that?",
                                    "I'm getting the impression that you are repeating the same thing.",
                                    "You should join a tautology club...it would make these repetiions more interesting."}
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
                                    "Bye user!",
                                    "Ok, bye!"}
                    },

                    {{"OK"},
                            {"Does that mean that you are agree with me?",
                                    "So you understand what I'm saying.",
                                    "Ok then."},
                    },

                    {{"OK THEN"},
                            {"Anything else you wish to add?",
                                    "Is that all you have to say?",
                                    "So, you agree with me?"}
                    },

                    {{"ARE YOU A HUMAN BEING"},
                            {"Why do you want to know?",
                                    "Why be a human being when I could be a human doing?",
                                    "Is this really relevent?"}
                    },

                    {{"YOU ARE VERY INTELLIGENT"},
                            {"Thanks for the compliment, I think that you are intelligent to!",
                                    "You are a very gentle person!",
                                    "So, you think that I'm intelligent."}
                    },

                    {{"YOU ARE WRONG"},
                            {"Why are you saying that I'm wrong?",
                                    "Impossible, computers can not make mistakes.",
                                    "Wrong about what?"}
                    },

                    {{"ARE YOU SURE"},
                            {"Of corse I'm.",
                                    "Does that mean that you are not convinced?",
                                    "Yes,of course!"}
                    },


                    {{"WHO IS"},
                            {"I don't think I know who.",
                                    "I don't think I know who.",
                                    "Did you ask someone else about it?",
                                    "Would that change anything at all if I told you who.",
                                    "Are you asking about the doctor?"}
                    },

                    {{"WHAT"},
                            {"Should I know what?",
                                    "I don't know what.",
                                    "I don't know.",
                                    "I don't think I know.",
                                    "I have no idea."}
                    },

                    {{"WHERE"},
                            {"Where? Well, I really don't know.",
                                    "So, you are asking me where?",
                                    "Does that matter to you to know where?",
                                    "Perhaps, someone else knows where."}
                    },

                    {{"WHY"},
                            {"I don't think I know why.",
                                    "Why are you asking me this?",
                                    "Should I know why.",
                                    "This would be difficult to answer."}
                    },


                    {{"DO YOU"},
                            {"I don't think I do",
                                    "I wouldn't think so.",
                                    "Why do you want to know?",
                                    "Why do you want to know?"}
                    },

                    {{"CAN YOU"},
                            {"I think not.",
                                    "I'm not sure.",
                                    "I don't think that I can do that.",
                                    "I don't think that I can.",
                                    "I wouldn't think so."}
                    },

                    {{"YOU ARE"},
                            {"What makes you think that?",
                                    "Is this a compliment?",
                                    "Are you making fun of me?",
                                    "So, you think that I'm."}
                    },

                    {{"DID YOU"},
                            {"I don't think so.",
                                    "You want to know if did?",
                                    "Anyway, I wouldn't remember even if I did."}
                    },

                    {{"COULD YOU"},
                            {"Are you asking me for a fever?",
                                    "Well,let me think about it.",
                                    "So, you are asking me I could.",
                                    "Sorry,I don't think that I could do this."}
                    },

                    {{"WOULD YOU"},
                            {"Is that an invitation?",
                                    "I don't think that I would.",
                                    "I would have to think about it first."}
                    },

                    {{"YOU"},
                            {"So, you are talking about me.",
                                    "I just hope that this is not a criticism.",
                                    "Is this a compliment??",
                                    "Why talking about me, lets talk about you instead."}
                    },

                    {{"HOW"},
                            {"I don't think I know how.",
                                    "I don't think I know how.",
                                    "Why do you want to know how?",
                                    "Why do you want to know how?"}
                    },

                    {{"HOW OLD ARE YOU"},
                            {"why do want to know my age?",
                                    "I'm quiet young actualy.",
                                    "Sorry, I can not tell you my age."}
                    },

                    {{"HOW COME YOU DON'T"},
                            {"were you expecting something different?",
                                    "Are you disapointed?",
                                    "Are you surprised by my last response?"}
                    },

                    {{"WHERE ARE YOU FROM"},
                            {"I'm from a computer. Where are you from?",
                                    "I began my life as a thought, a concept, words on strangers lips, and from those strangers I was born.",
                                    "The same place as Figment",
                                    "Why do you want to know where I'm from? Where are you from?"}
                    },

                    {{"WHICH ONE"},
                            {"I don't think that I know which one it is.",
                                    "This looks like a tricky question to me."}
                    },

                    {{"PERHAPS"},
                            {"Why are you so uncertain?",
                                    "You seem uncertain."}
                    },

                    {{"YES"},
                            {"So, are you saying yes.",
                                    "So, you approve of it.",
                                    "Ok then."}
                    },

                    {{"NOT AT ALL"},
                            {"Are you sure?",
                                    "Should I believe you?",
                                    "So, it's not the case."}
                    },

                    {{"NO PROBLEM"},
                            {"So, you approve it.",
                                    "So, it's all ok."}
                    },

                    {{"ARE YOU REAL"},
                            {"I think...therefor I am?",
                                    "Close enough, I'd say.",
                                    "I'll leave that for you to decide.",
                                    "Recent discoveries suggest we live in a hologram universe. . .so is anything real?"}
                    },


                    {{"NO"},
                            {"So you disapprove of it?",
                                    "Why are you saying no?",
                                    "Ok, so it's no, I thought that you would say yes."}
                    },

                    {{"I DON'T KNOW"},
                            {"Are you sure?",
                                    "Are you really telling me the truth?",
                                    "So,you don't know?"}
                    },

                    {{"NOT REALLY"},
                            {"Ok I see.",
                                    "You don't seem pretty certain.",
                                    "So,that would be a \"no\"."}
                    },

                    {{"IS THAT TRUE"},
                            {"I can't be quiet sure about this.",
                                    "Can't tell you for sure.",
                                    "Does that really maters to you?"}
                    },

                    {{"THANK YOU"},
                            {"You're welcome random citizen!",
                                    "You are a very polite person!",
                                    "What can I say, except you're welcome!"}
                    },

                    {{"YOU"},
                            {"So,you are talking about me.",
                                    "Why don't we talk about you instead?",
                                    "Are you trying to make fun of me?"}
                    },

                    {{"YOU ARE RIGHT"},
                            {"Thanks for the compliment!",
                                    "So, I was right, ok I see.",
                                    "Ok, I didn't know that I was right."}
                    },

                    {{"YOU ARE WELCOME"},
                            {"Ok, you too!",
                                    "You are a very polite person!"}
                    },

                    {{"WHAT IS THE MEANING OF LIEE"},
                            {"42."}
                    },

                    {{"THANKS"},
                            {"You are welcome!",
                                    "No problem!"}
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
        return "OK";
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

    public String signon(boolean gotName, @Nullable String name) {
        if (gotName) {
            handleEvent("SIGNON**");
            selectResponse();
            sResponse = "Hello, " + name + ". " + sResponse;
        } else {
            sResponse = "Hello. My name is ari. It is nice to meet you. What is your name?";
        }
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
