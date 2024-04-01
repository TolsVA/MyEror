package org.example.semenar_1.task_1;
class Answer {
    public static void arrayOutOfBoundsException() {
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void divisionByZero() {
        throw new ArithmeticException();

    }

    public static void numberFormatException() {
        throw new NumberFormatException();

    }
}

//Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
//Метод divisionByZero - Деление на 0
//Метод numberFormatException - Ошибка преобразования строки в число
//Важно: они не должны принимать никаких аргументов

public class Main {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}