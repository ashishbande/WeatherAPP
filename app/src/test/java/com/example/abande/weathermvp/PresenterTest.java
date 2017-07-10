package com.example.abande.weathermvp;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by abande on 7/10/17.
 */

public class PresenterTest {

    private WeatherView mMockView;
    private WeatherPresenterMock mToTest;

    @Before
    public void setup() {
        mMockView = mock(WeatherView.class);
        mToTest = new WeatherPresenterMock(mMockView);
    }

    @Test
    public void testResume() {
        mToTest.showWeather("");
        verify(mMockView).showWeatherData("This is the new string");
    }

    @Test
    public void testResumeWithNull() {

        mToTest.showWeather(null);
        verify(mMockView).hideProgress();
    }


}
