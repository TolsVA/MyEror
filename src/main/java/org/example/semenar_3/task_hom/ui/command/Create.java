package org.example.semenar_3.task_hom.ui.command;

public class Create extends Commands implements Apply {
    public Create() {
        translation = "Создать контакт";
    }

    @Override
    public void apply() {
        presenter.createUser();
    }
}
