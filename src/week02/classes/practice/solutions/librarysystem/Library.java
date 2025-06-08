package week02.classes.practice.solutions.librarysystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a Book class (with bookId, isBorrowed).
 * Design a Library class to manage books (add, borrow, return).
 * Hint: Use an ArrayList<Book>.
 */

public class Library {

    private final List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String bookId) {
        Book book = null;
        for (Book b : books) {
            if (b.bookId.equals(bookId)) {
                b.isBorrowed = true;
                return;
            }
        }
    }

    public void returnBook(String bookId) {
        for (Book b : books) {
            if (b.bookId.equals(bookId)) {
                b.isBorrowed = false;
                return;
            }
        }
    }
}
