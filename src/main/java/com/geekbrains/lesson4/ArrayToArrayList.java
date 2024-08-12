package com.geekbrains.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList<T> {
    public <T> ArrayList<T> toArrayList(T[] array) {
//        List<T> result = Arrays.asList(array);
//        return result;
        return new ArrayList<>(Arrays.asList(array));
    }
}
