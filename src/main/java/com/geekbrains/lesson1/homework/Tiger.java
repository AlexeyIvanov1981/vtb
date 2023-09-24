package com.geekbrains.lesson1.homework;

public class Tiger extends AnimalHW {
    private static int tigersCount;

    public Tiger(String name, String color) {
        super(name, color);
        tigersCount++;
    }

    public static int getTigersCount() {
        return tigersCount;
    }

    @Override
    public int run(int distance) {
        if (distance > 1000) {
            System.out.println("Тигры больше 1000 метров не пробегают");
            return 1000;
        } else return distance;
    }

    @Override
    public int swim(int distance) {
        if (distance > 100) {
            System.out.println("Тигры плавают по 100 метров");
            return 100;
        } else return distance;
    }
}
