package com.mattfred.androidai;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.mattfred.androidai.models.Message;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainActivityController.WatsonResults {

    private EditText input;
    private MessageAdapter adapter;
    private MainActivityController controller;
    private RecyclerView messageArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controller = new MainActivityController(this);
        setupUI();
        setupListView();
    }

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

    private void setupListView() {
        messageArea = (RecyclerView) findViewById(R.id.message_area);
        List<Message> messages = new ArrayList<>();
        adapter = new MessageAdapter(this, messages);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        messageArea.setLayoutManager(mLayoutManager);
        messageArea.setItemAnimator(new DefaultItemAnimator());
        messageArea.setAdapter(adapter);
    }

    private void addMessage(Message message) {
        adapter.addMessage(message);
        controller.analyzeText(message.getContent());
        input.setText("");
    }

    @Override
    public void onWatsonResults(int color) {
        messageArea.setBackgroundColor(color);
    }
}
