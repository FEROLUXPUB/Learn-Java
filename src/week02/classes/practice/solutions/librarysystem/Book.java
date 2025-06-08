package week02.classes.practice.solutions.librarysystem;

public class Book {

    private String title;
    String bookId;
    boolean isBorrowed = false;

    public Book(String title, String bookId) {
        this.title = title;
        this.bookId = bookId;
    }
}
