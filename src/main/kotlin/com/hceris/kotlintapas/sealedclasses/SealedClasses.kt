package com.hceris.kotlintapas.sealedclasses

fun whatIs(number: Int): TheAnswer =
    if (number == 42) TheAnswer.ToEverything
    else TheAnswer.ToSomethingElse

fun isTheAnswerToEverything(number: Int): Boolean {
    return true
}

sealed class TheAnswer {
    object ToEverything : TheAnswer()
    object ToSomethingElse : TheAnswer()
}
