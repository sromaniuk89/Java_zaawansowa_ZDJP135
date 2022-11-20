import java.io.IOException;

public class ExceptionsTest {
    public static void main(String[] args) {
        IOOperations ioOperations = new IOOperations();

        //stosowanie składni try catch powoduje ze nasz program sie nie zatrzyma (nie wywali)
        try {
            ioOperations.readDataFromFile();
        } catch (IOException ioException){
            ioException.printStackTrace();
        }

        System.out.println("Test1");

        try{
            ioOperations.divideNumbers(2.0, 0.0);
        } catch (DividingByZeroException e){
            e.printStackTrace();
        } catch (Exception e){ //lapiac wyjatki od przechodzimy od dolu do gory w hierarchii dziedziczenia
            e.printStackTrace();
        } //od wyspecjalizowanych wyjatkow do tych ogolniejszych


        System.out.println("Test2");

        method1();

        System.out.println("Will this text be printed?");
    }

    private static void method1(){
        method2();
    }

    private static void method2(){
        method3();
    }

    private static void method3(){
        method4();
    }

    private static void method4(){
        IOOperations ioOperations = new IOOperations();

        try{
            ioOperations.makeCalculations();
        } catch (Exception e)
        {
            //printStackTrace() wyswietla informacje o stosie wywolan powodujacych rzucenie wyjatku
            e.printStackTrace();
        }

    }
}
