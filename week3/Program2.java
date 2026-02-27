// You need to develop a module that accepts three digits and prints all possible 
// combinations of these digits for a lottery system.
import java.util.Scanner;
// import java.utlis.Scanner;


public class Program2 {
    public static void Permutation(String str, String current) {
        if (str.length()==0){
            System.out.println(current);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String remaining = str.substring(0,i) + str.substring(i+1);
            Permutation(remaining, current + ch);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sequence string or number: ");
        String str = sc.nextLine(); 

        Permutation(str, "");


        
    }


    
}
