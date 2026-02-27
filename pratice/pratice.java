
// import javax.swing.plaf.basic.BasicToolBarSeparatorUI;


abstract class BankAccount{
    private String accountHolder;
    private double balance;

    public BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance =  balance;
    }

    void deposit(double amount){
        
        this.balance += amount;
        System.out.println("Depositeed: "+ amount);
    }

    double getBalance(){
        return this.balance; 
    }

    abstract void calculateInterest();


    
}

class Savings extends BankAccount{

    public Savings(String name, double balance) {
        super(name, balance);
    }

    void calculateInterest(){
        System.out.println("Savings Interset: "+ (getBalance() * 0.04));
    }
    
}


class CurrentAcount extends BankAccount{

    public CurrentAcount(String name, double balance) {
        super(name, balance);
    }

    void calculateInterest(){
        System.out.println("Cureent accoutn isnetr = 0");
    }
    
}





public class pratice{



    public static void main(String[] args) {
        BankAccount acc = new Savings("kapil", 100000);
        acc.deposit(2000);
        acc.calculateInterest();
    }
}