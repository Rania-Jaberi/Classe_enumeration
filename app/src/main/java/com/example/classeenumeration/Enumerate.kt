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
//Déplacez question1, question2 et question3 depuis main() vers la classe Quiz. Vous devez également supprimer println(question1.toString()), si ce n'est pas déjà fait.
//Déplacez l'objet StudentProgress dans la classe Quiz.
class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}
//Mettez à jour l'appel à println() pour référencer les propriétés avec Quiz.answered et Quiz.total. Même si ces propriétés sont déclarées dans l'objet StudentProgress, elles sont accessibles grâce à la notation par points en n'utilisant que le nom de la classe Quiz.

fun main() {
    println("${Quiz.answered} of ${Quiz.total} answered.")
}
//Utiliser une constante d'énumération
