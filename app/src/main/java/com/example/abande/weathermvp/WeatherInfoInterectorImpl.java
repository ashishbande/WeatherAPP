package com.example.abande.weathermvp;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by abande on 7/6/17.
 */

class WeatherInfoInterectorImpl implements WeatherInfoInterector {


    @Override
    public void showContext(String location, final OnWeatherFinishedListener listener) {
        if(location == null){
           listener.onFailure();
        }
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
               listener.onSuccess("This is the dummy string");
            }
        }, 2000);
    }
}
