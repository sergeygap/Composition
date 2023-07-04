package com.gap.composition.domain.entity

data class Question(
    val sum: Int, // значение суммы в круге
    val visibleNumber: Int, // вариант цифры из правого элемента
    val options: List<Int>, // Варианты ответов
)