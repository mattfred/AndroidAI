package com.mattfred.androidai.utils;

import android.app.Application;

import timber.log.Timber;

/**
 * AI Application Class. Used to setup Timber and xml reader
 */

public class AiApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());
        System.setProperty("org.xml.sax.driver", "org.xmlpull.v1.sax2.Driver");
    }
}
