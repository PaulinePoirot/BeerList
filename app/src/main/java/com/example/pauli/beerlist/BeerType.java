package com.example.pauli.beerlist;

import java.lang.String;

/**
 * Created by rudy on 09/04/2018.
 */

public class BeerType {
    public String name;
    public String description;
    public String shortName;

    public BeerType() {
    }

    public BeerType(String name, String description, String shortName) {
        this.name = name;
        this.description = description;
        this.shortName = shortName;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}