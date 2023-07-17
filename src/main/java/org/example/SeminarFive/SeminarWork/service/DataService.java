package org.example.SeminarFive.SeminarWork.service;

import org.example.SeminarFive.SeminarWork.model.Type;
import org.example.SeminarFive.SeminarWork.model.User;

import java.util.List;

public interface DataService {
    void create(String name, String surname, String dateBirth, Type type);

    List<User> read();

    List<User> readOnlyStudent();
}
