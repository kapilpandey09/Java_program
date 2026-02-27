// Scenario: Library Management System 
// You are tasked with developing a Java application for a library management 
// system. The system should manage books, users, and the catalog, allowing users to 
// borrow and return books.

public class Book{
    private int Book_id;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailability;
    
    public Book(int Book_id, String title, String author, String genre, boolean  isAvailability){
        this.Book_id = Book_id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailability = isAvailability;
    }

    // Getter

    public int getBook_id(){
        return Book_id; 
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public boolean getAvailability(){
        return isAvailability;
    }

    // Setter

    public void setBook_id(int book_id){
        this.Book_id = book_id; 
    }

    public void setAuthor(String Author){
        this.author = Author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setAvailability(boolean isAvailability){
        this.isAvailability = isAvailability;
    }

    public void display(){
        System.out.println("Book Id: "+ this.Book_id);
        System.out.println("Title : "+ this.title);
        System.out.println("Author: "+ this.author);
        System.out.println("Genre: "+ this.genre);
        System.out.println("isAbvailability: "+ this.isAvailability);
        
    }



}