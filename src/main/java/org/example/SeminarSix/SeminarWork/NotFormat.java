package org.example.SeminarSix.SeminarWork;

import java.util.List;

public class NotFormat implements Formatter{
    @Override
    public void format(List<Book> books) {
        for (Book book : books) {
            System.out.println(book.getName() + " - эта книга переведана в формат: " + Format.NOFORMAT);
        }
    }
}
