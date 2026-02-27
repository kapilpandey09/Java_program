// You are working on a text processing module for a language learning application. 
// The module should read a sentence from the user and print it out with each word 
// reversed, but with the words and punctuation in the original order.

import java.util.Scanner;
public class P1_TextReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String sentence = sc.nextLine();
        String res = " ";

        
        for(int i=0; i<sentence.length(); i++){
            
            if (sentence.charAt(i) == ' '){
                System.out.print(res);
                res =" ";
            }
            res = sentence.charAt(i) + res;  
        }
        System.out.println(res);
    }
}
