import java.util.Optional;

public class OptionalsTest {
    public static void main(String[] args) {
        //metoda of tworzymy nowego Optionala, jednak nie mozemy w taki sposob przekazac null'a
        Optional<String> stringOptional = Optional.of("abc");
        //Optional<String> stringOptional2 = Optional.of(null); //tu rzuci wyjatek

        //metoda ofNullable pozwala opakowac null'a
        Optional<String> stringOptional3 = Optional.ofNullable(null);

        //w taki sposob tworzymy optionala pustego (nic nie zawiera), ktory moze byc np. zwrocony z metody
        Optional<String> stringOptional4 = Optional.empty();

        //metoda isPresent sprawdzamy czy cos znajduje sie w Optionalu:
        boolean isPresent = stringOptional.isPresent(); //true
        System.out.println(isPresent);
        System.out.println(stringOptional3.isPresent());//false - jak jest null to tez zwraca false
        System.out.println(stringOptional4.isPresent());//false - pusty Optional oczywiscie zwraca false

        //jesli optional jest pusty to zwroc "123"
        System.out.println(stringOptional.orElse("123"));
        System.out.println(stringOptional3.orElse("123"));
        System.out.println(stringOptional4.orElse("123"));

        //jesli optional jest pusty to rzuc wyjatek
        System.out.println(stringOptional4.orElseThrow(()->new IndexOutOfBoundsException()));


    }
}
