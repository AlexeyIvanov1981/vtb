package com.geekbrains.lesson2.homework.one;

public class Track implements Obstacle {
    private int distanceTrack = 500;

    @Override
    public void doIt(Plaeyers plaeyers) {
        plaeyers.run(distanceTrack);
    }
}
