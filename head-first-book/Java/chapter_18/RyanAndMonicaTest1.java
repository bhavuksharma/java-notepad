import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class BankAccount{
    private final AtomicInteger balance = new AtomicInteger(100);

    public int getBalance(){
        return balance.get();
    }

    public void spend(String theName,int amountToSpend){
        
        int initialValue = getBalance();
        if (initialValue >= amountToSpend) {
            boolean success = balance.compareAndSet(initialValue, initialValue-amountToSpend);

            if (!success) {
                System.out.println(theName + "you haven't spent anything");
            }
        } else {
            System.out.println("Not enough money to spend for: "+ theName);
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
}


public class RyanAndMonicaTest1{

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
