package com.group.weather.org.Util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static java.util.Date.parse;

@RunWith(SpringRunner.class)
public class DateConversionsTest {

    @InjectMocks
    private  DateConversions dateConversions;

    @Test
    public void  testDateConversion() {
        Date dt = new Date(1527686400 * 1000L);
        Assert.assertEquals( dt, dateConversions.getConvertedResponse(1527686400));
    }
}
