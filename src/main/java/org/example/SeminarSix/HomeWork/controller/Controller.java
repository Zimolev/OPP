package org.example.SeminarSix.HomeWork.controller;

import org.example.SeminarSix.HomeWork.model.Contact;
import org.example.SeminarSix.HomeWork.model.FileType;
import org.example.SeminarSix.HomeWork.servise.ContactService;
import org.example.SeminarSix.HomeWork.servise.ImportExportContact;
import org.example.SeminarSix.HomeWork.servise.ImportExportService;
import org.example.SeminarSix.HomeWork.view.ContactView;

import java.io.File;
import java.util.List;

public class Controller {
    private final ContactService contactService = new ContactService();
    private final ContactView contactView = new ContactView();
    private final ImportExportService importContacts = new ImportExportContact();

    public void createContact(String name, String number, FileType fileType) {
        contactService.create(name, number, fileType);
    }
    public void getContacts() {
        List<Contact> bookContacts = contactService.read();
        for (Contact contact : bookContacts) contactView.printConsole(contact);
    }
    public void importContacts(File fileName) {
        importContacts.importContacts(fileName);
    }

    public void exportContact(FileType fileType){
        List<Contact> bookContacts = contactService.read();
        importContacts.exportContacts(fileType, bookContacts);
    }
}
