package com.geekbrains.lesson1.homework;

public class TestMain {
    public static void main(String[] args) {
        AnimalHW[] animalHWS = {
                new Cat("Barsik", "White"),
                new Dog("Bobik", "Black"),
                new Tiger("Tigrr", "Orange")
        };

        for (AnimalHW a : animalHWS) {
            System.out.println(a.getName() + " пробежал " + a.run(1000) + " метров");
            System.out.println(a.getName() + " проплыл " + a.swim(5000) + " метров");
            System.out.println();
        }
        System.out.println("Всего животных: " + AnimalHW.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего тигров: " + Tiger.getTigerCount());

    }
}
