package ru.training.java.shop.department;

import ru.training.java.shop.interfaces.DepartmentInterface;
import ru.training.java.shop.interfaces.EmployeeInterface;
import ru.training.java.shop.interfaces.GoodsInterface;

import java.util.ArrayList;

public class BaseDepartment implements DepartmentInterface {

    private String name;
    private ArrayList<EmployeeInterface> employeeList;
    private ArrayList<GoodsInterface> goodsList;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodsList() {
        return goodsList;
    }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }

    public void setGoodsList(ArrayList<GoodsInterface> goodsList) {
        this.goodsList = goodsList;
    }
}
