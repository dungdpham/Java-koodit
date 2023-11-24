package model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private static int count = 0;
    private String name;
    private int memberId;
    private List<Book> borrowedBooks;
    private List<Book> reservedBooks;

    public LibraryMember(String name) {
        this.name = name;
        count++;
        memberId = count;
        borrowedBooks = new ArrayList<>();
        reservedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }
}
