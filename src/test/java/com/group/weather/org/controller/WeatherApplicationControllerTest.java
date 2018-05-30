package com.group.weather.org.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.group.weather.org.StubResponse.CurrentWeatherResponseStub;
import com.group.weather.org.domain.CurrentWeatherResponse;
import com.group.weather.org.domain.CurrentWeatherResponseUi;
import com.group.weather.org.service.WeatherAppService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.Matchers.any;


@RunWith(SpringRunner.class)
public class WeatherApplicationControllerTest {

    @Mock
    WeatherAppService weatherAppService;

    @InjectMocks
    private WeatherApplicationController weatherApplicationController;

    @Before
    public void setUp() throws Exception{
        this.weatherApplicationController = new WeatherApplicationController(this.weatherAppService);

    }
    @Test
     public void testServiceResponseNotNull() throws Exception{
        Mockito.when(this.weatherAppService.getCurrentWeather("London", "Celsius")).thenReturn(getStubWeatherResponse());
        CurrentWeatherResponseUi response = weatherApplicationController.getCurrentWeather("London", "Celsius");
        Assert.assertNotNull(response);
    }

    @After
    public void tearDown(){
        this.weatherApplicationController = null;
    }

    public CurrentWeatherResponseUi getStubWeatherResponse(){

        return new CurrentWeatherResponseUi();
    }

}