package com.babyapps.data.model

import javafx.scene.text.FontWeight
import kotlinx.serialization.Serializable

@Serializable
data class Dog (
    val type: String,
    val origin: String,
    val protection: Boolean,
    val height: Int,
    val weight: Double,
    val imgSource: String,
        )