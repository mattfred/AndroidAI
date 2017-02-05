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
 * Message Adapter
 */

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    private List<Message> messages;

    public MessageAdapter(List<Message> messages) {
        this.messages = messages;
    }

    public void addMessage(Message message) {
        messages.add(message);
        this.notifyDataSetChanged();
    }

    @Override
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MessageViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.message_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(MessageViewHolder holder, int position) {
        Message message = messages.get(position);
        if (message.isUser()) {
            holder.rightSpace.setVisibility(View.GONE);
            holder.text.setTextColor(Color.WHITE);
            holder.text.setBackgroundColor(Color.DKGRAY);
        } else {
            holder.leftSpace.setVisibility(View.GONE);
            holder.text.setTextColor(Color.BLACK);
            holder.text.setBackgroundColor(Color.LTGRAY);
        }
        holder.text.setText(message.getContent());
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

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
