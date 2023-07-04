package com.gap.composition.domain.repository

import com.gap.composition.domain.entity.GameSettings
import com.gap.composition.domain.entity.Level
import com.gap.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int, // значение числа, котрого будут отгадывать
        countOfOptions: Int // Колличество ответов
    ): Question

    fun getGameSettings(level: Level): GameSettings

}