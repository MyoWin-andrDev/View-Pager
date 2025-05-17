package com.learning.viewpager

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.learning.viewpager.databinding.ActivityMainBinding
import com.learning.viewpager.fragment.AnimalsFragment
import com.learning.viewpager.fragment.PlanetsFragment
import com.learning.viewpager.fragment.PlantsFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            val tabTitleList = listOf("Plant", "Animal", "Planet")
            val tabIconList = mapOf<String, Int>(
                "Plant" to R.drawable.ic_plant,
                "Animal" to R.drawable.ic_animal,
                "Planet" to R.drawable.ic_planet
            )
            var fragment : Fragment = PlantsFragment()
            vpMain.adapter = object : FragmentStateAdapter(this@MainActivity){
                override fun createFragment(position: Int): Fragment {
                    when(position){
                        0 -> fragment = PlantsFragment()
                        1 -> fragment = AnimalsFragment()
                        2 -> fragment = PlanetsFragment()
                    }
                    return fragment
                }

                override fun getItemCount(): Int = tabTitleList.size

            }
            TabLayoutMediator(tlMain, vpMain){tab , position ->
                val title = tabTitleList[position]
                tab.text = title
                tabIconList[title]?.let { tab.setIcon(it) }
            }.attach()
        }
    }
}