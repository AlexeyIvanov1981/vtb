package com.geekbrains.lesson2.homework.one;

public class Main {
    public static void main(String[] args) {
        Plaeyers[] plaeyers = {
                new Cat("Barsik", 200, 6),
                new Robot("Verder", 1000, 5),
                new Human("Vova", 600, 4)
        };

        Obstacle[] obstacles = {
                new Wall(),
                new Track()
        };
        for (Obstacle obstacle : obstacles) {
            for (Plaeyers player : plaeyers) {
                obstacle.doIt(player);
            }
        }
    }
}
