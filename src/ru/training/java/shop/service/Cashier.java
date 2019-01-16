package ru.training.java.shop.service;

public class Cashier extends BaseEmployee {

    private String name;
    private int experience;

    public Cashier(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void sell() {

    }

    public void issuingBonusCard() {

    }

}
