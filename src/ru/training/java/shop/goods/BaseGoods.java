package ru.training.java.shop.goods;

import ru.training.java.shop.department.BaseDepartment;
import ru.training.java.shop.interfaces.GoodsInterface;

public class BaseGoods implements GoodsInterface {

    private double price;
    private boolean hasGuarantee;
    private String name;
    private BaseDepartment department;
    private String company;

    public BaseGoods(double price, boolean hasGuarantee, String name, BaseDepartment department, String company) {
        this.price = price;
        this.hasGuarantee = hasGuarantee;
        this.name = name;
        this.department = department;
        this.company = company;
    }

    public BaseGoods() {
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean hasGuarantee() {
        return false;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasGuarantee() {
        return hasGuarantee;
    }

    public void setHasGuarantee(boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public BaseDepartment getDepartment() {
        return department;
    }

    public void setDepartment(BaseDepartment department) {
        this.department = department;
    }

    @Override
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
