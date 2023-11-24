import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("What is this?", "AAA", "992-231");
        Book book2 = new Book("I've got no clue!", "BBB", "145-223");

        LibraryMember member1 = new LibraryMember("Xavier");
        LibraryMember member2 = new LibraryMember("Magneto");

        library.addBook(book1); library.addBook(book2);
        library.addMember(member1); library.addMember(member2);

        library.borrowBook(member1, book1);
        System.out.println(member1);

        library.borrowBook(member2, book2);
        library.returnBook(member1, book1);
        library.borrowBook(member2, book1);
        System.out.println(member1);
        System.out.println(member2);
        library.returnBook(member2, book2);
        library.returnBook(member2, book1);

        System.out.println();
        library.reserveBook(member1, book2);
        library.reserveBook(member1, book1);

        library.cancelReservation(member1, book2);
        library.reserveBook(member2, book2);

        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);
    }
}
