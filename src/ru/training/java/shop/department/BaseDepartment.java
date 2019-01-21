package ru.training.java.shop.department;

import ru.training.java.shop.goods.BaseGoods;
import ru.training.java.shop.interfaces.DepartmentInterface;
import ru.training.java.shop.service.BaseEmployee;

import java.util.ArrayList;

public class BaseDepartment implements DepartmentInterface {

    private String name;
    private ArrayList<BaseEmployee> employeeList;
    private ArrayList<BaseGoods> goodsList;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<BaseEmployee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public ArrayList<BaseGoods> getGoodsList() {
        return goodsList;
    }
}
