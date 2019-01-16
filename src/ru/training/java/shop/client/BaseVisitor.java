package ru.training.java.shop.client;

public class BaseVisitor {

    private String name;

    public BaseVisitor() {

    }

    public BaseVisitor(String name, int balance) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void buy() {

    }

    public void toReturn() {

    }

}
