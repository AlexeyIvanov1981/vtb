package com.geekbrains.lesson5;

public class MainApp {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Word word = new Word();

        phoneBook.add("Ivanov", "9514916676");
        phoneBook.add("Ivanov", "9514916677");
        phoneBook.add("Petrov", "9514916678");
        phoneBook.add("Sidorov", "9514916679");

        phoneBook.get("Ivanov");

        String[] arrayOfWords = {
                "Good", "Food", "OK", "Fuel",
                "Dog", "Cat", "Cat", "Moon",
                "Freeze", "Rain", "Fill", "Age",
                "Name", "Frog", "Frog", "Frog", "List"
        };

        word.uniqeWord(arrayOfWords);
        word.wordCount(arrayOfWords);
    }
}


