package com.geekbrains.lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String userName, String phoneNumber) {
        List<String> phones = new ArrayList<>();
        if (phoneBook.containsKey(userName)) {
            phoneBook.get(userName).add(phoneNumber);
        } else {
            phones.add(phoneNumber);
            phoneBook.put(userName, phones);
        }
    }

    public void get(String userName) {
        for (Map.Entry<String, List<String>> map : phoneBook.entrySet()) {
            if (userName.equals(map.getKey())) {
                System.out.println(map.getValue());
            }
        }
    }

    public int getSize() {
        return phoneBook.size();
    }
}
