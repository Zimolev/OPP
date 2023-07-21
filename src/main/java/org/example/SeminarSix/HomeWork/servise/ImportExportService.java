package org.example.SeminarSix.HomeWork.servise;

import org.example.SeminarSix.HomeWork.model.Contact;
import org.example.SeminarSix.HomeWork.model.FileType;

import java.io.File;
import java.util.List;

public interface ImportExportService {
    public void exportContacts(FileType type, List<Contact> contactList);
    public void importContacts(File file);
}
