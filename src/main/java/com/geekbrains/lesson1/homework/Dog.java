package com.geekbrains.lesson1.homework;

public class Dog extends AnimalHW {
    private static int dogsCount;

    public Dog(String name, String color) {
        super(name, color);
        dogsCount++;
    }

    @Override
    public int run(int distance) {
        if (distance > 500) {
            System.out.println("Собаки не бегают больше 500 метров");
            return 500;
        } else return distance;
    }

    @Override
    public int swim(int distance) {
        if (distance > 10) {
            System.out.println("Собаки не плавают больше 10 метров");
            return 10;
        } else return distance;
    }

    public static int getDogsCount() {
        return dogsCount;
    }
}
