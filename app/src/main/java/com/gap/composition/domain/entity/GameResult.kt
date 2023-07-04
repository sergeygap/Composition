package com.gap.composition.domain.entity

import java.io.Serializable

data class GameResult(
    val winner: Boolean, // победили или нет
    val countOfRightAnswers: Int, // Количетво правильных ответоа
    val countOfQuestions: Int, // Общее колличество вопросов на которые ответил игрок, можно определить, какой правильный процент был у игрока
    val gameSettings: GameSettings, // для того, чтобы узнать какой минмальное колличество правльных ответов должно было быть
) : Serializable