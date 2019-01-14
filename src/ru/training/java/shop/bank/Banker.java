package ru.training.java.shop.bank;

public class Banker {

    private String name;
    private int experience;
    private String bank;

    public Banker(String name, int experience, String bank) {
        this.name = name;
        this.experience = experience;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

}
