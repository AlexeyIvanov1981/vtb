package com.geekbrains.lesson3;

public class MyArrayDataException extends MyException{
    private int row;
    private int column;
    private int value;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Object getValue() {
        return value;
    }

    public MyArrayDataException(int row, int column, int[][] array) {
        super("Invalid data in [" + column + ";" + row + "]: " + array[row][column]);
        this.row = row;
        this.column = column;
        this.value = array[row][column];
    }
}
