import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import static java.lang.String.format;

public class VolatileExample2 {

    private static volatile int counter = 0;

    public static void main(String[] args) {
        Runnable starting = () -> {
            while (true) {
                System.out.println(format("Ustawiam licznik na %s", ++counter));
                try{
                    Thread.sleep(1000);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        };

        Runnable ending = () -> {
            int localCounter = counter;
            while (true) {
                if (localCounter != counter) {
                    System.out.println(format("Licznik zmienił wartość na: %s", localCounter = counter));
                }
            }

        };

        //ta metoda Executor'a sama decyduje ile watkow utworzyc, tworzy tyle watkow ile aktualnie trzeba, jesli sa niepotrzebne to je
        //usuwa
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(starting);
        executor.execute(ending);

    }
}