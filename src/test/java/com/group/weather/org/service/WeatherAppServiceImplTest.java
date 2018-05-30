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


import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;


import java.net.URI;
import java.util.Arrays;

import static org.mockito.Matchers.any;

@RunWith(SpringRunner.class)
public class WeatherAppServiceImplTest {

    @Mock
    HttpHeaders httpHeaders;

    @Mock
    HttpEntity httpEntity;

    @InjectMocks
    private WeatherAppServiceImpl weatherAppServiceImpl;

    @Mock
    RestTemplate rest;

    @Before
    public void setUp() {


          }

    @Test
    public void testServiceImpl() throws Exception {
        ResponseEntity<CurrentWeatherResponse> responseEntity = new ResponseEntity<CurrentWeatherResponse>(HttpStatus.OK);
       /* Mockito.when(rest.exchange(
                Matchers.anyString(),
                Matchers.any(HttpMethod.class),
                Matchers.<HttpEntity<?>> any(),
                Matchers.<Class<String>> any()
                )
        ).then(responseEntity);*/

       // CurrentWeatherResponse response1 = this.weatherAppServiceImpl.getCurrentWeather("london");
       // Assert.assertNotNull(response1);

    }

    public ResponseEntity<CurrentWeatherResponse> stubResp() {

        return new ResponseEntity<CurrentWeatherResponse>(HttpStatus.OK);
    }

}
