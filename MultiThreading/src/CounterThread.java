public class CounterThread extends Thread {

    @Override
    public void run() {
        Counter counter = new Counter();

        while(Counter.getCounter()<20){
            counter.incrementCounter();
        }
    }
}
