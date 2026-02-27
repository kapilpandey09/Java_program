
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args){
        System.out.println("Enter a number5");
        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();
        float sum =0;
        for(int i=1; i<=sz; i++){
            sum = sum + (1.0f/i);

        }
        System.out.println("Sum is  : "+ sum );
    }
}
