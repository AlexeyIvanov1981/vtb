package com.geekbrains.lesson2;

public class MainAppLesson2 {
    public static void main(String[] args) {

    }

    static class Car implements Transport {
        @Override
        public void start() {
            System.out.println("Человек начал ехать на машине");
        }

        @Override
        public void stop() {
            System.out.println("Человек остановил свою машину");
        }
    }

    static class Skateboard implements Transport {
        @Override
        public void start() {
            System.out.println("Человек начал ехать на скейте");
        }

        @Override
        public void stop() {
            System.out.println("Человек остановил свой скейт");
        }
    }

    static class Bicycle implements Transport {
        @Override
        public void start() {
            System.out.println("Человек начал ехать на велосипеде");
        }

        @Override
        public void stop() {
            System.out.println("Человек остановил свой велосипед");
        }
    }
}


