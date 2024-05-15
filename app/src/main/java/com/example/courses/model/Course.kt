package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Course(
    @DrawableRes val image: Int,
    @StringRes val name: Int,
    val coursesNumber: Int
)
