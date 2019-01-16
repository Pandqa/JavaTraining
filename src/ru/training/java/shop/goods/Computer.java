package ru.training.java.shop.goods;

public class Computer extends ElectronicDevice {

    private String motherboard;
    private String cpu;
    private String videoCard;
    private int hdd;
    private int ram;

    public Computer(String motherboard, String cpu, String videoCard, int hdd, int ram) {
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.videoCard = videoCard;
        this.hdd = hdd;
        this.ram = ram;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

}
