package org.example.semenar_3.task4;

import java.util.Map;

public class MyArrayDataException extends IllegalArgumentException {
    public MyArrayDataException(int i, int j) {
        super(String.format(" В ячейке [%d] [%d] не число",i , j));
    }


    public MyArrayDataException(Map<Point2DD, String> cache) {
        super(cache.toString());
    }
}
