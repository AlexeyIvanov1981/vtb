package com.geekbrains.lesson2.homework.one;

import com.geekbrains.lesson2.homework.two.Wall;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeworkTest {

    public static void main(String[] args) {
        JButton btn = new JButton(((ActionListener) e -> System.out.println("1")).toString());

        class Treadmill {
            private int trackLength;

            public Treadmill(int trackLength) {
                this.trackLength = trackLength;
            }

            public void runTreadmill(int trackLength, int maxDistance, String name) {
                if (trackLength > maxDistance) {
                    System.out.println(name + " не смог пробежать эту дистанцию");
                } else System.out.println(name + " смог пробежать эту дистанцию");
            }

            public int getTrackLength() {
                return trackLength;
            }
        }

        class Wall {
            private int wallHeight;

            public Wall(int wallHeight) {
                this.wallHeight = wallHeight;
            }

            public void jumpOverWall(int wallHeight, int subjectMaxJumpHeight, String name) {
                if (wallHeight > subjectMaxJumpHeight) {
                    System.out.println(name + " не смог преодалеть стену");
                } else System.out.println(name + " смог перепрыгнуть стену");
            }

            public int getWallHeight() {
                return wallHeight;
            }
        }


        Wall wall = new Wall(4);
        Treadmill treadmill = new Treadmill(500);

        RunnableAndJumpable[] runnableAndJumpable = {
                new Cat("Кот Мурзик", 5, 50),
                new Robot("Робот Вердер", 10, 1000),
                new Human("Человек Петя", 3, 500)
        };


//        List<RunnableAndJumpable> runnableAndJumpable2 = new ArrayList<RunnableAndJumpable>();
//        runnableAndJumpable2.add(new Cat("Кот Мурзик", 5, 50));
//        runnableAndJumpable2.add(new Robot("Робот Вердер", 10, 1000));
//        runnableAndJumpable2.add(new Human("Человек Петя", 3, 500));


        for (RunnableAndJumpable r : runnableAndJumpable) {
            r.run();
            r.jump();
        }

        Cat cat = new Cat("Кот Мурзик", 5, 50);
        Robot robot = new Robot("Робот Вердер", 10, 1000);
        Human human = new Human("Человек Петя", 3, 500);


        wall.jumpOverWall(wall.getWallHeight(), cat.getMaxJumpHeight(), cat.getName());
        wall.jumpOverWall(wall.getWallHeight(), robot.getMaxJumpHeight(), robot.getName());
        wall.jumpOverWall(wall.getWallHeight(), human.getMaxJumpHeight(), human.getName());

        treadmill.runTreadmill(treadmill.getTrackLength(), cat.getMaxDistance(), cat.getName());
        treadmill.runTreadmill(treadmill.getTrackLength(), robot.getMaxDistance(), robot.getName());
        treadmill.runTreadmill(treadmill.getTrackLength(), human.getMaxDistance(), human.getName());
    }
}
