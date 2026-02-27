class OddAndEven {
    private int oddCount;
    private int evenCount;


    public OddAndEven() {
        oddCount = 0;
        evenCount = 0;

    }

    public void countNumbers(int[] numbers){
        for(int num : numbers){
            if(num%2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
    }

    public int getOddCount(){
        return oddCount;
    }

    public int getEvenCount(){
        return evenCount;
    }
    
} 

public class Program1{
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        OddAndEven obj = new OddAndEven();
        obj.countNumbers(numbers);

        System.out.println("Number of Odd: "+ obj.getOddCount());
        System.out.println("Number of Even: "+ obj.getEvenCount());
        
    }
}