package ru.training.java.shop.service;

import ru.training.java.shop.department.BaseDepartment;
import ru.training.java.shop.interfaces.EmployeeInterface;

public class BaseEmployee implements EmployeeInterface {

    private String name;
    private BaseDepartment department;
    private boolean free;

    public BaseEmployee(String name, BaseDepartment department, boolean free) {
        this.name = name;
        this.department = department;
        this.free = free;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseDepartment getDepartment() {
        return department;
    }

    public void setDepartment(BaseDepartment department) {
        this.department = department;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
