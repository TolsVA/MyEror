package org.example.semenar_2.task_1;

public class Task2 {
    public static void main(String[] args) {
        String[][] str = new String[][]{
                {"1", "1", "12"},
                {"1", "13", "1", "1", "1"},
                {"1", "7"},
                {"e"},
                {"2", "6"}
        };
        System.out.println(sum2d(str));
    }
    private static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (isInteger(arr[i][j])){
                    sum += Integer.parseInt(arr[i][j]);
                } else {
                    throw new NumberFormatException("Невалидные данные");
                }
//                try {
//                    int val = Integer.parseInt(arr[i][j]);
//                    sum += val;
//
//                } catch (NumberFormatException e){
//                    String simpleName = e.getClass().getSimpleName();
////                    System.err.println("Невалидные данные ошибка: " + simpleName);
//                    throw new NumberFormatException("Невалидные данные ошибка: " + simpleName);
//                }
            }
        }
        return sum;
    }

    private static boolean isInteger(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
