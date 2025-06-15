package org.example;

public class Book extends LibraryItem{
    public int pageCount;

    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

//    public void setPageCount(int pageCount) {
//       this.pageCount = pageCount;
//    }
    @Override
    public String toString() {
        return super.toString() + "\nPage Count: " + pageCount;
        }

    public void readBook() {
    }
}
