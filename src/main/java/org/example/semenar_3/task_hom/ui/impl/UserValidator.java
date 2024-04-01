package org.example.semenar_3.task_hom.ui.impl;

import org.example.semenar_3.task_hom.exceptions.MyIOException;
import org.example.semenar_3.task_hom.exceptions.MyIllegalFormatDate;
import org.example.semenar_3.task_hom.exceptions.MyNumberFormatException;
import org.example.semenar_3.task_hom.ui.ConsoleManager;
import org.example.semenar_3.task_hom.ui.User;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.lang.System.*;

public class UserValidator implements ConsoleManager {
    private static final String ERROR_NUMBER_PHONE;
    private static final String DATA_INPUT;
    private static final Scanner scanner;

    static {
        ERROR_NUMBER_PHONE = "Неверный формат данных для телефона должно быть целое беззнаковое число без форматирования";
        DATA_INPUT = "Введите данные пользователя через пробел в формате ->\n" +
                "\tФамилия Имя Отчество дата_рождения номер_телефона пол";
        scanner = new Scanner(in);
    }

    @Override
    public User promptInput() throws MyIOException, MyIllegalFormatDate, MyNumberFormatException {
        out.println(DATA_INPUT);
        String[] userData = scanner.nextLine().split(" ");
        int lengthUserData = userData.length;
        if (lengthUserData != 6) throw new MyIOException(lengthUserData); // Исключение ввода-вывода
        String lastName = userData[0];
        String name = userData[1];
        String patronymic = userData[2];
        LocalDate birthDate = getDate(userData[3]);
        long phone = getPhone(userData[4]);
        char gender = getIdentityGender(userData[5]);
        return new User(lastName, name, patronymic, birthDate, phone, gender);
    }

    private char getIdentityGender(String gender) throws MyIOException {
        if (gender.length() != 1) throw new MyIOException(gender);
        if (gender.charAt(0) != 'm' && gender.charAt(0) != 'f') throw new MyIOException(gender);
        return gender.charAt(0);
    }

    private long getPhone(String strPhone) throws MyNumberFormatException{
        try {
            long phone = Long.parseLong(strPhone);
            if (phone < 0) throw new MyNumberFormatException(ERROR_NUMBER_PHONE);
            return phone;
        } catch (NumberFormatException e) {
            throw new MyNumberFormatException(ERROR_NUMBER_PHONE);
        }
    }

    private LocalDate getDate(String userDatum) throws MyIllegalFormatDate{
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            return LocalDate.parse(userDatum, formatter);
        } catch (Exception e) {
            throw new MyIllegalFormatDate("dd.mm.yyyy");
        }
    }

    public String prompt(String message) {
        out.print(message);
        return scanner.nextLine();
    }
}