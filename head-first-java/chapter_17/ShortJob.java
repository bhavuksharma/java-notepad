public class ShortJob implements Runnable{

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("short job running on thread: "+ threadName);
    }
    
}
