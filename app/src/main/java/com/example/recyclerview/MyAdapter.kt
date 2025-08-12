package com.example.recyclerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(var newsArrayList : ArrayList<News>, var contex:Activity):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    //to create new view instance when layout manager fails to find a suitable view for each item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.each_row, parent, false)
        return MyViewHolder(itemView)

    }

    //how many items are present in your array
    override fun getItemCount(): Int {
    return newsArrayList.size
    }

    //populate items in data
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem =newsArrayList[position]
        holder.hTitle.text=currentItem.newsHeading
        holder.hImage.setImageResource(currentItem.newsImage)


    }
        class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val hTitle =itemView.findViewById<TextView>(R.id.headingTitle)
            val hImage = itemView.findViewById<ShapeableImageView>(R.id.headingImage)
        }

}