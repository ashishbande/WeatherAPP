package com.example.abande.weathermvp.di;

import com.example.abande.weathermvp.WeatherInfoInteractorMock;
import com.example.abande.weathermvp.WeatherInfoInterector;
import com.example.abande.weathermvp.WeatherPresenter;
import com.example.abande.weathermvp.WeatherPresenterImpl;
import com.example.abande.weathermvp.WeatherPresenterMock;
import com.example.abande.weathermvp.WeatherView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by abande on 7/7/17.
 */
@Module
public class WeatherModule {
    public WeatherView mView;

    public WeatherModule(WeatherView view){
        mView = view;
    }

    @Provides
    public WeatherView provideWeatherView(){
       return mView;
    }

    @Provides
    public WeatherPresenter providePresenter(){
        return new WeatherPresenterMock(mView);
    }

}
