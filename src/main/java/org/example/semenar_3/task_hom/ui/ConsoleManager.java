package org.example.semenar_3.task_hom.ui;

import org.example.semenar_3.task_hom.exceptions.MyNumberFormatException;
import java.io.IOException;

public interface ConsoleManager {
    User promptInput() throws IOException, MyNumberFormatException;
    String prompt(String message);
}