package org.example.semenar_3.task_hom.ui.command;

public class Record extends Commands implements Apply {
    public Record() {
        translation = "Записать контакты";
    }

    @Override
    public void apply() {
        presenter.writeDown();
    }
}
