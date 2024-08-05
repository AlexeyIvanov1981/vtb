package com.geekbrains.lesson4;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        ArrayToArrayList arrayToArrayList = new ArrayToArrayList();
        ChangeElement changeElement = new ChangeElement<>();

        System.out.println(Arrays.toString(array));
        changeElement.changeElement(array, 1, 3);
        System.out.println(Arrays.toString(array));

        System.out.println(arrayToArrayList.toArrayList(array));
    }
}
