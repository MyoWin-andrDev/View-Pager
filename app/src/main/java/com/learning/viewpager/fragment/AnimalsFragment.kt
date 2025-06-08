package com.learning.viewpager.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.learning.viewpager.R
import com.learning.viewpager.adapter.CustomAdapter
import com.learning.viewpager.databinding.FragmentAnimalsBinding
import com.learning.viewpager.model.CustomModel

class AnimalsFragment : Fragment(R.layout.fragment_animals) {
    private val binding by lazy { FragmentAnimalsBinding.bind(requireView()) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val animalList = listOf(
            CustomModel(
                name = "Lion",
                description = "Known as the 'king of the jungle', lions are majestic big cats that live in prides across Africa.",
                image = R.drawable.img_lion
            ),
            CustomModel(
                name = "Dolphin",
                description = "Highly intelligent marine mammals known for their playful behavior and complex communication skills.",
                image = R.drawable.img_dolphin
            ),
            CustomModel(
                name = "Eagle",
                description = "Powerful birds of prey with exceptional eyesight, symbolizing strength and freedom in many cultures.",
                image = R.drawable.img_eagle
            ),
            CustomModel(
                name = "Elephant",
                description = "The largest land animals on Earth, known for their intelligence, strong social bonds, and long memories.",
                image = R.drawable.img_elephant
            ),
            CustomModel(
                name = "Penguin",
                description = "Flightless birds adapted to aquatic life, primarily living in the Southern Hemisphere's colder regions.",
                image = R.drawable.img_penguin
            ),
            CustomModel(
                name = "Lion",
                description = "Known as the 'king of the jungle', lions are majestic big cats that live in prides across Africa.",
                image = R.drawable.img_lion
            ),
            CustomModel(
                name = "Dolphin",
                description = "Highly intelligent marine mammals known for their playful behavior and complex communication skills.",
                image = R.drawable.img_dolphin
            ),
            CustomModel(
                name = "Eagle",
                description = "Powerful birds of prey with exceptional eyesight, symbolizing strength and freedom in many cultures.",
                image = R.drawable.img_eagle
            ),
            CustomModel(
                name = "Elephant",
                description = "The largest land animals on Earth, known for their intelligence, strong social bonds, and long memories.",
                image = R.drawable.img_elephant
            ),
            CustomModel(
                name = "Penguin",
                description = "Flightless birds adapted to aquatic life, primarily living in the Southern Hemisphere's colder regions.",
                image = R.drawable.img_penguin
            ), CustomModel(
                name = "Lion",
                description = "Known as the 'king of the jungle', lions are majestic big cats that live in prides across Africa.",
                image = R.drawable.img_lion
            ),
            CustomModel(
                name = "Dolphin",
                description = "Highly intelligent marine mammals known for their playful behavior and complex communication skills.",
                image = R.drawable.img_dolphin
            ),
            CustomModel(
                name = "Eagle",
                description = "Powerful birds of prey with exceptional eyesight, symbolizing strength and freedom in many cultures.",
                image = R.drawable.img_eagle
            ),
            CustomModel(
                name = "Elephant",
                description = "The largest land animals on Earth, known for their intelligence, strong social bonds, and long memories.",
                image = R.drawable.img_elephant
            ),
            CustomModel(
                name = "Penguin",
                description = "Flightless birds adapted to aquatic life, primarily living in the Southern Hemisphere's colder regions.",
                image = R.drawable.img_penguin
            ),
            CustomModel(
                name = "Lion",
                description = "Known as the 'king of the jungle', lions are majestic big cats that live in prides across Africa.",
                image = R.drawable.img_lion
            ),
            CustomModel(
                name = "Dolphin",
                description = "Highly intelligent marine mammals known for their playful behavior and complex communication skills.",
                image = R.drawable.img_dolphin
            ),
            CustomModel(
                name = "Eagle",
                description = "Powerful birds of prey with exceptional eyesight, symbolizing strength and freedom in many cultures.",
                image = R.drawable.img_eagle
            ),
            CustomModel(
                name = "Elephant",
                description = "The largest land animals on Earth, known for their intelligence, strong social bonds, and long memories.",
                image = R.drawable.img_elephant
            ),
            CustomModel(
                name = "Penguin",
                description = "Flightless birds adapted to aquatic life, primarily living in the Southern Hemisphere's colder regions.",
                image = R.drawable.img_penguin
            )
        )

        binding.rvAnimal.adapter = CustomAdapter(animalList)
    }
}