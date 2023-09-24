package com.geekbrains.lesson1.homework;

public class Cat extends AnimalHW {
    private static int catsCount;

    public Cat(String name, String color) {
        super(name, color);
        catsCount++;
    }

    @Override
    public int run(int distance) {
        if (distance > 200) {
            System.out.println("Кот может пробежать только 200 метров");
            return 200;
        } else return distance;
    }

    @Override
    public int swim(int distance) {
        if (distance > 0) {
            System.out.println("Коты не умеют плавать");
            return 0;
        } else return 0;
    }

    public static int getCatsCount() {
        return catsCount;
    }
}
