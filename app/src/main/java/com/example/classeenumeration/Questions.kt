package com.example.classeenumeration

//Dans la classe Question, modifiez le type de données de la propriété difficulty en remplaçant String par Difficulty.
class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

