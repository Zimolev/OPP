package org.example.SeminarFive.HomeWork.controller;

import org.example.SeminarFive.HomeWork.model.Contact;
import org.example.SeminarFive.HomeWork.model.FileType;
import org.example.SeminarFive.HomeWork.servise.ContactService;
import org.example.SeminarFive.HomeWork.view.ContactView;

import java.io.File;
import java.util.List;

public class Controller {
    private final ContactService contactService = new ContactService();
    private final ContactView contactView = new ContactView();

    public void createContact(String name, String number) {
        contactService.create(name, number);
    }
    public void getContacts() {
        List<Contact> bookContacts = contactService.read();
        for (Contact contact : bookContacts) contactView.printConsole(contact);
    }
    public void importContacts(File fileName) {
        contactService.importContacts(fileName);
    }

    public void exportContact(FileType fileType){
        List<Contact> bookContacts = contactService.read();
        contactService.exportContacts(fileType, bookContacts);
    }
}
