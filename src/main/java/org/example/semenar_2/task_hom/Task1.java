package org.example.semenar_2.task_hom;

import java.time.LocalDateTime;

public class Task1 {
    class IsFloat {
        public static float isFloat(String input) {
            try {
                float parseFloat = Float.parseFloat(input);
                return parseFloat;
            } catch (NumberFormatException e){
                System.out.println("Your input is not a float number. Please, try again.");
                return Float.NaN;
            }
        }
    }
    public static void main(String[] args) {

        String input;

        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            input = "3.14"; // По умолчанию используем "3.14", если аргумент не передан
        } else {
            input = args[0];
        }

        float result = IsFloat.isFloat(input);
        System.out.println(result);
    }
}
