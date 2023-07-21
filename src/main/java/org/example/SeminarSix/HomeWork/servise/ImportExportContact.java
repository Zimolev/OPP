package org.example.SeminarSix.HomeWork.servise;

import org.example.SeminarSix.HomeWork.model.Contact;
import org.example.SeminarSix.HomeWork.model.FileType;

import java.io.*;
import java.util.List;

public class ImportExportContact implements ImportExportService{
    @Override
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
            writer.append(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void importContacts(File file) {
        try (BufferedReader fis = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = fis.readLine()) != null) {
                String[] dataContact = line.split(",");
                String name = dataContact[1];
                String number = dataContact[2];
                System.out.println(name + number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
