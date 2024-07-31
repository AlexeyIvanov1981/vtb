package com.geekbrains.lesson2.homework.one;

public class Cat implements RunnableAndJumpable {

    private String name;
    private int maxJumpHeight;
    private int maxDistance;

    public Cat(String name, int maxJumpHeight, int maxDistance) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxDistance = maxDistance;
    }

    @Override
    public void run() {
        System.out.println("Кот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }

    public String getName() {
        return name;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public int getMaxDistance() {
        return maxDistance;
    }


}
