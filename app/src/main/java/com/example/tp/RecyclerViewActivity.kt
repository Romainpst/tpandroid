package com.example.tp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tp.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRecyclerViewBinding
    private lateinit var adapter: AndroidVersionAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Create the instance of adapter
        adapter = AndroidVersionAdapter()


        // We define the style
        binding.recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)


        // We set the adapter to recycler view
        binding.recyclerView.adapter = adapter


        // Generate data and give it to adapter
        adapter.submitList(generateFakeData())
    }


    private fun generateFakeData(): ArrayList<ObjectDataSample> {
        return arrayListOf(
            ObjectDataSample("Nexus 6", "Android 7.1.1", "600€"),
            ObjectDataSample("Nexus 6P", "Android 8.1.0", "700€"),
            ObjectDataSample("Huawei P9", "Android 6.0.0", "800€"),
            ObjectDataSample("Huawei P20 Lite", "Android 8.0", "950€"),
            ObjectDataSample("Samsung Galaxy A8", "Android 7.1.1", "800€"),
            ObjectDataSample("Pixel 2", "Android 10 beta", "700€"),
            ObjectDataSample("Sony Xperia XZ2 ", "Android 8.0", "740€"),
            ObjectDataSample("Asus Zenfone 4", "Android 7.0", "550€")
        )
    }

}