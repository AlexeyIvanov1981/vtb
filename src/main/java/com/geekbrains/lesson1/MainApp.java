package com.geekbrains.lesson1;

import com.geekbrains.lesson1.animal.Cat;
import com.geekbrains.lesson1.animal.Dog;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "Black", 2);
        Cat cat2 = new Cat("Murzik", "White", 4);
        Dog dog = new Dog("Bobik", "Grey", 3);

        cat.voice();
        cat2.voice();
        dog.voice();
    }
}