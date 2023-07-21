package org.example.SeminarSix.SeminarWork;

public class Book {
    private String name;
    private String author;
    private int pages;
    private BookGenre genre;

    public Book() {
    }

    public Book(String name, String author, int pages, BookGenre genre) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", genre=" + genre +
                '}';
    }
}
