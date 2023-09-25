package com.geekbrains.lesson2.interfacies;

public class MainAppLesson2 {
    static class Human {
        private Transport lastTransport;

        public void drive(Transport transport) {
            transport.start();
            this.lastTransport = transport;
        }

        public void stop(Transport transport){
            if (lastTransport != null){
                lastTransport.stop();
                lastTransport = null;
            } else System.out.println("Я никуда не еду");
        }
    }

    public static void main(String[] args) {
        Transport transport = new Bicycle();
        Human human = new Human();

        human.stop(transport);
        human.drive(transport);
        human.stop(transport);



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

    static class Moto implements Transport {
        @Override
        public void start() {
            System.out.println("Человек начал ехать на мотоцикле");
        }

        @Override
        public void stop() {
            System.out.println("Человек остановил свой мотоцикл");
        }
    }
}


