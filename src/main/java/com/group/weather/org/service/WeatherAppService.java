package com.group.weather.org.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.group.weather.org.domain.CurrentWeatherResponse;
import com.group.weather.org.domain.CurrentWeatherResponseUi;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface WeatherAppService {

    CurrentWeatherResponseUi getCurrentWeather(@NotNull @Valid String city) throws Exception;
}
