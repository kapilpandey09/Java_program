// Sum and Product of Numbers

import java.util.Scanner;


public class Program3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of input ");
        int n  = sc.nextInt(); 

        int sum =0;
        int prod = 1;

        for(int i=0; i<n; i++){

            System.out.println("Enter Number :");
            int a  = sc.nextInt();
            sum += a;
            prod *= a;
        }

        System.out.println("Sum is a : "+ sum);
        System.out.println("product is a : "+ prod);
    }
}
