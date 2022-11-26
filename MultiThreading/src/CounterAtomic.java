import java.util.concurrent.atomic.AtomicInteger;

public class CounterAtomic {
    //stosujac ten typ mamy pewnosc ze tylko jeden watek w danej chwili moze dokonywac inkrementacji!!!
    private static AtomicInteger counter = new AtomicInteger(0); //typ atomiczny integer

    public void incrementCounter(){
        synchronized(counter) {
            System.out.println(Thread.currentThread().getName() + " : " + counter);
            counter.incrementAndGet(); //inkrementujemy wartosc specjalna metoda
        }
    }

    public static int getCounter() {
        return counter.get();
    }
}
