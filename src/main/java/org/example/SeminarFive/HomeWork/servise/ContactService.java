package org.example.SeminarFive.HomeWork.servise;

import org.example.SeminarFive.HomeWork.model.Contact;
import org.example.SeminarFive.HomeWork.model.FileType;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ContactService implements DataService{
    private List<Contact> contactList = new ArrayList<>();


    @Override
    public void create(String name, String number) {
        int id = getId();
        Contact contact = new Contact(id, name, number);
        contactList.add(contact);
    }

    private int getId() {
        int lastId = 0;
        for (Contact contact : contactList) lastId++;
        return ++lastId;
    }

    public void exportContacts(FileType type, List<Contact> contactList) {
        StringBuilder sb = new StringBuilder();
        for (Contact contact : contactList) {
            sb.append(contact.getId());
            sb.append(',');
            sb.append(contact.getName());
            sb.append(',');
            sb.append(contact.getNumber());
            sb.append('\n');
        }
        File file;
        if (type == FileType.CSV) {
            file = new File("Contacts.csv");
        }
        else {
            file = new File("Contacts.txt");
        }
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void importContacts(File file) {
        try (BufferedReader fis = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = fis.readLine()) != null) {
                String[] dataContact = line.split(",");
                String name = dataContact[1];
                String number = dataContact[2];
                System.out.println(name + number);
                create(name, number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Contact> read() {
        return contactList;
    }
}
