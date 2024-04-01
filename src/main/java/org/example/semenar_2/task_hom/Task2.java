package org.example.semenar_2.task_hom;

import java.util.Arrays;

public class Task2 {
    class Expr {

        public static double expr(int[] intArray, int d) {
            double result = 0;

            try {
                double divisible = intArray[8];
                int isZero = intArray[8] / d;
                result = divisible / d;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("It's not possible to evaluate the expression - intArray[8] / d " +
                        "as there is no 8th element in the given array.");
                return Double.NaN;
            } catch (ArithmeticException e){
                System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
                return Double.NaN;
            }
            String s = String.format("intArray[8] / d = %d / %d = ", intArray[8], d);
            System.out.println(s + result);
            return result;
        }
    }

    public static void main(String[] args) {
        int[] intArray;
        int d;

        if (args.length == 0) {
            intArray = new int[]{0, 1, 2, 3, 4};
            d = 0; // По умолчанию используем 0, если аргумент не передан
        } else {
            intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
            d = Integer.parseInt(args[1]); // Можно использовать значение по умолчанию или передать его как аргумент.
        }

        double result = Expr.expr(intArray, d);
        System.out.println(result);
    }
}
