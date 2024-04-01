package org.example.semenar_3.task3;

import java.io.FileNotFoundException;

/**
 * Задание 3.2
 * Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class NonExistedFileException extends FileNotFoundException {
    public NonExistedFileException() {
        super("Такого файла нет");
    }
}
