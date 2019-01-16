package ru.training.java.shop.goods;

public class Televisor extends ElectronicDevice {

    private int diagonal;
    private String color;


    public Televisor(String name, int diagonal, String color, int price, String departament) {
        this.diagonal = diagonal;
        this.color = color;
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

}
