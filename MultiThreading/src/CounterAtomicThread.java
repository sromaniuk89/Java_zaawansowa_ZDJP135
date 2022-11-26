public class CounterAtomicThread extends Thread{

    @Override
    public void run() {
        CounterAtomic counterAtomic = new CounterAtomic();

        while(CounterAtomic.getCounter()<20){
            counterAtomic.incrementCounter();
        }
    }
}
