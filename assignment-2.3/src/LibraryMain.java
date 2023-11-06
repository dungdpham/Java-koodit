public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.findBooksByAuthor("Jane Doe");

        book1.setRating(5);
        book2.setRating(4);
        book3.setRating(2);

        System.out.printf("\nAverage rating of all books: %.2f\n", library.getAverageBookRating());

        book1.addReview("Nice book!");
        book2.addReview("Just so so.");
        book2.addReview("Best one so far!");
        book2.addReview("Maybe the worst!");
        book3.addReview("Too fictional!");
        book3.addReview("Nothing to say...");

        System.out.println("\nMost reviewed book: \"" + library.getMostReviewedBook().getTitle() + "\"");

        User user1 = new User("Bruce", 21);
        User user2 = new User("Clark", 30);

        library.addUser(user1);
        library.addUser(user2);

        library.borrowBook("The Art of Fiction", user1);

        System.out.println("\n" + user1.getName() + " borrows " + user1.getBorrowedBooks().get(0).getTitle());

        System.out.println("\nIs \"" + book3.getTitle() + "\" available? " + library.isBookAvailable(book3.getTitle()));

        library.borrowBook(book3.getTitle(), user2);

        library.displayUserData();

        library.returnBook(book3, user1);
        library.returnBook(book1, user2);

        System.out.println("\nIs \"" + book3.getTitle() + "\" available? " + library.isBookAvailable(book3.getTitle()));
    }
}
