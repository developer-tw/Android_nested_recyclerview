package com.sqtek.nestedrecyclerview.model

import com.sqtek.nestedrecyclerview.R

object SampleData {
    private val courseModels = listOf(
        CourseModel(R.drawable.course1),
        CourseModel(R.drawable.course2),
        CourseModel(R.drawable.course3),
        CourseModel(R.drawable.course4),
        CourseModel(R.drawable.course5),
        CourseModel(R.drawable.course6),
        CourseModel(R.drawable.course7),
        CourseModel(R.drawable.course8),
    )

    val collections = listOf(
        MainModel("All Course", courseModels),
        MainModel("Want to take", courseModels.reversed()),
        MainModel("Popular Course", courseModels.shuffled()),
        MainModel("Top Rated", courseModels),
    )
}