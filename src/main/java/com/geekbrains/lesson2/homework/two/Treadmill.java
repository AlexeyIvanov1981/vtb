package com.geekbrains.lesson2.homework.two;

public class Treadmill {
    private int trackLength;

    public Treadmill(int trackLength) {
        this.trackLength = trackLength;
    }

    public void runTreadmill(int trackLength, int maxDistance, String name){
        if (trackLength > maxDistance){
            System.out.println(name + " не смог пробежать эту дистанцию");
        } else System.out.println(name + " смог пробежать эту дистанцию");
    }

    public int getTrackLength() {
        return trackLength;
    }
}
