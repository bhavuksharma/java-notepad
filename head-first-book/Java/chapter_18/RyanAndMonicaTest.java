import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BankAccount{
    private int balance = 100;

    public int getBalance(){
        return balance;
    }

    // public void spend(int amount){
    //     balance = balance - amount;
    //     if (balance < 0) {
    //         System.out.println("Overdrawn!");
    //     }
    // }

    public synchronized void spend(String theName, int amount){
        if(balance >= amount){
         balance = balance - amount;
        }else {
            System.out.println("Sorry not enough money for: "+ theName);
        }
    }
}

class RyanAndMonicaJob implements Runnable{

    private String name;
    private BankAccount account;
    private int amountToSpend;
    RyanAndMonicaJob(String theName, BankAccount theAccount, int theAmountToSpend){
        this.name = theName;
        this.account = theAccount;
        this.amountToSpend = theAmountToSpend;
    }

    @Override
    public void run() {
        goShopping(amountToSpend);
    }

    public void goShopping(int theAmountToSpend){
            System.out.println(name + " is about to spend");
            account.spend(name,theAmountToSpend);
            System.out.println(name + " finishes spending");
    }

    // public void goShopping(int theAmountToSpend){

    //     synchronized(account){
    //          if (account.getBalance() >= theAmountToSpend) {
    //              System.out.println(name + " is about to spend");
    //              account.spend(theAmountToSpend);
    //              System.out.println(name + " finishes spending");
    //          } else {
    //              System.out.println("no sufficient amount to spend for "+ name);
    //          }
    //     }
    // }
}


public class RyanAndMonicaTest{

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        RyanAndMonicaJob ryan = new RyanAndMonicaJob("Ryan", account, 50);
        RyanAndMonicaJob monica = new RyanAndMonicaJob("Monica", account, 100);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(ryan);
        executor.execute(monica);

        executor.shutdown();
    }
}