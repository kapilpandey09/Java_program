// Math.abs, Math.sqrt, Math.pow, Math.sin, Math.cos
import java.util.Scanner;

public class Program5{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	Double num = sc.nextDouble();
	System.out.println("Math abs value is : " + Math.abs(num) );
	System.out.println("Math sqrt value is : " + Math.sqrt(Math.abs(num)) );
	System.out.println("Math power value is : " + Math.pow(num,2) );
	System.out.println("Math Sine value is : " + Math.sin(num) );
	System.out.println("Math cosine value is : " + Math.cos(num) );
	 
}	
}