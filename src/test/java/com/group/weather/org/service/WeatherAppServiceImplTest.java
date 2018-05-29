package com.group.weather.org.service;


import com.group.weather.org.domain.CurrentWeatherResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;

@RunWith(SpringRunner.class)
public class WeatherAppServiceImplTest {

    @InjectMocks
    private WeatherAppServiceImpl weatherAppServiceImpl;

    @Before
    public void setUp(){
        RestTemplate rest = new RestTemplate();

        //Mockito.when(rest.exchange(Matchers.any(URI.class), Matchers.any(HttpMethod.class), Matchers.<HttpEntity<?>> any(), Matchers.<Class<Object>> any())).thenReturn(stubResp());

    }

    @Test
    public void testServiceImpl() throws Exception{
        /*CurrentWeatherResponse response = this.weatherAppServiceImpl.getCurrentWeather("london");
        Assert.assertNotNull(response);*/
    }

public  ResponseEntity<CurrentWeatherResponse> stubResp (){

        return new ResponseEntity<CurrentWeatherResponse>(HttpStatus.OK);
}

}
