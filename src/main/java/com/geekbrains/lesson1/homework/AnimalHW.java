package com.geekbrains.lesson1.homework;

import java.util.Objects;

public abstract class AnimalHW {
    protected String name;
    protected String color;
    private static int animalCount;

    public AnimalHW(String name, String color) {
        this.name = name;
        this.color = color;
        animalCount++;
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

    public abstract int run(int distance);

    public abstract int swim(int distance);

    public static int getAnimalCount() {
        return animalCount;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
