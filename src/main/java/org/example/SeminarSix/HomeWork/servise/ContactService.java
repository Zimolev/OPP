package org.example.SeminarSix.HomeWork.servise;

import org.example.SeminarSix.HomeWork.model.Contact;
import org.example.SeminarSix.HomeWork.model.FileType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class ContactService implements DataService {
    private List<Contact> contactList = new ArrayList<>();


    @Override
    public void create(String name, String number, FileType fileType) {
        int id = getId(fileType);
        Contact contact = new Contact(id, name, number);
        contactList.add(contact);
    }

    private int getId(FileType fileType) {
        int count = 0;
        if (fileType == FileType.CSV) {
            try  {
                count = (int) Files.lines(Paths.get("Contacts.csv")).count();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            try  {
                count = (int) Files.lines(Paths.get("Contacts.txt")).count();
            }
             catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (count == 0){
        for (Contact contact : contactList) {
            count++;
        }
            ++count;
        }
        return count;
    }

    @Override
    public List<Contact> read() {
        return contactList;
    }
}
