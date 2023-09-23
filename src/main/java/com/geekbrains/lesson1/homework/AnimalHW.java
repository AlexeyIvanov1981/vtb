package com.geekbrains.lesson1.homework;

import java.util.Objects;

public abstract class AnimalHW {
    protected String name;
    protected String color;

    public AnimalHW(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void run();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalHW animalHW = (AnimalHW) o;
        return Objects.equals(name, animalHW.name) && Objects.equals(color, animalHW.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}
