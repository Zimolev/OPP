package org.example.SeminarSix.SeminarWork;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable{

    List<Book> books = new ArrayList<>();

    @Override
    public List<Book> authorSearch(String authorName) {
        List<Book> foundAuthors = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(authorName)){
                foundAuthors.add(book);
            }
        }
        return foundAuthors;
    }
    public Library(List<Book> books) {
        this.books = books;
    }

    public Library() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
