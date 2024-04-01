package org.example.semenar_2.task_hom;

public class Task4 {
    class Expr {
        public static String expr(char a) throws Exception {
            if(a == ' ') throw new Exception("Empty string has been input.");
            return "Your input was - " + a;
        }
    }

    public static void main(String[] args) {
        char a;

        if (args.length == 0) {
            a = ' '; // Значение по умолчанию, если аргументы не были предоставлены
        } else {
            a = args[0].charAt(0); // Преобразуйте первый аргумент командной строки в символ
        }

        try {
            String result = Expr.expr(a);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
