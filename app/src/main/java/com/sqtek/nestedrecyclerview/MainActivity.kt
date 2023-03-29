package com.sqtek.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sqtek.nestedrecyclerview.databinding.ActivityMainBinding
import com.sqtek.nestedrecyclerview.model.SampleData

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            recyclerViewCollections.adapter = MainAdapter(SampleData.collections)
        }
    }
}