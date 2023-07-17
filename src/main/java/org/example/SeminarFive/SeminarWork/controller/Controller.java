package org.example.SeminarFive.SeminarWork.controller;

import org.example.SeminarFive.SeminarWork.model.Student;
import org.example.SeminarFive.SeminarWork.model.Type;
import org.example.SeminarFive.SeminarWork.model.User;
import org.example.SeminarFive.SeminarWork.service.UserService;
import org.example.SeminarFive.SeminarWork.view.StudentView;

import java.util.List;

public class Controller {
    private final UserService service = new UserService();
    private final StudentView view = new StudentView();


    public void createdStudent(String name, String surname, String dateBirth){
        service.create(name, surname, dateBirth, Type.STUDENT);
    }
    public void getAllStudents(){
        List<User> studentsList = service.readOnlyStudent();
        for (User user : studentsList) {
            view.printConsole(((Student) user));
        }
    }
}
