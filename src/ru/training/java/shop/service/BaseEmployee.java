package ru.training.java.shop.service;

import ru.training.java.shop.department.BaseDepartment;
import ru.training.java.shop.interfaces.DepartmentInterface;
import ru.training.java.shop.interfaces.EmployeeInterface;

public class BaseEmployee implements EmployeeInterface {

    private String name;
    private DepartmentInterface department;
    private boolean free;

    public BaseEmployee(String name, BaseDepartment department, boolean free) {
        this.name = name;
        this.department = department;
        this.free = free;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentInterface department) {
        this.department = department;
    }

    @Override
    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
