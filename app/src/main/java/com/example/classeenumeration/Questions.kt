package com.example.classeenumeration

//Dans la classe Question, modifiez le type de données de la propriété difficulty en remplaçant String par Difficulty.
//Transformez Question en une classe de données en utilisant le mot clé data.
data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

//Lorsqu'une classe est définie comme une classe de données, les méthodes suivantes sont implémentées :
//
//equals()
//hashCode() : vous rencontrerez cette méthode lorsque vous utiliserez certains types de collections.
//toString()
//componentN() : component1(), component2(), etc.
//copy()

//Une classe de données ne peut pas non plus être abstract, open, sealed ou inner.

