package com.learning.viewpager.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.learning.viewpager.databinding.ListItemViewPagerBinding
import com.learning.viewpager.model.CustomList

class CustomAdapter(private val customList : List<CustomList>) : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    class CustomViewHolder(val binding : ListItemViewPagerBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder =  CustomViewHolder(
        ListItemViewPagerBinding.inflate(LayoutInflater.from(parent.context)))

    override fun getItemCount(): Int = customList.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.binding.apply {
            tvName.text = customList[position].name
            tvDescription.text = customList[position].description
            ivImage.setImageResource(customList[position].image)
        }
    }
}