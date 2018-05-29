package com.group.weather.org.domain;

import lombok.*;

import java.util.ArrayList;

@Data
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

}
