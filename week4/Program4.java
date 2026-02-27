// Problem 4: Sales Commission Calculator 
// Scenario: 
// You need to develop a module for a sales management application that calculates 
// the commission based on sales figures. The commission rates are as follows:
//  Under 500: 2% of sales 
// ● Between 500 and 5000: 5% of sales 
// ● 5000 and above: 8% of sales 

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int user = sc.nextInt();

        if (user<0){
            System.out.println("Invlid input");

        }else if(user < 500){
            double a = (user * 2.0)/100;
            System.out.println("Answer is : " + a);

        }else if (500<= user || 5000>=user){
            
            double a = (user * 5.0)/100;
            System.out.println("Answer is : " + a);
        }else{
            
            double a = (user * 8.0)/100;
            System.out.println("Answer is : " + a);
        }

    }
}
