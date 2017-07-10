package com.example.abande.weathermvp;

/**
 * Created by abande on 7/6/17.
 */

public interface WeatherInfoInterector {
    public interface OnWeatherFinishedListener {
        void onFailure();

        void onSuccess(String data);
    }

    void showContext(String location, OnWeatherFinishedListener listener);

}