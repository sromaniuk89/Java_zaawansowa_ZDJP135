public class CounterTest {
    public static void main(String[] args) {
        //bez synchronizacji
        //        for(int i=0; i<3; i++){
//            CounterThread counterThread = new CounterThread();
//            counterThread.setName("counter " + i);
//            counterThread.start();
//        }

        //z uzyciem synchronized ze stala
//        for(int i=0; i<3; i++){
//            CounterSynchronizedThread counterSynchronizedThread = new CounterSynchronizedThread();
//            counterSynchronizedThread.setName("counter " + i);
//            counterSynchronizedThread.start();
//        }

        //z uzyciem synchronized z AtomicInteger
        for(int i=0; i<3; i++){
            CounterAtomicThread counterAtomicThread = new CounterAtomicThread();
            counterAtomicThread.setName("counter " + i);
            counterAtomicThread.start();

        }
    }
}
