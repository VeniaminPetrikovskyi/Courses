package com.example.courses

import com.example.courses.model.Course

class Datasource() {
    fun loadCourses(): List<Course> {
        return listOf<Course>(
            Course(name = R.string.Architecture, image = R.drawable.architecture, coursesNumber = 10),
            Course(name = R.string.Automotive, image = R.drawable.automotive, coursesNumber = 20),
            Course(name = R.string.Biology, image = R.drawable.biology, coursesNumber = 35),
            Course(name = R.string.Business, image = R.drawable.business, coursesNumber = 12),
            Course(name = R.string.Crafts, image = R.drawable.crafts, coursesNumber = 14),
            Course(name = R.string.Culinary, image = R.drawable.culinary, coursesNumber = 22),
            Course(name = R.string.Design, image = R.drawable.design, coursesNumber = 178),
            Course(name = R.string.Drawing, image = R.drawable.drawing, coursesNumber = 1),
            Course(name = R.string.Ecology, image = R.drawable.ecology, coursesNumber = 5),
            Course(name = R.string.Engineering, image = R.drawable.engineering, coursesNumber = 7),
            Course(name = R.string.Fashion, image = R.drawable.fashion, coursesNumber = 9),
            Course(name = R.string.Film, image = R.drawable.film, coursesNumber = 11),
            Course(name = R.string.Finance, image = R.drawable.finance, coursesNumber = 10),
            Course(name = R.string.Gaming, image = R.drawable.gaming, coursesNumber = 22),
            Course(name = R.string.Geology, image = R.drawable.geology, coursesNumber = 23),
            Course(name = R.string.History, image = R.drawable.history, coursesNumber = 24),
            Course(name = R.string.Journalism, image = R.drawable.journalism, coursesNumber = 25),
            Course(name = R.string.Law, image = R.drawable.law, coursesNumber = 22),
            Course(name = R.string.Lifestyle, image = R.drawable.lifestyle, coursesNumber = 17),
            Course(name = R.string.Music, image = R.drawable.music, coursesNumber = 69),
            Course(name = R.string.Painting, image = R.drawable.painting, coursesNumber = 78),
            Course(name = R.string.Photography, image = R.drawable.photography, coursesNumber = 35),
            Course(name = R.string.Physics, image = R.drawable.physics, coursesNumber = 35),
            Course(name = R.string.Tech, image = R.drawable.tech, coursesNumber = 35)
        )
    }
}