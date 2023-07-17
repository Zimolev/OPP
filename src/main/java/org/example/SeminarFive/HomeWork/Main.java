package org.example.SeminarFive.HomeWork;



import org.example.SeminarFive.HomeWork.controller.Controller;
import org.example.SeminarFive.HomeWork.model.FileType;
import org.example.SeminarFive.HomeWork.servise.ContactService;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createContact("QQQ", "123456");
        controller.importContacts(new File("Contacts.csv"));
        controller.exportContact(FileType.CSV);
        controller.getContacts();


    }
}
