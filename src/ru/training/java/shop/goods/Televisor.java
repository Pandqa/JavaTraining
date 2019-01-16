package ru.training.java.shop.goods;

public class Televisor extends BaseGoods {

    private String name;
    private int diagonal;
    private String color;
    private int price;
    private String departament;


    public Televisor(String name, int diagonal, String color, int price, String departament) {
        this.name = name;
        this.diagonal = diagonal;
        this.color = color;
        this.price = price;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public void on() {

    }

    public void off() {

    }

}
