import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user){
        users.add(user);
    }

    public void displayBooks() {
        System.out.println("\nLibrary Catalog:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println((i + 1) + ". Title: \"" + book.getTitle() + "\", Author: \"" + book.getAuthor() + "\"," +
                    " Year: " + book.getPublicationYear());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by Author \"" + author + "\":");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: \"" + book.getTitle() + "\", Year: " + book.getPublicationYear());
            }
        }
    }

    public void borrowBook(String title, User user) {
        if (!isBookAvailable(title)) {
            System.out.println("\n\"" + title + "\" is not available.");
        } else {
            Book toBorrow = null;
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    toBorrow = book;
                }
            }
            books.remove(toBorrow);
            borrowedBooks.add(toBorrow);
            user.borrowBook(toBorrow);
        }
    }

    public void returnBook(Book book, User user) {
        if (borrowedBooks.contains(book) && user.getBorrowedBooks().contains(book)) {
            user.returnBook(book);
            borrowedBooks.remove(book);
            books.add(book);
        } else if (books.contains(book)) {
            System.out.println("\n\"" + book.getTitle() + "\" is not currently borrowed.");
        } else {
            System.out.println("\n\"" + book.getTitle() + "\" is not in the library's catalog.");
        }
    }

    public boolean isBookAvailable(String title) {
        boolean available = false;

        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                available = true;
            }
        }

        return available;
    }

    public double getAverageBookRating() {
        double sumRating = 0.0;

        for (Book book : books) {
            sumRating += book.getRating();
        }

        for (Book book : borrowedBooks) {
            sumRating += book.getRating();
        }

        return sumRating / (books.size() + borrowedBooks.size());
    }

    public Book getMostReviewedBook() {
        Book mostReviewedBook = books.get(0);
        int maxReviews = mostReviewedBook.getReviews().size();

        for (Book book : books) {
            if (book.getReviews().size() > maxReviews) {
                maxReviews = book.getReviews().size();
                mostReviewedBook = book;
            }
        }

        for (Book book : borrowedBooks) {
            if (book.getReviews().size() > maxReviews) {
                maxReviews = book.getReviews().size();
                mostReviewedBook = book;
            }
        }

        return mostReviewedBook;
    }

    public void displayUserData() {
        System.out.println("\nUser records:");
        if (users.isEmpty()) {
            System.out.println("No record found!");
        } else {
            for (User user : users) {
                System.out.println("\nName: " + user.getName() + ", Age: " + user.getAge());
                if (user.getBorrowedBooks().isEmpty()) {
                    System.out.println("No borrowed book!");
                } else {
                    System.out.println("Borrowed books:");
                    for (Book book : user.getBorrowedBooks()) {
                        System.out.println(book.getTitle());
                    }
                }
            }
        }
    }
}
