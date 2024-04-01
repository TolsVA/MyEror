package org.example.semenar_3.task_hom.view.impl;

import org.example.semenar_3.task_hom.ui.command.Apply;
import org.example.semenar_3.task_hom.ui.command.Commands;
import org.example.semenar_3.task_hom.view.Printable;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class View implements Printable {
    private List<Commands> commands;

    public void run(List<Commands> commands) {
        this.commands = commands;
        Commands com;
        while (true) {
            String command = Commands.prompt("Введите команду: ").toUpperCase();
            while (!isContains(command)) {
                print("Такой команды нет!!!\nСписок команд: -> " + printClassName(this.commands) + "\n");
                command = Commands.prompt("Введите команду: ").toUpperCase();
            }
            com = getCommands(command);
            if (com != null) {
                if (com.getClass().getSimpleName().equalsIgnoreCase("EXIT")) return;
                if (com instanceof Apply c) c.apply();
            }
        }
    }

    private List<String> printClassName(List<Commands> commands) {
        List<String> list = new ArrayList<>();
        for (Commands command : commands) {
            list.add(String.format(
                    "%s (%s)",
                    command.getClass().getSimpleName().toUpperCase(),
                    command.getTranslation())
            );
        }
        return list;
    }

    private Commands getCommands(String strCommand) {
        for (Commands value : commands) {
            if (strCommand.equals(value.getClass().getSimpleName().toUpperCase())) {
                return value;
            }
        }
        return null;
    }

    @Override
    public void print(String message) {
        out.println(message);
    }

    private boolean isContains(String command) {
        for (Commands value : commands) {
            if (command.equals(value.getClass().getSimpleName().toUpperCase())) {
                return true;
            }
        }
        return false;
    }
}