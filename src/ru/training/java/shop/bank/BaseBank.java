package ru.training.java.shop.bank;

import ru.training.java.shop.interfaces.BankInterface;

public class BaseBank implements BankInterface {

    private String name;
    private String creditDescription;

    @Override
    public void checkInfo() {

    }

    @Override
    public void giveCredit() {

    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }

    @Override
    public String getName() {
        return name;
    }

}
