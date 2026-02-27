//  Digit Separator 

import java.util.Scanner;

public class Program4 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a Size of digit of number");
    int n =  sc.nextInt();
    
    System.out.println("Enter a  number");
    int res = sc.nextInt();
    // int track = 0;
    // int n =  sc.nextInt();
    while(res>0){
        System.out.println((int)(res/Math.pow(10,n-1)));
        res = (int)(res % Math.pow(10,n-1));
        n-=1;
    }




 }
    
}
