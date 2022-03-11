package com.example.weatherapp.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("weather?appid=c422e09bb6cc632b3d77a9ff57436d6e&units=metric")
    Call<Example> getWeatherData(@Query("q") String name);
}
