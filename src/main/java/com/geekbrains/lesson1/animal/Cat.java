package com.geekbrains.lesson1.animal;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

//    static int field1;
//    static int field2;
//
//    static {
//        field1 = 1;
//        field2 = 2;
//        // или любой код который необходимо выполнить при загрузке класса
//    }

    @Override
    public void voice(){
        System.out.println(name + " Meeeeow");
    }




}
