// You are working on a module for a text analysis tool that reads three strings and 
// sorts them lexicographically.

import java.util.Arrays;
import java.util.Scanner;

public class P3_lexicology {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        String str[] = arr.split(" ");

        
        Arrays.sort(str);
        System.out.println("\nSorted STR is: ");
        for (String word : str) {
            System.out.println(word);
        }
    }
}
