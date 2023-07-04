package com.gap.composition.domain.usecases

import com.gap.composition.domain.entity.GameSettings
import com.gap.composition.domain.entity.Level
import com.gap.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}