package com.geekbrains.lesson3;

public class App {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4" },
                {"4", "3", "2", "1" },
                {"5", "6", "7", "8" },
                {"8", "7", "6", "5" }
        };
        String[][] array2 = {
                {"1", "2", "3", "5" },
                {"4", "3", "2", "v" },
                {"5", "6", "7", "5" },
                {"8", "7", "6", "7" }
        };

        System.out.println("Сумма всех чисел массива = " + forArray(array));
        System.out.println(forArray(array2));
    }

    public static int forArray(String[][] array) {

        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4) {
            throw new MyArraySizeException("Неправильный размер массива");
        } else {
            System.out.println("Массив задан 4*4 верно");
        }

        int[][] result = new int[4][4];
        int sum = 0;

        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        result[i][j] = Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j, result);
                    }
                    sum += Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return sum;
    }
}
