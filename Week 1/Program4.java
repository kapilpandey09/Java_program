import java.util.Scanner;
class Program4{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number in float");
	double num = sc.nextDouble();	
	

	double numRound = Math.round(num);
	double numCeil = Math.ceil(num);
	double numFloor = Math.floor(num);
	int numInteger = (int) num;
	System.out.println("NumRound is : "+ numRound);  
	System.out.println("NumCeil is : "+ numCeil);	
	System.out.println("NumFloor is : "+ numFloor);		
	System.out.println("NumInteger is : "+ numInteger);
}
}