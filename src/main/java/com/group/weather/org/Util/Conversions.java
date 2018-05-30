package com.group.weather.org.Util;

import com.group.weather.org.domain.*;
import com.group.weather.org.service.WeatherAppService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Date;


public class Conversions {


    public CurrentWeatherResponseUi getConvertedResponse(CurrentWeatherResponse response,CurrentWeatherResponseUi finalResponse) {

        Date weatherDateTime= new Date(response.getDt()*1000L);
        java.util.Date weatherSunriseDateTime= new java.util.Date(response.getSys().getSunrise()*1000L);
        java.util.Date weatherSunsetDateTime= new java.util.Date(response.getSys().getSunset()*1000L);
        finalResponse.setLatestUpdate(weatherDateTime);
        finalResponse.setCod(response.getCod());
        finalResponse.setName(response.getName());
        finalResponse.setId(response.getId());
        finalResponse.setWeather(response.getWeather());
        Sun sun = new Sun();
        sun.setSunrise(weatherSunriseDateTime);
        sun.setSunset(weatherSunsetDateTime);
        finalResponse.setSun(sun);
        // conversion to celsius
        Temperature temp = new Temperature();
        double temp1 , tempMax , tempMin;
        temp1 = response.getMain().getTemp() - 273.16;
        tempMax = response.getMain().getTemp_max() - 273.16;
        tempMin = response.getMain().getTemp_min() - 273.16;

        temp.setTemp(temp1);
        temp.setTemp_max(tempMax);
        temp.setTemp_min(tempMin);
        temp.setUnit("Celsius");
        Pressure pres = new Pressure();
        pres.setValue(response.getMain().getPressure());
        pres.setUnit("hpa");
        temp.setPressure(pres);
        Humidity humid = new Humidity();
        humid.setValue(response.getMain().getHumidity());
        humid.setUnit("%");
        temp.setHumidity(humid);

        finalResponse.setTemperaturedetails(temp);

          return finalResponse;

    }
}
