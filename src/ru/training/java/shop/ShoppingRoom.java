package ru.training.java.shop;

import ru.training.java.shop.interfaces.DepartmentInterface;
import ru.training.java.shop.interfaces.VisitorInterface;
import ru.training.java.shop.service.Administrator;

import java.util.ArrayList;

public class ShoppingRoom {

    private ArrayList<DepartmentInterface> departmentList;
    private String name;
    private ArrayList<VisitorInterface> visitorList;
    private Administrator administrator;

}
