package com.example.demo_chatbot

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MessageAdapter (var context:Context,var messageList:ArrayList<MessageClass>):RecyclerView.Adapter<MessageAdapter.MessageViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MessageAdapter.MessageViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.message_list_item,parent,false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: MessageAdapter.MessageViewHolder, position: Int) {
        val message = messageList[position]
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class MessageViewHolder(view:View):RecyclerView.ViewHolder(view){

    }

}