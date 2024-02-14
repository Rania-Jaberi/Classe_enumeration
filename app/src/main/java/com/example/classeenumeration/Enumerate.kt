package com.example.classeenumeration

class Enumerate {
}
//Une classe d'énumération permet de créer des types avec un ensemble limité de valeurs possibles.
//Chaque valeur possible d'une énumération est appelée constante d'énumération. Les constantes d'énumération sont placées entre accolades et séparées par une virgule. Par convention, les constantes s'écrivent en majuscules.
// dans quelle cas ?
//Si vous avez mal orthographié l'une des trois chaînes possibles, vous risquez d'introduire des bugs.
//Si les valeurs changent, par exemple "medium", est renommé "average", vous devrez alors mettre à jour toutes les utilisations de la chaîne.
//Rien ne vous empêche, vous ou un autre développeur, d'utiliser accidentellement une chaîne différente qui n'est pas l'une des trois valeurs valides.
//Le code est plus difficile à gérer si vous ajoutez des niveaux de difficulté supplémentaires.
//Sous la classe Question, définissez une classe enum nommée Difficulty.
enum class Difficulty {
    EASY, MEDIUM, HARD
}
//Utiliser une constante d'énumération
fun main (){
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    println(question1.toString())
//Accéder à un objet singleton
    println("${StudentProgress.answered} of ${StudentProgress.total} answered.")
}