package ru.training.java.shop.goods;

public class Phone extends ElectronicDevice {

    private int ram;
    private int rom;
    private int diagonal;
    private int pixels;
    private String os;
    private String color;

    public Phone(int ram, int rom, int diagonal, int pixels, String os, String color) {
        this.ram = ram;
        this.rom = rom;
        this.diagonal = diagonal;
        this.pixels = pixels;
        this.os = os;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
