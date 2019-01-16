package ru.training.java.shop.goods;

public class Camera extends ElectronicDevice {

    private int pixels;
    private String color;
    private String lensName;
    private int lens;

    public Camera(int pixels, String color, String lensName, int lens) {
        this.pixels = pixels;
        this.color = color;
        this.lensName = lensName;
        this.lens = lens;
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

}
