package ru.training.java.shop.client;

public class Visitor {

    private String name;
    private int balance;

    public Visitor(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void buy() {

    }

    public void toReturn() {

    }

}
