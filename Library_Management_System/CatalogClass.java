import java.util.*;
public class CatalogClass {
    private ArrayList<BookClass> collection;
    
    public CatalogClass(){
        collection= new ArrayList<>();
    }
    
    public void addBook(BookClass book){
        collection.add(book);
        System.out.println(book.getbookID()+" added Succesfully.");
    }

    public void displayBooks(){
        System.out.println("Available Books: ");
        for(int i=0;i<collection.size();i++){
            BookClass b=collection.get(i);
            if(b.getavailable()){
                System.out.println("BookID= "+b.getbookID());
                System.out.println("Yes, it is Available. ");
                System.out.println("Title= "+b.gettitle());
                System.out.println("Genre= "+b.getgenre());
                System.out.println("Author= "+b.getauthor());
            }
            }
        }

    public void updateBook(int bookID,boolean available){
        for(int i=0;i<collection.size();i++){
            BookClass b= collection.get(i);
            if(b.getbookID()==bookID){
               b.setavailable(available);
               System.out.println(bookID+ " updated Succesfully.");
               return;
            }
        }
          System.out.println("Book Not Found.");
        }
    
    public static void main(String[] args) {
        BookClass b1=new BookClass(101, "Java Basics", "John Doe", "Programming", true);
        BookClass b2= new BookClass(102, "Advanced Java", "Jane Smith", "Programming", true);
        BookClass b3= new BookClass(103, "Digital", "Dr. Sebha Masood", "Digital Electronics", true);
        BookClass b4= new BookClass(104, "E-commerce", "Dr. Faraz Masood", "Commerce", true);

        UserClass k1= new UserClass(105, "Kapil");
        UserClass p1= new UserClass(127, "prince");

        CatalogClass c1= new CatalogClass();
        
        c1.addBook(b1);
        c1.addBook(b2);
        c1.addBook(b3);
        c1.addBook(b4);
        System.out.println();
        c1.displayBooks();
        System.out.println();
        k1.borrowbook(103);
        k1.display();
        System.out.println();
        c1.updateBook(103, false);
        System.out.println();
        c1.displayBooks();
        System.out.println();  
        c1.addBook(b3);
        c1.updateBook(103, true);
        System.out.println();
        c1.displayBooks();



        
    }
}
