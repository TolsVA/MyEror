package org.example.semenar_3.task_hom.bd;

import org.example.semenar_3.task_hom.ui.User;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Database {
    public void writeDown(List<User> userList) throws IOException {
        for (User user : userList) {
            try (FileWriter fw = new FileWriter(user.getLastName() + ".txt", true)){
                fw.write(user + "\n");
                fw.flush();
            }
        }
    }
}