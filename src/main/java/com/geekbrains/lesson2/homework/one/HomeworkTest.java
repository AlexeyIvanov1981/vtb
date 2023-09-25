package com.geekbrains.lesson2.homework.one;

import java.util.ArrayList;
import java.util.List;

public class HomeworkTest {
    public static void main(String[] args) {

        Wall wall = new Wall(4);
        Treadmill treadmill = new Treadmill(500);

        RunnableAndJumpable[] runnableAndJumpable = {
                new Cat("Кот Мурзик", 5, 50),
                new Robot("Робот Вердер", 10, 1000),
                new Human("Человек Петя", 3, 500)
        };

        List<RunnableAndJumpable> runnableAndJumpable2 = new ArrayList<RunnableAndJumpable>();
        runnableAndJumpable2.add(new Cat("Кот Мурзик", 5, 50));
        runnableAndJumpable2.add(new Robot("Робот Вердер", 10, 1000));
        runnableAndJumpable2.add(new Human("Человек Петя", 3, 500));


        for (RunnableAndJumpable r : runnableAndJumpable) {
            r.run();
            r.jump();
        }


    }
}
