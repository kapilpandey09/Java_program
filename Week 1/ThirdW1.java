import java.util.Scanner;
public class ThirdW1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Serial No.");
		int Sr = 1;
		System.out.print("Enter Temperature (in Fahrenheit)");
		double F = sc.nextDouble();
		
		double C = (F-32)/1.8;
		
		while(Sr<=5){
			System.out.println("\n----------------------------------------");
			System.out.println("S.No.\tFahrenheit\tCelsius");
			System.out.println("------------------------------------------");
			System.out.println(Sr + "\t" + F + "\t" + C);
			System.out.println("------------------------------------------");
			Sr++;
		}
	}
}
