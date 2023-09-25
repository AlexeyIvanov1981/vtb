package com.geekbrains.lesson2.homework.one;

public class Cat implements RunnableAndJumpable {

    private String mame;
    private int maxJumpHeight;
    private int maxDistance;

    public Cat(String mame, int maxJumpHeight, int maxDistance) {
        this.mame = mame;
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
}
