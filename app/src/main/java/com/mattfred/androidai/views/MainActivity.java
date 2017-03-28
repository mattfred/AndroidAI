package com.mattfred.androidai.views;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.mattfred.androidai.R;
import com.mattfred.androidai.adapters.MessageAdapter;
import com.mattfred.androidai.controllers.MainActivityController;
import com.mattfred.androidai.models.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Main activity of application.
 */
public class MainActivity extends AppCompatActivity implements MainActivityController.AIResponse {

    // references to all view objects
    private EditText input;
    private MessageAdapter adapter;
    private MainActivityController controller;
    private RecyclerView messageArea;
    private TextView thinking;

    private Handler handler = new Handler();

    // color references
    private int currentRed = 250;
    private int currentBlue = 250;
    private int currentGreen = 250;

    /**
     * On Create
     *
     * @param savedInstanceState bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
        setupListView();
        thinking = (TextView) findViewById(R.id.thinking_indicator);
        controller = new MainActivityController(this);
    }

    /**
     * Setup ui input
     */
    private void setupUI() {
        input = (EditText) findViewById(R.id.input);
        input.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_SEND && !input.getText().toString().equals("")) {
                    addMessage(new Message(true, input.getText().toString()));
                    handled = true;
                }
                return handled;
            }
        });
    }

    /**
     * Setup ui recycler view
     */
    private void setupListView() {
        messageArea = (RecyclerView) findViewById(R.id.message_area);
        List<Message> messages = new ArrayList<>();
        adapter = new MessageAdapter(messages, messageArea);
        messageArea.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        messageArea.setItemAnimator(new DefaultItemAnimator());
        messageArea.setAdapter(adapter);
    }

    /**
     * Add message to recycler view
     *
     * @param message message to be added
     */
    private void addMessage(final Message message) {
        adapter.addMessage(message);
        input.setText("");

        if (message.isUser()) {
            thinking.setVisibility(View.VISIBLE);
            (new Thread() {
                @Override
                public void run() {
                    controller.analyzeText(message.getContent());
                }
            }).start();
        }
        messageArea.scrollToPosition(adapter.getItemCount() - 1);
    }

    /**
     * Take colors returned from watson results and fade background color to new color values.
     * A loop is used to allow for slow fade. Handler is used to not freeze app.
     *
     * @param red   red value
     * @param green green value
     * @param blue  blue value
     */
    @Override
    public void onWatsonResults(final int red, final int green, final int blue) {
        (new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 255; i++) {
                    handler.post(new Runnable() {
                        public void run() {
                            messageArea.setBackgroundColor(
                                    Color.argb(255, currentRed, currentGreen, currentBlue));
                            if (currentRed != 255 && currentRed < red) currentRed++;
                            if (currentRed != 0 && currentRed > red) currentRed--;
                            if (currentGreen != 255 && currentGreen < green) currentGreen++;
                            if (currentGreen != 0 && currentGreen > green) currentGreen--;
                            if (currentBlue != 255 && currentBlue < blue) currentBlue++;
                            if (currentBlue != 0 && currentBlue > blue) currentBlue--;
                        }
                    });
                    try {
                        sleep(10);
                    } catch (Exception e) {
                        break;
                    }
                }
            }
        }).start();
    }

    /**
     * show response to user
     *
     * @param text response
     */
    @Override
    public void sendResponse(final String text) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                thinking.setVisibility(View.GONE);
                if (text != null) {
                    addMessage(new Message(false, text));
                }
            }
        });
    }
}
