package ru.training.java.shop.goods;

public class Camera {

    private String name;
    private int pixels;
    private String color;
    private String lensName;
    private int lens;
    private int price;
    private String departament;

    public Camera(String name, int pixels, String color, String lensName, int lens, int price, String departament) {
        this.name = name;
        this.pixels = pixels;
        this.color = color;
        this.lensName = lensName;
        this.lens = lens;
        this.price = price;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPixels() {
        return pixels;
    }

    public void setPixels(int pixels) {
        this.pixels = pixels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLensName() {
        return lensName;
    }

    public void setLensName(String lensName) {
        this.lensName = lensName;
    }

    public int getLens() {
        return lens;
    }

    public void setLens(int lens) {
        this.lens = lens;
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
