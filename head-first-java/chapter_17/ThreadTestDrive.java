public class ThreadTestDrive {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("top o' the stack"));

        thread.start();

        System.out.println("back in main");
    }
}
