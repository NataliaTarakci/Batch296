package practices.practice06.online_library_system;

public class LibraryRunner {

    public static void main(String[] args) throws LibrarySystem.UserNotRegisteredException, LibrarySystem.BookNotFoundException {
        //Step 1: Create an instance of the LibrarySystem
        LibrarySystem library = new LibrarySystem();

        //Step 2: Register a user
        library.registerUser("Boukadida");// User Boukadida successfully registered.
        library.registerUser("Shukrullah");// User Shukrullah successfully registered.

        //Step 3: Try borrowing a book
        library.borrowBook("Boukadida", "1984");// Boukadida borrowed 1984

        // put on the waiting list since Boukadida has already borrowed it
        library.borrowBook("Shukrullah", "1984");// 1984 is currently unavailable. Shukrullah is added to the waiting list

        // Step 4: Return the book and notify the next user in the queue
        library.returnBook("Boukadida", "1984");// Boukadida returned 1984 \n Notifying Shukrullah that 1984 is now available

        library.borrowBook("Shukrullah", "1984");// Shukrullah borrowed 1984
        library.returnBook("Shukrullah", "1984");// Shukrullah returned 1984

        library.registerUser("Boukadida");// User Boukadida is already registered.
        library.registerUser("Natalia");// User Natalia successfully registered.

        //library.borrowBook("Engin", "Sapiens");// LibrarySystem$UserNotRegisteredException: User is not registered
        //library.borrowBook("Natalia", "Animal Farm");// LibrarySystem$BookNotFoundException: Book not found in the library.

        library.returnBook("Shukrullah", "1984");// 1984 was not borrowed or does not exist
        library.returnBook("Shukrullah", "Animal Farm");// Animal Farm was not borrowed or does not exist




        //Step 5: List available books by genre (FICTION)

        // HOMEWORK //

        library.listBooksByGenre(BookGenre.FICTION);

    }

}
