package com.sqtek.nestedrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sqtek.nestedrecyclerview.databinding.CourseItemBinding
import com.sqtek.nestedrecyclerview.model.CourseModel


class CourseAdapter (private val courseModels: List<CourseModel>):
        RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {

    inner class CourseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val binding = CourseItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.course_item, parent, false)
        return CourseViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        holder.binding.apply {
            imageViewBook.setImageResource(courseModels[position].imageId)
        }
    }

    override fun getItemCount(): Int {
        return courseModels.size
    }
}