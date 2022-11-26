public class CW1 implements Runnable{
    private int id;
    private int period;
    private int num;

    public CW1(int id, int period) {
        this.id = id;
        this.period = period;
        this.num = 0;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Thread: "+id+" - "+num++);

            try{
                Thread.sleep(period);
            }   catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
