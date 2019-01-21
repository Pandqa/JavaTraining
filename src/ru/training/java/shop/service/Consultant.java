package ru.training.java.shop.service;

import ru.training.java.shop.department.BaseDepartment;

public class Consultant extends BaseEmployee {

    String name;


    public Consultant(String name, BaseDepartment department, boolean free) {
        super(name, department, free);
    }
}
