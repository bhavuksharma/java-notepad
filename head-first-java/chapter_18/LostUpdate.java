import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


// class Balance{
//     int balance = 0;

//     public synchronized void increment(){
//         balance++;
//     }
// }


class Balance{
    AtomicInteger balance = new AtomicInteger(0);

    public void increment(){
        balance.incrementAndGet();
    }
}

public class LostUpdate {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(6);
        Balance balanceObj = new Balance();

        for(int i = 0 ; i < 1000 ; i++){
            executor.execute(() -> balanceObj.increment());
        }
        
        executor.shutdown();


        try {
            if (executor.awaitTermination(1, TimeUnit.MINUTES)) {     
                System.out.println("balance is: "+ balanceObj.balance);       
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
