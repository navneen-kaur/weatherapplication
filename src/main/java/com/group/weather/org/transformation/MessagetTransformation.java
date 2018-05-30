package com.group.weather.org.transformation;

import com.group.weather.org.Util.DateConversions;
import com.group.weather.org.domain.*;

public class MessagetTransformation {

    public CurrentWeatherResponseUi responseUiCelsius(CurrentWeatherResponse updatedResponse , CurrentWeatherResponseUi finalResponse) {

        commonCode(updatedResponse, finalResponse);
        Temperature temp = new Temperature();
        temp.setTemp(getCelsius(updatedResponse.getMain().getTemp()));
        temp.setTemp_min(getCelsius(updatedResponse.getMain().getTemp_min()));
        temp.setTemp_max(getCelsius(updatedResponse.getMain().getTemp_max()));
        temp.setUnit("Celsius");
        Pressure pres = new Pressure();
        pres.setValue(updatedResponse.getMain().getPressure());
        pres.setUnit("hpa");
        temp.setPressure(pres);
        Humidity humid = new Humidity();
        humid.setValue(updatedResponse.getMain().getHumidity());
        humid.setUnit("%");
        temp.setHumidity(humid);
        finalResponse.setTemperaturedetails(temp);

       return finalResponse;
    }

    public CurrentWeatherResponseUi responseUiFahrenheit(CurrentWeatherResponse updatedResponse , CurrentWeatherResponseUi finalResponse) {
        commonCode(updatedResponse, finalResponse);
        Temperature temp = new Temperature();
        temp.setTemp(getFahrenheit(updatedResponse.getMain().getTemp()));
        temp.setTemp_min(getFahrenheit(updatedResponse.getMain().getTemp_min()));
        temp.setTemp_max(getFahrenheit(updatedResponse.getMain().getTemp_max()));
        temp.setUnit("Fahrenheit");
        Pressure pres = new Pressure();
        pres.setValue(updatedResponse.getMain().getPressure());
        pres.setUnit("hpa");
        temp.setPressure(pres);
        Humidity humid = new Humidity();
        humid.setValue(updatedResponse.getMain().getHumidity());
        humid.setUnit("%");
        temp.setHumidity(humid);
        finalResponse.setTemperaturedetails(temp);

        return finalResponse;

    }

    public void commonCode(CurrentWeatherResponse updatedResponse , CurrentWeatherResponseUi finalResponse){

        DateConversions conversions = new DateConversions();
        finalResponse.setLatestUpdate(conversions.getConvertedResponse(updatedResponse.getDt()));
        finalResponse.setName(updatedResponse.getName());
        finalResponse.setWeather(updatedResponse.getWeather());
        finalResponse.setCod(updatedResponse.getCod());
        Sun sun = new Sun();
        sun.setSunrise(conversions.getConvertedResponse(updatedResponse.getSys().getSunrise()));
        sun.setSunset(conversions.getConvertedResponse(updatedResponse.getSys().getSunset()));
        finalResponse.setSun(sun);

    }

    public double getCelsius(double temperature){
        return temperature -273.16;
    }

    public double getFahrenheit(double temperature){
        return (((temperature - 273) * 9/5) + 32);
    }

}
