package com.group.weather.org.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
@JsonIgnoreProperties
public class CurrentWeatherResponseUi {


    private ArrayList<Weather> weather;

    private Main main;


    private Sun sun;

    private int id;

    private String name;

    private int cod;

    private Date date;

}
