package com.geekbrains.lesson2.homework.two;

public class Wall {
    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public void jumpOverWall(int wallHeight, int subjectMaxJumpHeight, String name){
        if (wallHeight > subjectMaxJumpHeight){
            System.out.println(name + "не смог преодалеть стену");
        } else System.out.println(name + "смог перепрыгнуть");
    }

    public int getWallHeight() {
        return wallHeight;
    }
}
