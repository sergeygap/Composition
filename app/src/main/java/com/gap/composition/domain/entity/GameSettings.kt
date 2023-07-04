package com.gap.composition.domain.entity

data class GameSettings(
    val maxSumValue: Int, // максималное значение суммы в игре
    val minCountOfRightAnswers: Int,    //минимальное колличество правильных очков для победы
    val minPercentOfRightAnswer: Int, // минимвльное количество процентов для положительного заверщения игры
    val gameTimeInSeconds: Int,
    )