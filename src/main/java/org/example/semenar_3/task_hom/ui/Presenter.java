package org.example.semenar_3.task_hom.ui;

import org.example.semenar_3.task_hom.bd.Database;
import org.example.semenar_3.task_hom.view.Printable;
import org.example.semenar_3.task_hom.view.impl.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;

public class Presenter {
    private final ConsoleManager cm;
    private final Printable view;
    private final List<User> userList;
    private final Database database;

    public Presenter(View view, ConsoleManager cm){
        this.view = view;
        this.cm = cm;
        userList = new ArrayList<>();
        database = new Database();
    }

    public User createUser(){
        try {
            User user = cm.promptInput();
            out.println(user);
            userList.add(user);
            return user;
        } catch (Exception e) {
            view.print(e.getMessage());
            return createUser();
        }
    }

    public String prompt(String message) {
        return cm.prompt(message);
    }

    public void writeDown() {
        try {
            database.writeDown(userList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}