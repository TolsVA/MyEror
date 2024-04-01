package org.example.semenar_3.task_hom.exceptions;

import java.io.IOException;

public class MyIOException extends IOException {
    public MyIOException(int lengthUserData) {
        super("Неверное количество данных вы вели " + lengthUserData + " требуется 6");
    }

    public MyIOException(String gender) {
        super(String.format("Вы ввели %s должно быть f или m", gender));
    }
}
