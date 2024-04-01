package org.example.semenar_2.task_hom;

public class Task3 {
    class Expr {

        public static double expr(int a, int b) {
            printSum(a, b);
            if (b == 0) return 0;
            return (double) a / b;
        }

        public static void printSum(int a, int b) {
            System.out.println(a + b);
        }
    }

    public static void main(String[] args) {
        int a;
        int b;
        if (args.length == 0) {
            a = 90;
            b = 3; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }
        double result = Expr.expr(a, b);
        System.out.println(result);
    }
}
