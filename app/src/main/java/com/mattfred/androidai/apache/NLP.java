package com.mattfred.androidai.apache;


import android.content.Context;

import java.io.InputStream;

import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.Span;
import timber.log.Timber;

/**
 * Tokenizer
 */

class NLP {

    static String[] getTokens(Context context, String input) {
        try {
            InputStream inputStream = context.getAssets().open("en-token.bin");
            TokenizerModel model = new TokenizerModel(inputStream);
            Tokenizer tokenizer = new TokenizerME(model);
            return tokenizer.tokenize(input);
        } catch (Exception exception) {
            Timber.e(exception);
        }

        return null;
    }

    static Span[] getNames(Context context, String[] strings) {
        try {
            InputStream inputStream = context.getAssets().open("en-ner-person.bin");
            TokenNameFinderModel model = new TokenNameFinderModel(inputStream);
            NameFinderME nameFinderME = new NameFinderME(model);
            return nameFinderME.find(strings);
        } catch (Exception exception) {
            Timber.e(exception);
        }

        return null;
    }
}
