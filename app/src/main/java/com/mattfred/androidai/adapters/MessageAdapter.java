package com.mattfred.androidai.adapters;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mattfred.androidai.R;
import com.mattfred.androidai.models.Message;

import java.util.List;

/**
 * Message Adapter. This adapter is used to display user and AI messages in the main activity
 * recycler view.
 */

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    /**
     * List of messages
     */
    private List<Message> messages;

    /**
     * Recycler view that will hold messages
     */
    private RecyclerView recyclerView;

    /**
     * Constructor
     *
     * @param messages     list of messages
     * @param recyclerView recycler view
     */
    public MessageAdapter(List<Message> messages, RecyclerView recyclerView) {
        this.messages = messages;
        this.recyclerView = recyclerView;
    }

    /**
     * Add messages to recycler view
     *
     * @param message message to be added
     */
    public void addMessage(Message message) {
        messages.add(message);
        if (recyclerView != null && !recyclerView.isComputingLayout()) { // can't redraw while computing layout
            this.notifyDataSetChanged();
            recyclerView.scrollToPosition(getItemCount() - 1);
        }
    }

    @Override
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MessageViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.message_layout, parent, false));
    }

    /**
     * Bind model to view
     *
     * @param holder message view holder containing view widget references
     * @param position position in list of current view
     */
    @Override
    public void onBindViewHolder(MessageViewHolder holder, int position) {
        Message message = messages.get(position);
        if (message.isUser()) {
            holder.rightSpace.setVisibility(View.GONE);
            holder.leftSpace.setVisibility(View.VISIBLE);
            holder.text.setTextColor(Color.WHITE);
            holder.text.setBackgroundColor(Color.DKGRAY);
        } else {
            holder.leftSpace.setVisibility(View.GONE);
            holder.rightSpace.setVisibility(View.VISIBLE);
            holder.text.setTextColor(Color.BLACK);
            holder.text.setBackgroundColor(Color.LTGRAY);
        }
        holder.text.setText(message.getContent());
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    /**
     * Object containing reference to recycler view individual items
     */
    class MessageViewHolder extends RecyclerView.ViewHolder {

        View leftSpace;
        View rightSpace;
        TextView text;

        MessageViewHolder(View itemView) {
            super(itemView);
            leftSpace = itemView.findViewById(R.id.left_space);
            rightSpace = itemView.findViewById(R.id.right_space);
            text = (TextView) itemView.findViewById(R.id.text);
        }
    }
}
