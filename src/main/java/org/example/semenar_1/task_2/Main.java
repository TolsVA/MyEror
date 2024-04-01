package org.example.semenar_1.task_2;

import java.util.Arrays;

class Answer {
    public int[] subArrays(int[] a, int[] b) {
        if (a.length != b.length) return new int[1];

        int[] result = new int[a.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[i] - b[i];
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{4, 5, 6};
            b = new int[]{1, 2, 3, 5};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
    }
}
