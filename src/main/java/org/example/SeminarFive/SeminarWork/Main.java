package org.example.SeminarFive.SeminarWork;

import org.example.SeminarFive.SeminarWork.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createdStudent("Олег", "Зминик", "09-04-1976");
        controller.getAllStudents();
    }
}
