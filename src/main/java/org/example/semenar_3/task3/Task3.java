package org.example.semenar_3.task3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(divide(9, 2));
        try {
            fileNotFaund("1.txt");
        } catch (NonExistedFileException e) {
            e.printStackTrace();
        }

    }
    private static double divide(int a, int b) {
//        if (b == 0) throw  new DivideByZeroException();
        double result = 0.0;
        try {
            result = (double) a / b;
        } catch (ArithmeticException e){
            throw  new DivideByZeroException();
        }
        return result;
    }
    private static void fileNotFaund(String path) throws NonExistedFileException {
        try {
            FileReader fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new  NonExistedFileException();
        }
    }
}
