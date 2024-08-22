package com.geekbrains.lesson5;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private String username;
    private String phoneNumber;

    private Map<String, String> phoneBook = new HashMap<>();

//    public String get(String userName) {
//        return phoneBook.get(userName);
//    }

    public void add(String userName, String phoneNumber) {
        phoneBook.put(phoneNumber, userName);
    }


    public void get(String userName) {
        for (Map.Entry<String, String> map : phoneBook.entrySet()) {
            if (userName.equals(map.getValue())) {
                System.out.println(map.getKey());
            }
        }

    }

    public int getSize() {
        return phoneBook.size();
    }

}
