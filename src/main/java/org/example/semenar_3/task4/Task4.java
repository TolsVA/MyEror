package org.example.semenar_3.task4;

import java.util.HashMap;
import java.util.Map;

/**
 Напишите метод, на вход которого подаётся двумерный строковый массив размером 3х3.
 При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

 1. Далее метод должен пройтись по всем элементам массива, преобразовать в число и просуммировать.
 Если в каком-то элементе массива преобразование не удалось
 (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException
 с детализацией, в какой именно ячейке лежат неверные данные.

 2. В методе main() вызвать полученный метод, обработать возможные исключения
 MyArraySizeException и MyArrayDataException и вывести результат расчета
 (сумму элементов, при условии, что подали на вход корректный массив).
 */
public class Task4 {
    static String[][] arr = new String[][] {
            {"1", "1.5ff", "1.5"},
            {"1gg", "1.5", "1.5"},
            {"1", "1.5", "1.5dd"}
    };

    public static void main(String[] args) {
//        System.out.println(sum2d(arr));
        System.out.println(sum2dV2(arr));
    }

    public static double sum2d(String[][] arr) throws ArrayIndexOutOfBoundsException{
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length != arr.length) throw new MyArraySizeException();
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count += Double.parseDouble(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new  MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }

    public static double sum2dV2(String[][] arr) throws ArrayIndexOutOfBoundsException{
        double count = 0;
        Map<Point2DD, String> cache = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length != arr.length) throw new MyArraySizeException();
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count += Double.parseDouble(arr[i][j]);
                } catch (NumberFormatException e) {
                    cache.put(new Point2DD(i, j), arr[i][j]);
                }
            }
        }
        if (!cache.isEmpty()) throw new MyArrayDataException(cache);
        return count;
    }
}