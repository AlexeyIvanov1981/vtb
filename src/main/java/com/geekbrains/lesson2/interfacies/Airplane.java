package com.geekbrains.lesson2.interfacies;

public class Airplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Самолет летит");
    }
}
