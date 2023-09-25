package com.geekbrains.lesson2.homework.one;

public class HomeworkTest {
    public static void main(String[] args) {
        RunnableAndJumpable[] runnableAndJumpable = {
                new Cat("Кот Мурзик", 5, 50),
                new Robot("Робот Вердер", 10, 1000),
                new Human("Человек Петя", 3, 500)
        };

        for (RunnableAndJumpable r : runnableAndJumpable){
            r.run();
            r.jump();
        }
    }
}
