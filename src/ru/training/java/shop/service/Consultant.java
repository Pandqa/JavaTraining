package ru.training.java.shop.service;

public class Consultant extends BaseEmployee {

    private String name;
    private String deportament;

    public Consultant(String name, String deportament) {
        this.name = name;
        this.deportament = deportament;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeportament() {
        return deportament;
    }

    public void setDeportament(String deportament) {
        this.deportament = deportament;
    }


}
