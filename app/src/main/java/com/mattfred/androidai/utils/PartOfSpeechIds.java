package com.mattfred.androidai.utils;

import java.util.HashMap;

/**
 * Part of Speech Identifier
 */

public class PartOfSpeechIds {

    public static String getPartsOfSpeech(String[] parts) {
        HashMap<String, String> map = getHashMap();
        return null;
    }

    private static HashMap<String, String> getHashMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("CC", "Coordinating Conjunctions");
        return map;
    }
}
