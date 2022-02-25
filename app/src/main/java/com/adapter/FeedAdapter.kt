package com.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sharedpreferences.R


import android.widget.ImageView
import android.widget.TextView

import com.model.Restaurant


class FeedAdapter(val context: Context, var items: ArrayList<Restaurant>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return RestaurantViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list_restaurants, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val intro = items[position]

        if (holder is RestaurantViewHolder){
            holder.bind(intro)
        }
    }

    override fun getItemCount() = items.size


    inner class RestaurantViewHolder(view: View): RecyclerView.ViewHolder(view){
        private var iv_image: ImageView
        private var tv_name: TextView
        private var tv_location: TextView

        init {
            iv_image = view.findViewById(R.id.iv_restaurant)
            tv_name = view.findViewById(R.id.tv_res_name)
            tv_location = view.findViewById(R.id.tv_res_location)
        }

        fun bind(res: Restaurant){
            iv_image.setImageResource(res.image)
            tv_name.text = res.name
            tv_location.text = res.location
        }
    }
}