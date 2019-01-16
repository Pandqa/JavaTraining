package ru.training.java.shop.goods;

public class Computer extends BaseGoods {

    private String name;
    private String motherboard;
    private String cpu;
    private String videoCard;
    private int hdd;
    private int ram;
    private int price;
    private String departament;

    public Computer(String name, String motherboard, String cpu, String videoCard, int hdd, int ram, int price, String departament) {
        this.name = name;
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.videoCard = videoCard;
        this.hdd = hdd;
        this.ram = ram;
        this.price = price;
        this.departament = departament;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void loadOS() {

    }

}
