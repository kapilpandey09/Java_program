import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String of: ");  
        String text = sc.nextLine();
        
        System.out.println("Enter a string char who you want to find: ");  
        
        char a = sc.nextLine().charAt(0);
       
        System.out.println("Enter a string char who you want to find: ");  
       
        char b = sc.nextLine().charAt(0);
        
        char[] arr  = text.toCharArray();
        int n = arr.length;
        int count = 0;
        int sen = 0;
        int z = 0;
        int e = 0;
        for(int i = 0; i<n; i++) {
            
            char c = arr[i];
            
            if (c == '.' || c == '!' || c == '?'){
                sen+=1;
                continue;
            }
            if(c!=' ' && (i==0 || arr[i-1] == ' ') ){
                count+=1;    
            }
            if(Character.toLowerCase(c) == Character.toLowerCase(a)){
                z+=1;
            }
            if(Character.toLowerCase(c) == Character.toLowerCase(b)){
                e+=1;
            }

        }
        System.out.println("word: " + count);
        System.out.println("Sentence: " + sen );
        System.out.println(a+ " : " + e );
        System.out.println(b+ " z: " + z );
        
    }
}
