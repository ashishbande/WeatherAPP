package com.example.abande.weathermvp;


import javax.inject.Inject;


/**
 * Created by abande on 7/7/17.
 */

public class WeatherPresenterMock implements WeatherPresenter, WeatherInfoInterector.OnWeatherFinishedListener{
    private WeatherView mView;

    private WeatherInfoInterector mInteractor;


    public WeatherPresenterMock(WeatherView weatherView) {
        mView = weatherView;
        mInteractor = new WeatherInfoInteractorMock();
    }

    @Override
    public void showWeather(String location) {
        if(location != null){
            mView.showProgress();
        }
        mInteractor.showContext(location,this);
    }

    @Override
    public void onFailure() {
        mView.hideProgress();
    }

    @Override
    public void onSuccess(String data) {
        mView.showWeatherData(data);
    }
}
