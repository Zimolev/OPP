package org.example.SeminarFive.SeminarWork.service;

import org.example.SeminarFive.SeminarWork.model.Student;
import org.example.SeminarFive.SeminarWork.model.Teacher;
import org.example.SeminarFive.SeminarWork.model.Type;
import org.example.SeminarFive.SeminarWork.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {

    private List<User> userList = new ArrayList<>();

    @Override
    public void create(String name, String surname, String dateBirth, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            Student student = new Student(name, surname, dateBirth, id);
            userList.add(student);
        }
        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(name, surname, dateBirth, id);
            userList.add(teacher);
        }
    }

    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (user instanceof Teacher && !isStudent) {
                lastId++;
            }
            if (user instanceof Student && isStudent) {
                lastId++;
            }
        }
        return ++lastId;
    }

    @Override
    public List<User> read() {
        return userList;
    }

    @Override
    public List<User> readOnlyStudent() {
        List<User> students = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student){
                students.add(user);
            }
        }
        return students;
    }
}
