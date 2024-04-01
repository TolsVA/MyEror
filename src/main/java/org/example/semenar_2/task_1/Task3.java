package org.example.semenar_2.task_1;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    private static final List<String> strings = List.of(
            "Анна=4", "Елена=5", "Марина=6", "Палина=?", "Владимир=?", "Константин=?", "Иван=4");

    public static void main(String[] args) {
        String path = "task3.txt";
        writerToFile(path, strings);
        System.out.println(analise(path));
        reWriter(path);
    }

    private static void reWriter(String path){
        Map<String,Integer> map = analise(path);
//        List<String> list = map.keySet().stream().map(key -> String.format("%s=%d", key, map.get(key))).toList();
        List<String> list = map.entrySet().stream().map(entry -> entry.toString()).toList(); // entry это строка -> key=value
//        List<String> list = new ArrayList<>();
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            list.add(entry.toString());
//        }
        writerToFile(path, list);
    }

    private static Map<String, Integer> analise(String path) {
        BufferedReader br = null;
        Map<String, Integer> resultMap = new LinkedHashMap<>();
        int count = 1;
        try {
            br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null){
                String[] arr = line.split("=");
                String key = arr[0];
                String temp = arr[1];
                int value;
                if (temp.equals("?")){
                    value = key.length();
                } else {
                    value = Integer.parseInt(temp);
                }
                resultMap.put(key, value);
                count++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e){
            throw new NumberFormatException(String.format("%s : %s in number %d", LocalDateTime.now(), e.getMessage(), count));
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return resultMap;
    }

    private static void writerToFile(String path, List<String> list) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(path);
            for (String string : list) {
                fw.write(string + "\n");
            }
            fw.flush(); // Принудительная запись в файл
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
