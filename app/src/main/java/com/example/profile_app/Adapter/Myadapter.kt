package com.example.profile_app.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.profile_app.R

class Myadapter(
    val trends: List<trendsData>) : RecyclerView.Adapter<Myadapter.MyViewHolder>() {


    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.treand_list,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder( holder: MyViewHolder, position: Int) {
        holder.itemView.apply {
            holder.title.text = trends[position].title
            holder.subtitle.text = trends[position].subTitle
            holder.pic.setImageResource(trends[position].pic)

        }

    }

    override fun getItemCount(): Int {
        return trends.size
    }


    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val title : AppCompatTextView  = itemView.findViewById(R.id.Title)
        val subtitle : AppCompatTextView  = itemView.findViewById(R.id.subtitle)
        val pic : AppCompatImageView  = itemView.findViewById(R.id.pic)

        }
}