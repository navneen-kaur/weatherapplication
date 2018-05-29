
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

    public double getTempMin() { return this.temp_min; }

    public void setTempMin(double temp_min) { this.temp_min = temp_min; }

    private double temp_max;

    public double getTempMax() { return this.temp_max; }

    public void setTempMax(double temp_max) { this.temp_max = temp_max; }
}
