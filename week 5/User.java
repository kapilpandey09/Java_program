import java.util.ArrayList;
import java.util.List;


public class User {

    private int user_id;
    private String name;
    private List<Book> borrowBooks;

    public User(int user_id, String name) {
        this.user_id = user_id;
        this.name = name;
        this.borrowBooks = new ArrayList<>();
    }

    public void Borrowed(Book book){
        this.borrowBooks.add(book);        
        
    }

    public  void  returnBorrow(Book book){
        this.borrowBooks.remove(book);
    }

    public void display_Borrow(){
        
        System.out.println(this.name+ " borrowed:");
        for(Book b: borrowBooks){
            System.out.println("_ " + b.getTitle());
        }
    }

    public void setID(int user_id){
        this.user_id = user_id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
}
