import java.util.Scanner;
public class SecondW1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a First Number: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter a Second Number: ");
		double num2 = sc.nextDouble();
		
		double sum = num1+num2;
		System.out.println("Sum: " + sum);

		double difference = num1-num2;
		System.out.println("Difference: " + difference);

		double product = num1*num2;
		System.out.println("Product: " + product);

		if(num2!=0) {
			double quotient = num1/num2;
			System.out.println("Quotient: " + quotient);
		} else {
			System.out.println("Quotient is not defined!");
		}

		double minimum = Math.min(num1, num2);
		System.out.println("Minimum: " + minimum);

		double maximum = Math.max(num1, num2);
		System.out.println("Maximum: " + maximum);
	}
}
