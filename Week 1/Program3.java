import java.util.Scanner;

class Program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of inputs: ");
        int n = sc.nextInt();

        System.out.println("S.No\tInput(F)\tOutput(C)");

        for (int i = 1; i <= n; i++) {
            System.out.print("\t\t\t\t\t");
	    int f = sc.nextInt();           // input Fahrenheit
	    sc.nextLine();	
            float c = (f - 32) / 1.8f;      // conversion

            System.out.println(i + "\t" + f + "\t\t" + c);
        }

        sc.close();
    }
}
