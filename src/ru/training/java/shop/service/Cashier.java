package ru.training.java.shop.service;

import ru.training.java.shop.department.BaseDepartment;

public class Cashier extends BaseEmployee {

    private int experience;

    public Cashier(String name, BaseDepartment department, boolean free) {
        super(name, department, free);
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
