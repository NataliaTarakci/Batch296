package practices.practice06.online_library_system;

import java.util.*;

public class LibrarySystem {


    // Step 1: Use a HashMap to store books with their titles as keys and Book objects as value
    private Map<String, Book> books = new HashMap<>();

    // Step 2: Use a HashSet to store unique user IDs
    private Set<String> registeredUsers = new HashSet<>();

    // Step 3: Use a LinkedList to manage users waiting to borrow a specific book
    private Queue<String> waitingList = new LinkedList<>();


    // Step 4: Initialize the library with some books (constructor)
    public LibrarySystem(){
        books.put("1984", new Book("1984", "George Orwell", BookGenre.FICTION, true));
        books.put("A Brief of History of Time", new Book("A Brief of History of Time", "Stephen Hawking", BookGenre.SCIENCE, true));
        books.put("Sapiens", new Book("Sapiens", "Yuval Noah Harari", BookGenre.HISTORY, true));
        books.put("To Kill a Mockingbird", new Book("To Kill a Mockingbird", "Harper Lee", BookGenre.FICTION, true));
        books.put("The Great Gatsby", new Book("The Great Gatsby", "F. Scott Fitzgerald", BookGenre.FICTION, true));
        books.put("Pride and Prejudice", new Book("Pride and Prejudice", "Jane Austen", BookGenre.FICTION, true));
        books.put("The Catcher in the Rye", new Book("The Catcher in the Rye", "J.D. Salinger", BookGenre.FICTION, true));
    }

    // Step 5: Method to register a new user
    public void registerUser(String userID){
        // Add the user ID to the HashSet
        if (registeredUsers.add(userID)){
            System.out.println("User " + userID + " successfully registered.");
        }else {
            System.out.println("User " + userID + " is already registered.");
        }
    }

    // Step 6: Method for a user to borrow a book
    public void borrowBook(String userId, String bookTitle) throws UserNotRegisteredException, BookNotFoundException {
        // Check If the user is registered
        if (!registeredUsers.contains(userId)) {
            throw new UserNotRegisteredException("User is not registered");
        }

        // Check if the book exists in the Library
        Book book = books.get(bookTitle);
        if (book == null) {
            throw new BookNotFoundException("Book not found in the library.");
        }

        // Check if the book is available
        if (book.isAvailable()) {
            book.setAvailable((false));
            System.out.println(userId + " borrowed " + bookTitle);
        } else {
            // If the book is not available, add the user to the waiting list
            waitingList.add(userId);
            System.out.println(bookTitle + " is currently unavailable. " + userId + " is added to the waiting list");
        }
    }

    //Step 7: Create custom exception
    class BookNotFoundException extends Exception{
        public BookNotFoundException(String message){
            super(message);
        }
    }

    class UserNotRegisteredException extends Exception {
        public UserNotRegisteredException (String message){
            super(message);
        }
    }

    //Step 8: Method to return a borrowed book
    public void returnBook(String userId, String bookTitle) {
        Book book = books.get(bookTitle);
        if (book != null && !book.isAvailable()) {
            // a) Update the book status to available
            book.setAvailable(true);
            System.out.println(userId + " returned " + bookTitle);

            // b) Notify the next user in the waiting list
            if (!waitingList.isEmpty()) {
                String nextUser = waitingList.poll();
                System.out.println("Notifying " + nextUser + " that " + bookTitle + " is now available");
            }
        }else {
            System.out.println(bookTitle + " was not borrowed or does not exist");
        }
    }

    //Step 9: Method to list all available books in a specific genre

    //HOMEWORK

    public void listBooksByGenre(BookGenre genre){
        System.out.println("List of available books in "+genre+" genre:");
        for (Map.Entry<String, Book> w : books.entrySet()){
            Book book = w.getValue();
            if (book.getGenre()==genre && book.isAvailable()){
                System.out.println("Title: "+book.getTitle()+" by "+book.getAuthor());
            }
        }
    }

//    public void listBooksByGenre(BookGenre genre) {
//        System.out.println("Available books in " + genre + " genre:");
//        for (Map.Entry<String, Book> entry : books.entrySet()) {
//            Book book = entry.getValue();
//            if (book.getGenre() == genre && book.isAvailable()) {
//                System.out.println("Title: " + book.getTitle() + " by " + book.getAuthor());
//            }
//        }
//    }


}
