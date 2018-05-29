package com.group.weather.org.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.group.weather.org.domain.CurrentWeatherResponse;
import com.group.weather.org.service.WeatherAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class WeatherApplicationController {

    private WeatherAppService weatherAppService;

    @Autowired
    public WeatherApplicationController(final WeatherAppService weatherAppService){
        this.weatherAppService = weatherAppService;
    }

    @RequestMapping(value="/weather/{city}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CurrentWeatherResponse index(@PathVariable(value="city")String city) throws JsonProcessingException {
        CurrentWeatherResponse currentWeather = weatherAppService.getCurrentWeather(city);
        return currentWeather;
    }

}