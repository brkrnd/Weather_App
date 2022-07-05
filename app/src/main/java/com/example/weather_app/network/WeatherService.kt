package com.example.weather_app.network

import com.example.weather_app.models.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("2.5/weather")
    fun getWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") appid: String?,
        appId: String,
    ) : Call<WeatherResponse>

}