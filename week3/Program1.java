// You are working on a module for a math tutorial application that calculates and 
// prints the first m Fibonacci numbers using a do...while loop.

import java.util.Scanner;
class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int valid = sc.nextInt();
        int count = 0;
        int a= 0;
        int b =1;
        do{
            int c = a+b;
            System.out.print(a + " ");
            a = b;
            b = c;
            count++;
        } while(valid>count);
        // System.out.print(a + " ");
        
        
        
    }
}