package ru.training.java.shop;

import ru.training.java.shop.client.BaseVisitor;
import ru.training.java.shop.department.BaseDepartment;
import ru.training.java.shop.service.Administrator;

import java.util.ArrayList;

public class ShoppingRoom {

    private ArrayList<BaseDepartment> departmentList;
    private String name;
    private ArrayList<BaseVisitor> visitorList;
    private Administrator administrator;

}
