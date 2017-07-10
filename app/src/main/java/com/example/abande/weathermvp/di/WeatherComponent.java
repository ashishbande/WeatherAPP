package com.example.abande.weathermvp.di;

import com.example.abande.weathermvp.WeatherActivity;

import dagger.Component;

/**
 * Created by abande on 7/7/17.
 */

@Component(modules = WeatherModule.class)
public interface WeatherComponent {

  public void inject(WeatherActivity activity);
}

