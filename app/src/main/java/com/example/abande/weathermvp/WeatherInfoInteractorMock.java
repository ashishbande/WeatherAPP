package com.example.abande.weathermvp;

import android.os.Handler;

/**
 * Created by abande on 7/7/17.
 */

public class WeatherInfoInteractorMock implements WeatherInfoInterector {


    @Override
    public void showContext(String location, final OnWeatherFinishedListener listener) {
        if(location == null){
            listener.onFailure();
        }
        listener.onSuccess("This is the new string");
    }
}
