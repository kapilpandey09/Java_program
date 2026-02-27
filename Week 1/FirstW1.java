import java.util.Scanner;
public class FirstW1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Your Address: ");
		String address = sc.nextLine();
		
		System.out.println("Your name is " + name);
		System.out.println("Your Address is " + address);
	}
}