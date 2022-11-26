import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CW1Executor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new CW1(0, 1000));
        executorService.execute(new CW1(1, 2000));
        executorService.execute(new CW1(2, 3000));

        executorService.shutdown();
    }
}
