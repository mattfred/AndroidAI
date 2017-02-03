package com.mattfred.androidai;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mattfred.androidai.models.Message;

import java.util.List;

/**
 * Message Adapter
 */

class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    private List<Message> messages;
    private Context context;

    MessageAdapter(Context context, List<Message> messages) {
        this.messages = messages;
        this.context = context;
    }

    void addMessage(Message message) {
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
            holder.text.setBackgroundColor(ContextCompat.getColor(context, R.color.darkGreen));
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
