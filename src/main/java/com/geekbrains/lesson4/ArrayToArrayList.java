package com.geekbrains.lesson4;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList<T> {
    public List<T> toArrayList(T[] array) {
        List<T> result = Arrays.asList(array);
        return result;
    }
}
