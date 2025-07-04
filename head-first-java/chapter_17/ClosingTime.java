import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClosingTime {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        threadPool.execute(new ShortJob());
        threadPool.execute(new LongJob());

        threadPool.shutdown();

        try {
            boolean finished = threadPool.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("Finished? "+ finished);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadPool.shutdownNow();

    }
}
