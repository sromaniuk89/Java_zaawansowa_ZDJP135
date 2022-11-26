public class Counter {
    private static int counter = 0;

    public void incrementCounter(){
        counter++;
        System.out.println(Thread.currentThread().getName()+" : "+counter);
    }

    public static int getCounter() {
        return counter;
    }
}
