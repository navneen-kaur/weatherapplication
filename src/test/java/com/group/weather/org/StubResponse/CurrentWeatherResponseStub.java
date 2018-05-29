package com.group.weather.org.StubResponse;

import com.group.weather.org.domain.Clouds;
import com.group.weather.org.domain.CurrentWeatherResponse;

public class CurrentWeatherResponseStub {

    public CurrentWeatherResponse getStubWeatherResponse(){

        CurrentWeatherResponse currentWeatherResponse = new CurrentWeatherResponse();

        currentWeatherResponse.setBase("abc");
        //currentWeatherResponse.setClouds();

        return currentWeatherResponse;
    }
}
