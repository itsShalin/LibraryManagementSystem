
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();


    public void addBook(Book book) {

        for (Book existingBook : books) {

            if (existingBook.getBookId().equalsIgnoreCase(book.getBookId())) {
                System.out.println("A book with this ID already exists!");
                return;
            }
        }

        books.add(book);
        System.out.println("Book added successfully!");
    }


    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            System.out.println(
                    book.getBookId() + " | " +
                            book.getTitle() + " | " +
                            book.getAuthor() + " | " +
                            (book.isAvailable() ? "Available" : "Borrowed")
            );
        }
    }

    public void removeBook(String bookId) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getBookId().equals(bookId)) {

                books.remove(i);
                System.out.println("Book removed successfully!");
                return;
            }
        }

        System.out.println("Book not found!");
    }

    public void searchBook(String bookId) {

        for (Book book : books) {

            if (book.getBookId().equals(bookId)) {

                System.out.println("Book found!");
                System.out.println("ID: " + book.getBookId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Status: " +
                        (book.isAvailable() ? "Available" : "Borrowed"));

                return;
            }
        }

        System.out.println("Book not found!");
    }
    public void borrowBook(String bookId, String username) {

        for (Book book : books) {

            if (book.getBookId().equals(bookId)) {

                if (book.isAvailable()) {

                    book.setAvailable(false);
                    book.setBorrowedBy(username);

                    System.out.println("Book borrowed successfully!");

                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                }

                return;
            }
        }

        System.out.println("Book not found!");
    }

    public void returnBook(String bookId, String username) {

        for (Book book : books) {

            if (book.getBookId().equals(bookId)) {

                if (!book.isAvailable()) {

                    if (book.getBorrowedBy().equalsIgnoreCase(username)) {

                        book.setAvailable(true);
                        book.setBorrowedBy(null);

                        System.out.println("Book returned successfully!");

                    } else {
                        System.out.println("You cannot return a book borrowed by another student.");
                    }

                } else {
                    System.out.println("This book was not borrowed.");
                }

                return;
            }
        }

        System.out.println("Book not found!");
    }


}
