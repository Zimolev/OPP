package org.example.SeminarSix.SeminarWork;

public class ElectronBook extends Book{
   private String format;
   private Integer size;

    public ElectronBook() {
    }

    public ElectronBook(String format, Integer size) {
        this.format = format;
        this.size = size;
    }

    public ElectronBook(String name, String author, int pages, BookGenre genre, String format, Integer size) {
        super(name, author, pages, genre);
        this.format = format;
        this.size = size;
    }


    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
