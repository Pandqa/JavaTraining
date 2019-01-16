package ru.training.java.shop.goods;

public class Phone extends BaseGoods {

    private String name;
    private int ram;
    private int rom;
    private int diagonal;
    private int pixels;
    private String os;
    private int price;
    private String color;
    private String departament;

    public Phone(String name, int ram, int rom, int diagonal, int pixels, String os, int price, String color, String departament) {
        this.name = name;
        this.ram = ram;
        this.rom = rom;
        this.diagonal = diagonal;
        this.pixels = pixels;
        this.os = os;
        this.price = price;
        this.color = color;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getPixels() {
        return pixels;
    }

    public void setPixels(int pixels) {
        this.pixels = pixels;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
