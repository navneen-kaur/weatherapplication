
package com.group.weather.org.domain;

import lombok.*;

import java.util.HashMap;
import java.util.Map;


@Data
public class Main
{
    private double temp;

    private int pressure;

    private int humidity;

    private double temp_min;

    private double temp_max;

}
