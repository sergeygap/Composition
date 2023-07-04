package com.gap.composition.domain.usecases

import com.gap.composition.domain.entity.Question
import com.gap.composition.domain.repository.GameRepository

class GenerateQuestionUseCase(private val repository: GameRepository) { // генерайя вопроса
    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTION)
    }

    companion object {
        private const val COUNT_OF_OPTION = 6
    }
}