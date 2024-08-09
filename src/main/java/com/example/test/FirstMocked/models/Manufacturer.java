package com.example.test.FirstMocked.models;

import java.util.Calendar;

public class Manufacturer {
    private int id;
    private String name;
    private String description;
    private Calendar cooperation_date;

    public Manufacturer(int id, String name, String description, Calendar cooperation_date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cooperation_date = cooperation_date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Calendar getCooperation_date() {
        return cooperation_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCooperation_date(Calendar cooperation_date) {
        this.cooperation_date = cooperation_date;
    }
}
