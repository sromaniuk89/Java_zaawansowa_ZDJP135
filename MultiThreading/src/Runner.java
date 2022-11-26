public class Runner {
    public static void main(String[] args) {
        Runnable[] runnables = new Runnable[10];
        Thread[] threads = new Thread[10];

        for(int i=0; i<10; i++){
            runnables[i] = new MyRun(i);
            threads[i] = new Thread(runnables[i]);
        }

        for(int i=0; i<10; i++){
            threads[i].start(); //metoda start uruchamia watek
        }
    }
}
