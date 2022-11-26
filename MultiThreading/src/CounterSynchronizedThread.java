public class CounterSynchronizedThread extends Thread{

    @Override
    public void run() {
        CounterSynchronized counterSynchronized = new CounterSynchronized();

        while(CounterSynchronized.getCounter()<20){
            counterSynchronized.incrementCounter();
        }
    }
}
