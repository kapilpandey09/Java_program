// Problem 1: Odd and Even Counter 
// Scenario: 
// You are working on a module for a school project that counts the number of odd 
// and even numbers entered by students during a math quiz. 
// Test Cases: 
// 1. Input: 1, 2, 3, 4, 5 
// Output: 
// Odd count: 3 
// Even count: 2
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        // Odd and Even
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of input: ");

        int sz = sc.nextInt();
        int od = 0; 
        int ev = 0;
        for(int i=1; i<=sz; i++){
            int num = sc.nextInt();
            if( num%2==0){
                ev+=1;
            }else{
                od+=1;
            }
        }

        System.out.println("Even Count :"+ ev);

        System.out.println("Odd Count :"+ od);
    }
    
}
