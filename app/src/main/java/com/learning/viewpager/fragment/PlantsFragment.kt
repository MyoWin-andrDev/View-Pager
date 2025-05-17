package com.learning.viewpager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.learning.viewpager.R
import com.learning.viewpager.adapter.CustomAdapter
import com.learning.viewpager.databinding.FragmentPlantsBinding
import com.learning.viewpager.model.CustomList

class PlantsFragment : Fragment(R.layout.fragment_plants) {
    private lateinit var binding : FragmentPlantsBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentPlantsBinding.bind(view)
        val plantList = listOf(
            CustomList(
                name = "Rose",
                description = "The rose is a classic symbol of love and beauty. With over 300 species, they come in various colors, each with its own meaning.",
                image = R.drawable.img_rose
            ),
            CustomList(
                name = "Sunflower",
                description = "Sunflowers are known for their bright yellow petals and ability to turn towards the sun. They symbolize adoration and loyalty.",
                image = R.drawable.img_sunflower
            ),
            CustomList(
                name = "Tulip",
                description = "Tulips are elegant spring flowers available in many colors. They're associated with perfect love and fame.",
                image = R.drawable.img_tulip
            ),
            CustomList(
                name = "Lavender",
                description = "Famous for its soothing fragrance, lavender has purple flowers and is widely used in aromatherapy and herbal remedies.",
                image = R.drawable.img_lavender
            ),
            CustomList(
                name = "Orchid",
                description = "Exotic and sophisticated, orchids are one of the largest flowering plant families with over 28,000 species worldwide.",
                image = R.drawable.img_orchid
            )
        )
        binding.rvPlant.adapter = CustomAdapter(plantList)
        super.onViewCreated(view, savedInstanceState)
    }
}