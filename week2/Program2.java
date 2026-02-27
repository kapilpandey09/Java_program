

// You need to develop a module that prints the squares and cubes of numbers from 1 
// to 5 for a math tutorial application. 
public class Program2 {
    public static void main(String[] args) {
        System.out.println("Number \t Square \t Cube");
        for(int i=1; i<=5; i++){
            System.out.println(i+" \t "+Math.pow(i, 2)+" \t "+ Math.pow(i,3));
            

        }
    }
}
