package ru.training.java.shop.service;

public class Cashier extends BaseEmployee {

    private int experience;

    public Cashier(int experience) {
        this.experience = experience;
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
