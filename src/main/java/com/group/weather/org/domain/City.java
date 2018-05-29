
package com.group.weather.org.domain;

import lombok.*;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Data
public class City {

    private Integer id;
    private String name;
    private Coord coord;
    private String country;
    private Integer population;
    private Map<String,String> sys = new HashMap<>();

}
