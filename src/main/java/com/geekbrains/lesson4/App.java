package com.geekbrains.lesson4;

public class App {
    public static void main(String[] args) {
//        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
//        ArrayToArrayList arrayToArrayList = new ArrayToArrayList();
//        ChangeElement changeElement = new ChangeElement<>();
//
//        System.out.println(Arrays.toString(array));
//        changeElement.changeElement(array, 1, 3);
//        System.out.println(Arrays.toString(array));
//
//        System.out.println(arrayToArrayList.toArrayList(array));

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange = new Orange();

        Box box = new Box();
        box.setFruitToBox(apple1);
        box.setFruitToBox(apple2);
        box.setFruitToBox(orange);

        Box box2 = new Box();
        box2.setFruitToBox(orange);
        box2.setFruitToBox(orange);

        System.out.println(box.compare(box2));

        System.out.println(box.getWeight());

        Box box3 = new Box();

        box3.changeBox(box);

        System.out.println(box.getBoxForFruits());
        System.out.println(box3.getBoxForFruits());

        box3.changeBox(box2);
    }
}
