import java.util.function.IntSupplier;

public class LambdaTest {
    public static void main(String[] args) {
        //odwolamy sie do metody hashCode obiektu object1 przy uzyciu lambdy:
        Object object1 = new Object();
        IntSupplier object1HashCode = () -> object1.hashCode();

        //teraz zrobimy to samo przy pomocy operatora ::
        Object object2 = new Object();
        //przez :: mowimy jaka metoda ma zostac zastosowana - robimy wskazanie na jakas metode
        IntSupplier object2HashCode = object2::hashCode; //operator :: dziala jak referencja na metode
        //IntSupplier object2HashCode2 = object2.hashCode(); //to nie zadziala!!!, bo zwroci inta a nie instancje IntSupplier

        System.out.println(object1HashCode.getAsInt());
        System.out.println(object2HashCode.getAsInt());
    }
}
