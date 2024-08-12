package com.geekbrains.lesson4;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<Fruit> boxForFruits = new ArrayList<>();

    public ArrayList<Fruit> getBoxForFruits() {
        return boxForFruits;
    }

    public void setFruitToBox(Fruit fruit) {
        if (boxForFruits.isEmpty()) {
            this.boxForFruits.add(fruit);
            System.out.println("Вы положили фрукт " + fruit.getType() + " в коробку");
        } else if (boxForFruits.get(0).getType().equals(fruit.getType())) {
            this.boxForFruits.add(fruit);
            System.out.println("Вы положили фрукт " + fruit.getType() + " в коробку c " + boxForFruits.get(0).getType());
        } else {
            System.out.println("Вы не можете складывать разные фрукты в одну коробку");
        }
    }

    public double getWeight() {
        double sumWeight = 0.0;
        for (Fruit fruit : boxForFruits) {
            sumWeight += fruit.getWeight();
        }
        return sumWeight;
    }

    public boolean compare(Box anotheBox) {
        return this.getWeight() - anotheBox.getWeight() < 0.0001;
    }

    public void changeBox(Box<T> box) {
        if (boxForFruits.addAll(box.getBoxForFruits())) {
            System.out.println("Вы пересыпали фрукты в другую коробку");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
