package com.example.weather_app.models

import java.io.Serializable

data class Main(
    val temp : Double,
    val pressure : Double,
    val humidity : Int,
    val temp_min : Double,
    val temp_max : Double,
    val sea_level : Double,
    val ground_level : Double
) : Serializable