package hs.wismar.heartbeat

import android.media.Image

data class Question(
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val correctAnswer: Int
)
