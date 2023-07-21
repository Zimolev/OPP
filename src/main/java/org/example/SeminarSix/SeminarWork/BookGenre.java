package org.example.SeminarSix.SeminarWork;

public class BookGenre implements Genre{

    private String genre;

    public BookGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getGenreBook() {
        return this.genre;
    }

    @Override
    public String toString() {
        return "BookGenre{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
