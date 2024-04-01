package org.example.semenar_2.task_1;

import java.io.*;

public class Task4 {

    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "fdsa"};
            String str = strings[1];
            test();
            int a = 1/0;
            inputStream = new FileInputStream("asdfghjk");
        } catch (StackOverflowError error) {
            System.out.println("stack overflow error");
        } catch (Throwable e){
            e.printStackTrace();
        } finally {
            System.out.println("Я всёравно выполнюсь");
        }
        System.out.println("Я жив");
    }

    private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}
