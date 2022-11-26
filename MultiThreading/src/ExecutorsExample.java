import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsExample {
    public static void main(String[] args) {
        //tutaj tworzymy jednowatkowa pule/ jednowatkowego wykonawce
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //Interfejs callable sprawia ze mozemy z metody zwrocic wartosc generyczna
        //A Future represents the result of an asynchronous computation.
        // Methods are provided to check if the computation is complete, to wait for its completion,
        // and to retrieve the result of the computation. The result can only be retrieved using
        // method get when the computation has completed, blocking if necessary until it is ready.
        Future future = executorService.submit(new ClassCallable()); //submit gdy cos zwraca

        try {
            System.out.println(future.get());
        } catch (Exception e){
            e.printStackTrace();
        }

        executorService.shutdown();//shutdown zamyka serwis wykonawcy, po shutdownie nie mozna juz uruchamiac nowych taskow w ramach
        //danego executorService'a

        //ta metoda utworzymy stricte okreslona pule watkow
        ExecutorService executorService2 = Executors.newFixedThreadPool(5);

        //execute gdy nie potrzebujemy nic zwracac
        //ExecutorService przejmuje za mnie obowiazek zarzadzania/rozdzielania watkow pomiedzy taski!
        //w tym przypadku mamy 5 watkow i 10 taskow. ExecutorService samodzielnie zrealizuje najpierw pierwsze 5 taskow(id:0-4) na 5 watkach
        //a dopiero potem na te 5 watkow wrzuci pozostale 5 taskow(id:10-14)
        for(int i=0;i<10;i++)
            executorService2.execute(new ClassRunnable((i/5)*10+i%5));


        executorService2.shutdown();

    }
}
