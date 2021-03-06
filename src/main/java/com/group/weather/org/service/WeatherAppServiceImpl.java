package com.group.weather.org.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.group.weather.org.Util.DateConversions;
import com.group.weather.org.domain.*;
import com.group.weather.org.transformation.MessagetTransformation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Arrays;

@Service
public class WeatherAppServiceImpl implements WeatherAppService {

    @Value("${weather.apikey}")
    String apiKey;

    public static final String URL_OPEN_WEATHER_ORG = "http://api.openweathermap.org/data/2.5/weather?q=";

    public CurrentWeatherResponseUi getCurrentWeather(@NotNull @Valid String city ,@NotNull @Valid String unit) throws Exception {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(new MediaType[]{MediaType.APPLICATION_JSON_UTF8}));
        headers.setContentType(MediaType.APPLICATION_PROBLEM_JSON_UTF8);
        HttpEntity<CurrentWeatherResponse> entity = new HttpEntity<CurrentWeatherResponse>(headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CurrentWeatherResponse> response = restTemplate.exchange(URL_OPEN_WEATHER_ORG + city + "&APPID=" + apiKey, HttpMethod.GET, entity, CurrentWeatherResponse.class);
        CurrentWeatherResponse updatedResponse = response.getBody();
        CurrentWeatherResponseUi finalResponse = new CurrentWeatherResponseUi();
        MessagetTransformation CurrentWeather = new MessagetTransformation();
        if (unit.equalsIgnoreCase("Celsius")) {
            return CurrentWeather.responseUiCelsius(updatedResponse, finalResponse);
        }
        else if (unit.equalsIgnoreCase("Fahrenheit")){
            return CurrentWeather.responseUiFahrenheit(updatedResponse, finalResponse);

    }
       return new CurrentWeatherResponseUi();
    }
}
