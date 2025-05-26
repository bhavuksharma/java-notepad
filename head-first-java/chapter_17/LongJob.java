import java.util.concurrent.TimeUnit;

public class LongJob implements Runnable{

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("inside the long job running on thread: "+ Thread.currentThread().getName());
    }
    
}
