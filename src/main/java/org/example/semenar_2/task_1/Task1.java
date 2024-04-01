package org.example.semenar_2.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс массива от 0 до 9 " +
                "в который хотите записать значение 1");

        while (!scanner.hasNextInt()){
            System.out.println("Можно вводить только цифры");
            scanner.next();
        }
        int index = scanner.nextInt();
        try {

            arr[index] = 1;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Указан индекс за пределами массива");

//        } catch (InputMismatchException e) {
//            System.out.println("Можно вводить только цифры");
        } finally {
            scanner.close();
        }
    }
}
