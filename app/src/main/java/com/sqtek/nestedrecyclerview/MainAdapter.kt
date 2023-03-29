package com.sqtek.nestedrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sqtek.nestedrecyclerview.databinding.CollectionItemBinding
import com.sqtek.nestedrecyclerview.model.MainModel
import com.sqtek.nestedrecyclerview.model.SampleData.collections

class MainAdapter(private val collection: List<MainModel>):
        RecyclerView.Adapter<MainAdapter.CollectionViewHolder>() {

    class CollectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = CollectionItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.collection_item, parent, false)
        return CollectionViewHolder(view)
    }

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.binding.apply {
            val collection= collections[position]
            textViewCollectionTitle.text =collections[position].title
            val courseAdapter = CourseAdapter(collection.courseModels)
            recyclerViewBooks.adapter= courseAdapter
        }
    }

    override fun getItemCount(): Int {
        return collections.size
    }
}