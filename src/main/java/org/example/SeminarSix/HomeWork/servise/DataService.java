package org.example.SeminarSix.HomeWork.servise;



import org.example.SeminarSix.HomeWork.model.Contact;
import org.example.SeminarSix.HomeWork.model.FileType;


import java.util.List;

public interface DataService {
    void create(String name, String number, FileType fileType);

    List<Contact> read();

}
