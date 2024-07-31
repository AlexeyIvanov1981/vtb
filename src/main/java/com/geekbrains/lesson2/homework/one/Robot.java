package com.geekbrains.lesson2.homework.one;

public class Robot implements Plaeyers {
    private boolean actions = true;
    private String name;
    private int maxDistance, maxHeight;

    public Robot(String name, int maxDistance, int maxHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run(int trackDistance) {
        if (!actions) return;
        if (trackDistance <= maxDistance) {
            System.out.println(name + " пробежал дистанцию " + trackDistance);
        } else {
            System.out.println(name + " не пробежал дистанцию " + trackDistance);
            actions = false;
        }
    }

    @Override
    public void jump(int wallHeight) {
        if (!actions) return;
        if (wallHeight <= maxHeight) {
            System.out.println(name + " смог перепрыгнуть стену высотой " + wallHeight);
        } else {
            System.out.println(name + " не смог перепрыгнуть стену высотой " + wallHeight);
            actions = false;
        }
    }
}
