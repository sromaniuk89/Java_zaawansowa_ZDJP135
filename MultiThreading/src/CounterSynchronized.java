public class CounterSynchronized {
    private static int counter = 0;
    private static final Object LOCK = new Object(); //posluzy nam do synchronizacji

    public void incrementCounter(){
        synchronized (LOCK) {//synchronized musi byc uzyty na obiekcie, dlatego nie zastosujemy tego dla typow prostych
            counter++;
            System.out.println(Thread.currentThread().getName() + " : " + counter);
        }
    }

    public static int getCounter() {
        return counter;
    }
}
