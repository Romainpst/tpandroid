package com.example.tp


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

import com.example.tp.databinding.ItemCustomRecyclerBinding

private val diffItemUtils = object : DiffUtil.ItemCallback<ObjectDataSample>() {


    override fun areItemsTheSame(oldItem: ObjectDataSample, newItem: ObjectDataSample): Boolean {
        return oldItem == newItem
    }


    override fun areContentsTheSame(oldItem: ObjectDataSample, newItem: ObjectDataSample): Boolean {
        return oldItem == newItem
    }
}


class AndroidVersionAdapter : ListAdapter<ObjectDataSample, AndroidVersionViewHolder>(diffItemUtils) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidVersionViewHolder {
        return AndroidVersionViewHolder(
            ItemCustomRecyclerBinding.inflate(
                LayoutInflater.from(parent.context),parent, false)
        )

    }


    override fun onBindViewHolder(holder: AndroidVersionViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


}

class AndroidVersionViewHolder(
    private val binding: ItemCustomRecyclerBinding
) : RecyclerView.ViewHolder(binding.root) {


    fun bind(objectDataSample: ObjectDataSample) {
        binding.itemRecyclerViewName.text = objectDataSample.Name
        binding.itemRecyclerViewVersion.text = objectDataSample.Version
        binding.itemRecyclerViewPrice.text = objectDataSample.Price
    }
}
