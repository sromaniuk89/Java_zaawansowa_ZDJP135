import java.io.IOException;

public class IOOperations {

    //throws informuje jakie wyjatki moga zostac rzucone przez dana metode
    //oraz spycha odpowiedzialnosc za obsluge wyjatkow ktore moga zostac rzucone w trakcie dzialania
    //danej metody na nizszy poziom (na miejsce gdzie dana metoda jest wywolana)
    public void readDataFromFile() throws IOException {
        //IOException jest wyjatkiem typu checked
        throw new IOException(); //throw z kolei sluzy do rzucenia nowego wyjatku
    }

    public void divideNumbers(double a, double b){
        if(b==0.0){
            //rzucenie utworzonego przez nas wyjatku z wiadomoscia
            throw new DividingByZeroException("You are trying to divide: " + a + " by: " + b);
        }
    }

    public void makeCalculations(){
        throw new RuntimeException(); //sa to wyjatki unchecked
    }
}
