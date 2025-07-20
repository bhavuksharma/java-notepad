import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.time.format.DateTimeFormatter.*;
import static java.time.format.FormatStyle.*;

class Chat{
    private final String message;
    private final LocalDateTime timestamp;

    Chat(String theMessage){
        this.message = theMessage;
        timestamp = LocalDateTime.now();
    }

    public String toString(){
        String time = timestamp.format(ofLocalizedDateTime(MEDIUM));
        return time+ " : "+ message;
    }
}

public class ConcurrentReaders {
    public static void main(String[] args) {
        // List<Chat> chatHistory = new ArrayList<>();
        List<Chat> chatHistory = new CopyOnWriteArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i = 0 ; i < 5 ; i++){
            executor.execute(() -> chatHistory.add(new Chat("Hi There!")));
            executor.execute(() -> System.out.println(chatHistory));
            executor.execute(() -> System.out.println(chatHistory));
        }

        executor.shutdown();
    }
}
