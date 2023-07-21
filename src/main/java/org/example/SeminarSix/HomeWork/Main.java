package org.example.SeminarSix.HomeWork;



import org.example.SeminarSix.HomeWork.controller.Controller;
import org.example.SeminarSix.HomeWork.model.FileType;


import java.io.File;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createContact("ZZZ", "123456", FileType.CSV);
        controller.exportContact(FileType.CSV);
        controller.importContacts(new File("Contacts.csv"));
        controller.getContacts();


    }
}
