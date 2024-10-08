package com.geekbrains.lesson4;

public abstract class Fruit {

    private String type;
    private double weight;

    public Fruit(String type, double weight) {

        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
