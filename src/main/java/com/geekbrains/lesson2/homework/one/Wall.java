package com.geekbrains.lesson2.homework.one;

public class Wall implements Obstacle {
    private int height = 6;

    @Override
    public void doIt(Plaeyers plaeyers) {
        plaeyers.jump(height);
    }
}
