package com.example.pauli.beerlist;

import java.util.Date;
import java.lang.String;

/**
 * Created by rudy on 09/04/2018.
 */

public class BeerType {
    public int id;
    public String name;
    public String createDate;

    public BeerType() {

    }

    public BeerType(int id, String name, String createDate) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
