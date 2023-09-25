package com.geekbrains.lesson2.homework.one;

public class Robot implements RunnableAndJumpable {
    private String name;
    private int maxJumpHeight;
    private int maxDistance;


    public Robot(String name, int maxJumpHeight, int maxDistance) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxDistance = maxDistance;
    }

    @Override
    public void run() {
        System.out.println("Робот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }
}
