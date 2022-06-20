package com.example.composition.domain.entity

data class GameSettings(
    val maxSumValue: Int,
    val gameTimeInSeconds: Int,
    val minCountOfRightAnswers: Int,
    val minPercentOfRightAnswers: Int
)