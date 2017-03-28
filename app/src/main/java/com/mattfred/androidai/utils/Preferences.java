package com.mattfred.androidai.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Helper class for saving and returning values from preferences
 */

public class Preferences {

    /**
     * preferences name
     */
    private static final String PREF_NAME = "ai_preferences";

    /**
     * preferences name key
     */
    private static final String NAME_KEY = "name";

    /**
     * Save user name to preferences
     *
     * @param context activity context
     * @param name    user name
     */
    public static void saveName(Context context, String name) {
        getPreferences(context).edit().putString(NAME_KEY, name).apply();
    }

    /**
     * Return user name from preferences
     * @param context activity context
     * @return user name or empty string
     */
    public static String getName(Context context) {
        return getPreferences(context).getString(NAME_KEY, "");
    }

    /**
     * Gets preferences object
     * @param context activity context
     * @return shared preferences object
     */
    private static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }
}
