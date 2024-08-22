package com.geekbrains.lesson5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Word {
    TreeSet<String> uniq = new TreeSet<>();

    public void uniqeWord(String[] array) {
        uniq.addAll(List.of(array));
        for (String s : uniq) {
            System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();
    }

    public void wordCount(String[] array) {
        Map<String, Integer> count = new HashMap<>();
        for (int i = 0; i < array.length; i++) {

            String tempStr = array[i];

            if (!count.containsKey(tempStr)) {
                count.put(tempStr, 1);
            } else {
                count.put(tempStr, count.get(tempStr) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println("Word = '" + entry.getKey() + "', count = " + entry.getValue());
        }
    }
}
