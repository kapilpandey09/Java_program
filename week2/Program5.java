import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input");
        int input = sc.nextInt();
        floydsTriangle(input);
        System.out.println("binary Triangle");
        binaryTriangle(input);
    }
    

    static void floydsTriangle(int n) {
        // int init = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+j + " ");
            }
            System.out.println();
        }
    }

    static void binaryTriangle(int n) {
 
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }

            System.out.println();
        }
    }
}
