package org.example.semenar_3.task_hom.ui.command;

import org.example.semenar_3.task_hom.ui.Presentable;
import org.example.semenar_3.task_hom.ui.Presenter;

public abstract class Commands {
    protected static Presentable presenter;
    protected String translation;
    public static String prompt(String message){
        return presenter.prompt(message);
    }
    public static void setPresenter(Presentable presenter) {
        Commands.presenter = presenter;
    }

    public String getTranslation() {
        return translation;
    }
}