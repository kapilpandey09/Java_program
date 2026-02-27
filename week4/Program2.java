
import java.util.Scanner;

// You need to develop a module for a geometry application that calculates the area 
// and perimeter of a circle. Additionally, the module should check if a given point is 
// inside the circle. 

public class Program2 {

    public double  area(double  r){
        double a = 3.14 * (Math.pow(r, 2));
        return a;
    }

    public double  parameter(int r){
        double a = 2* 3.14 * r;
        return a;
    }
    
    public void   check(int cx , int cy, int x, int y , int r ){
        if (cx==x && cy==y){
            System.out.println("Point is on the circle");
        }else if (Math.pow(r,2) > Math.pow((x-cx),2) + Math.pow((y-cy),2)){

            System.out.println("Point is  inside");

        }else if (Math.pow(r,2) == Math.pow((x-cx),2) + Math.pow((y-cy),2)){
            System.out.println("Point  is on the circle");
        } else {
            System.out.println("Point is Outside");
        }
 
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a value of center x axis: ");
        int cx = sc.nextInt();

        System.out.println("Enter a value of center y axis: ");
        int cy = sc.nextInt();

        System.out.println("Enter a  value x axis: ");
        int x = sc.nextInt();

        System.out.println("Enter a  value y axis: ");
        int y = sc.nextInt();

        System.out.println("Enter a value of radius: ");
        int r = sc.nextInt();
        
        Program2 obj = new Program2();

        System.out.println("area is : " + obj.area(r));
        System.out.println("area is : " + obj.parameter(r));  
        obj.check(cx, cy, x, y, r);


    }
}
