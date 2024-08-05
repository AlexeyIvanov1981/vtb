package com.geekbrains.lesson4;

import java.util.Arrays;

public class ChangeElement<T> {
    private T element1;
    private T element2;

    private T[] array;

    public T getElement1() {
        return element1;
    }

    public T getElement2() {
        return element2;
    }

    public ChangeElement() {

    }

    public T[] changeElement(T[]array, int indexElement1, int indexElement2) {

        element1 = array[indexElement1];
        element2 = array[indexElement2];

        array[indexElement2] = element1;
        array[indexElement1] = element2;
        Arrays.copyOfRange(array, 1, 4);

        return array;
    }
}
