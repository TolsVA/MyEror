package org.example.semenar_3.task4;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException() {
        super("Размер массива не верный");
    }
}
