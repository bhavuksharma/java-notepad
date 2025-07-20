import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTester {
    public static void main(String[] args) {
        Runnable job = new MyRunnable();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(job);

        System.out.println(Thread.currentThread().getName() + ": back to main thread");
        Thread.dumpStack();
        executor.shutdown();
    }
}
