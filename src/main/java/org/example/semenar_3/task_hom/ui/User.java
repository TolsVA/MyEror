package org.example.semenar_3.task_hom.ui;

import java.time.LocalDate;

public class User {
     private final String lastName;
     private final String name;
     private final String patronymic;
     private final LocalDate birthDate;
     private final long phone;
     private final char gender;

     public User(String lastName, String name, String patronymic, LocalDate birthDate, long phone, char gender) {
          this.lastName = lastName;
          this.name = name;
          this.patronymic = patronymic;
          this.birthDate = birthDate;
          this.phone = phone;
          this.gender = gender;
     }

     public String getLastName() {
          return lastName;
     }

     private String getFormatDate(){
          return String.format("%s.%s.%s", birthDate.getDayOfMonth(), birthDate.getMonthValue(), birthDate.getYear());
     }

     @Override
     public String toString() {
          return String.format("<%s><%s><%s><%s><%s><%s>", lastName, name, patronymic, getFormatDate(), phone, gender);
     }
}