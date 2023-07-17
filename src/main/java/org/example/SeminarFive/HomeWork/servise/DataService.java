package org.example.SeminarFive.HomeWork.servise;



import org.example.SeminarFive.HomeWork.model.Contact;
import org.example.SeminarFive.HomeWork.model.FileType;

import java.util.List;

public interface DataService {
    void create(String name, String number);

    List<Contact> read();

}
