import java.util.function.Function;

public class HigherOrderFunction {
    public static void main(String[] args) {
        Function<Integer, Long> operation = getOperationFunction(1);//tutaj pierwsze wyrazenie lambda
        Function<Integer, Long> operation2 = getOperationFunction(11);//tutaj mamy drugie wyraznie lambda

        System.out.println(operation.apply(2));
        System.out.println(operation2.apply(2));
    }

    //metoda wyzszego rzedu - metoda ktora zwraca metode
    private static Function<Integer, Long> getOperationFunction(Integer a){
        if(a==1){
            //jezeli wartosc na wejsciu metody to 1 to zwroc wyrazenie lambda podnoszace do kwadratu
            return x -> (long) x*x;
        }
        else {
            //jezeli wartosc na wejsciu jest inna niz 1 to zwroc wyrazenie lambda zwracajace 256L
            return x -> 256L;
        }
    }
}
