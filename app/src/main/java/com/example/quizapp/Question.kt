package com.example.quizapp

data class Question(
    val id:Int,
    val question: String,
    val image: Int,
    val optionUn: String,
    val optionDeux: String,
    val optionTrois: String,
    val optionQuatre: String,
    val correctAnswer : Int
)
