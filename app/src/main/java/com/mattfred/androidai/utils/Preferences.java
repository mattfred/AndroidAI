package com.mattfred.androidai.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by matthewfrederick on 2/28/17.
 */

public class Preferences {

    private static final String PREF_NAME = "ai_preferences";
    private static final String NAME_KEY = "name";

    public static void saveName(Context context, String name) {
        getPreferences(context).edit().putString(NAME_KEY, name).apply();
    }

    public static String getName(Context context) {
        return getPreferences(context).getString(NAME_KEY, "");
    }

    private static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }
}
