package ru.training.java.shop.client;

import ru.training.java.shop.interfaces.VisitorInterface;

public class BaseVisitor implements VisitorInterface {

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

    @Override
    public void buy() {

    }

    @Override
    public void toReturn() {

    }

    @Override
    public String name() {
        return name;
    }

}
