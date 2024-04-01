package org.example.semenar_3.task_hom.ui.command;

import org.example.semenar_3.task_hom.ui.Presenter;

public abstract class Commands {
    protected static Presenter presenter;
    protected String translation;
    public static String prompt(String message){
        return presenter.prompt(message);
    }
    public static void setPresenter(Presenter presenter) {
        Commands.presenter = presenter;
    }

    public String getTranslation() {
        return translation;
    }
}