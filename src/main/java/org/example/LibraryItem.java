package org.example;

public class LibraryItem {
    protected String title;
    public String author;
    public int year;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
//    public void setTitle(String title) {
//        this.title = title;
//    }

    public String getAuthor() {
        return author;
    }
//    public void setAuthor(String author) {
//        this.author = author;
//    }

    public int getYear() {
        return year;
    }
//    public void setYear(int year) {
//        this.year = year;
//    }

    public String toString() {
        return "Library Item:" + "\nTitle: " + title + "\nAuthor: " + author + "\nYear: " + year;
    }

}
