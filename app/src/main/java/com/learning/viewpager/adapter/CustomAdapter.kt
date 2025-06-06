package com.learning.viewpager.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.learning.viewpager.databinding.ListItemViewPagerBinding
import com.learning.viewpager.model.EntityModel

class CustomAdapter(private val customList : List<EntityModel>) : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    class CustomViewHolder(val binding : ListItemViewPagerBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder =  CustomViewHolder(
        ListItemViewPagerBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    override fun getItemCount(): Int = customList.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) = with(holder.binding){
        val item = customList[position]
        tvName.text = item.name
        tvDescription.text = item.description
        customList.forEach { item ->
            Glide.with(root.context).load(item.image).preload()
        }
    }
}