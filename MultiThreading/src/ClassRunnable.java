import java.util.Random;

public class ClassRunnable implements Runnable {
    private int id;

    public ClassRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ClassRunnable{" +
                "id=" + id +
                '}';
    }
}