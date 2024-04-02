package org.example.semenar_3.task_hom;

import org.example.semenar_3.task_hom.ui.Presentable;
import org.example.semenar_3.task_hom.ui.command.Commands;
import org.example.semenar_3.task_hom.ui.Presenter;
import org.example.semenar_3.task_hom.ui.command.Create;
import org.example.semenar_3.task_hom.ui.command.Exit;
import org.example.semenar_3.task_hom.ui.command.Record;
import org.example.semenar_3.task_hom.ui.impl.UserValidator;
import org.example.semenar_3.task_hom.view.impl.View;

import java.util.ArrayList;
import java.util.List;

public class App {
    private List<Commands> commands;
    private static App instance;

    private App() {
        View view = new View();
        Presentable presenter = new Presenter(view, new UserValidator());
        Commands.setPresenter(presenter);
        commands = initCommands();
        view.run(commands);
    }

    public static void run() {
        if (instance == null) {
            instance = new App();
        }
    }

    private List<Commands> initCommands() {
        commands = new ArrayList<>();
        commands.add(new Create());
        commands.add(new Record());
        commands.add(new Exit());
        return commands;
    }
}