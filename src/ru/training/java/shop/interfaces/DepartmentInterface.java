package ru.training.java.shop.interfaces;

import ru.training.java.shop.goods.BaseGoods;
import ru.training.java.shop.service.BaseEmployee;

import java.util.ArrayList;

public interface DepartmentInterface {

    String getName();

    ArrayList<BaseEmployee> getEmployeeList();

    ArrayList<BaseGoods> getGoodsList();
}
