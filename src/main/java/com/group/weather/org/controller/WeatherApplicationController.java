package com.group.weather.org.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.group.weather.org.domain.CurrentWeatherResponse;
import com.group.weather.org.domain.CurrentWeatherResponseUi;
import com.group.weather.org.service.WeatherAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class WeatherApplicationController {

    private WeatherAppService weatherAppService;

    @Autowired
    public WeatherApplicationController(final WeatherAppService weatherAppService){
        this.weatherAppService = weatherAppService;
    }

    @GetMapping(value="/weather/{city}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public CurrentWeatherResponseUi getCurrentWeather(@PathVariable(value="city")String city) throws Exception {
        return weatherAppService.getCurrentWeather(city);
    }

}