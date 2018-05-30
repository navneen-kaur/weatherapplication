
package com.group.weather.org.domain;

import lombok.Data;


@Data
public class Temperature
{
    private double temp;

    private Pressure pressure;

    private Humidity humidity;

    private double temp_min;

    private double temp_max;

    private String unit;

}
