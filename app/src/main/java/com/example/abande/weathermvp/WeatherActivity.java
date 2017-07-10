package com.example.abande.weathermvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.abande.weathermvp.di.DaggerWeatherComponent;
import com.example.abande.weathermvp.di.WeatherModule;

import javax.inject.Inject;

public class WeatherActivity extends AppCompatActivity implements WeatherView,View.OnClickListener {

    private TextView mContent;
    private Button show_temp;

    @Inject
    public WeatherPresenter weatherPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContent = (TextView) findViewById(R.id.content);
        show_temp = (Button) findViewById(R.id.show_temperature);
        show_temp.setOnClickListener(this);
        DaggerWeatherComponent.builder().weatherModule(new WeatherModule(this)).build().inject(this);

     }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.show_temperature){
          weatherPresenter.showWeather("");
        }
    }


    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showWeatherData(String data) {
        mContent.setText(data);
    }
}
