package org.example.SeminarSix.SeminarWork;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        BookGenre bookGenre = new BookGenre("Фантастика");
        BookGenre bookGenre1 = new BookGenre("Комедия");

        Library library = new Library(Arrays.asList(
                new Book("Чужая сила", "Андрей Васильев", 500, bookGenre),
                new Book("Знаки ночи", "Андрей Васильев", 550, bookGenre),
                new Book("Тень света", "Андрей Васильев", 450, bookGenre),
                new Book("Час полнолуния", "Андрей Васильев", 600, bookGenre),
                new Book("Темное время", "Андрей Васильев", 350, bookGenre),
                new Book("Время и Меч", "Андрей Васильев", 800, bookGenre),
                new Book("Космобиолухи", "Громыко Ольга", 800, bookGenre1),
                new Book("Космоэколухи", "Громыко Ольга", 600, bookGenre1)
        ));


        System.out.println("library.authorSearch(\"Громыко Ольга\") = " + library.authorSearch("Громыко Ольга"));

        Formatter formatter = new JsonFormat();
        formatter.format(library.authorSearch("Громыко Ольга"));

    }
}
