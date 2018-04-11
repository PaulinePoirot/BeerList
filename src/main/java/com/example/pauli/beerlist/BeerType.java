package com.example.pauli.beerlist;

import java.util.Date;
import java.lang.String;

/**
 * Created by rudy on 09/04/2018.
 */

public class BeerType {
    public String name;

    public BeerType() {

    }

    public BeerType(int id, String name, String createDate) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
