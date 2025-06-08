package com.learning.viewpager.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.learning.viewpager.databinding.ListItemViewPagerBinding
import com.learning.viewpager.model.CustomModel

class CustomAdapter(private val customModel: List<CustomModel>) :
    RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    class CustomViewHolder(val binding: ListItemViewPagerBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder =
        CustomViewHolder(
            ListItemViewPagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun getItemCount(): Int = customModel.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val item = customModel[position]
        holder.binding.apply {
            tvName.text = item.name
            tvDescription.text = item.description
            
            Glide.with(holder.itemView.context)
                .load(item.image)
                .into(ivImage)

        }
    }
}