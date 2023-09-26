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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(int maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
