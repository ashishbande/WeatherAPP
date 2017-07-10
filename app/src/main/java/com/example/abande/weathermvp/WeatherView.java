package com.example.abande.weathermvp;

/**
 * Created by abande on 7/6/17.
 */

public interface WeatherView {
    void showProgress();

    void hideProgress();

    void showWeatherData(String data);
}
