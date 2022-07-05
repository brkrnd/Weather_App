package com.example.weather_app.models

import java.io.Serializable

data class Wind(
    val speed : Double,
    val deg : Int
) : Serializable