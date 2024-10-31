package practices.practice06.online_library_system;

public class Book {

    private String title;
    private String author;
    private BookGenre genre;
    private boolean available;

    // Constructor for Book
    public Book(String title, String author, BookGenre genre, boolean available ){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available =  available;
    }

    // Getters and setters for book properties
    public String getTitle(){
        return title;
    }

    public  String getAuthor(){
        return author;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
