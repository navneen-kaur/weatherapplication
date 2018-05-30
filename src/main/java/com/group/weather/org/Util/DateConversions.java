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


public class DateConversions {


    public Date getConvertedResponse(int unixDate) {

        return new Date(unixDate * 1000L);

    }
}
