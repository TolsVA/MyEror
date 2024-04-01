package org.example.semenar_3.task_hom.exceptions;

import java.io.IOException;

public class MyIllegalFormatDate extends IOException {
    public MyIllegalFormatDate(String s) {
        super("Неверный формат даты.\n\tформат должен быть " + s);
    }
}
