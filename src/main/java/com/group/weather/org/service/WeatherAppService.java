package com.group.weather.org.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.group.weather.org.domain.CurrentWeatherResponse;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface WeatherAppService {

    CurrentWeatherResponse getCurrentWeather(@NotNull @Valid String city) throws JsonProcessingException;
}
