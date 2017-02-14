package com.mattfred.androidai.apache;


import android.content.Context;

import java.io.InputStream;

import opennlp.tools.cmdline.parser.ParserTool;
import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.parser.Parse;
import opennlp.tools.parser.Parser;
import opennlp.tools.parser.ParserFactory;
import opennlp.tools.parser.ParserModel;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;
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

    static String[] getPartsOfSpeech(Context context, String[] strings) {
        try {
            InputStream modelIn = context.getAssets().open("en-pos-maxent.bin");
            POSModel model = new POSModel(modelIn);
            POSTaggerME tagger = new POSTaggerME(model);
            return tagger.tag(strings);
        } catch (Exception exception) {
            Timber.e(exception);
        }

        return null;
    }

    static Parse[] getParse(Context context, String text) {
        try {
            InputStream inputStream = context.getAssets().open("en-parser-chunking.bin");
            ParserModel model = new ParserModel(inputStream);
            Parser parser = ParserFactory.create(model);
            return ParserTool.parseLine(text, parser, 1);
        } catch (Exception exception) {
            Timber.e(exception);
        }

        return null;
    }
}
