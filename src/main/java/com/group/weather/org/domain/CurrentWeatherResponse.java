package com.group.weather.org.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;

@Data
@JsonIgnoreProperties
public class CurrentWeatherResponse
{
    private Coord coord;

    private ArrayList<Weather> weather;

    private String base;

    private Main main;

    private int visibility;

    private Wind wind;

    private Clouds clouds;

    private int dt;

    private Sys sys;

    private int id;

    private String name;

    private int cod;

    private Date date;

}
