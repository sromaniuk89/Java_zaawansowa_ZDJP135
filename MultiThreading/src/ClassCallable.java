import java.util.concurrent.Callable;

//Interfejs Callable posiada metode call() ktora zwraca obiekt typu generycznego
public class ClassCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int result=0;

        for(int i=301; i>0 ; i--)
            result+=i;

        return result;
    }
}
