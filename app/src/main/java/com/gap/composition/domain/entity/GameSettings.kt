package com.gap.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameSettings(
    val maxSumValue: Int, // максималное значение суммы в игре
    val minCountOfRightAnswers: Int,    //минимальное колличество правильных очков для победы
    val minPercentOfRightAnswers: Int, // минимвльное количество процентов для положительного заверщения игры
    val gameTimeInSeconds: Int,
) : Parcelable {
    val minCountOfRightAnswersString: String
        get() = minCountOfRightAnswers.toString()

    val minPercentOfRightAnswersString: String
        get() = minPercentOfRightAnswers.toString()
}