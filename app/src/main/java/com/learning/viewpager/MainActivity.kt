package com.learning.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.learning.viewpager.databinding.ActivityMainBinding
import com.learning.viewpager.fragment.AnimalsFragment
import com.learning.viewpager.fragment.PlanetsFragment
import com.learning.viewpager.fragment.PlantsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // Tab titles and their icons
    private val tabTitleList = listOf("Plant", "Animal", "Planet")
    private val tabIconList = mapOf(
        "Plant" to R.drawable.ic_plant,
        "Animal" to R.drawable.ic_animal,
        "Planet" to R.drawable.ic_planet
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViewPagerAdapter()
        setupLayoutMediator()

    }

    private fun setupViewPagerAdapter() = with(binding) {
        vpMain.adapter = object : FragmentStateAdapter(this@MainActivity) {
            override fun getItemCount(): Int = tabTitleList.size

            override fun createFragment(position: Int): Fragment = when (position) {
                0 -> PlantsFragment()
                1 -> AnimalsFragment()
                2 -> PlanetsFragment()
                else -> error("Invalid position: $position")
            }
        }
    }

    private fun setupLayoutMediator() = with(binding) {
        TabLayoutMediator(binding.tlMain, binding.vpMain) { tab, position ->
            tab.text = tabTitleList[position]
            tabIconList[tab.text]?.let(tab::setIcon)
        }.attach()
    }
}
