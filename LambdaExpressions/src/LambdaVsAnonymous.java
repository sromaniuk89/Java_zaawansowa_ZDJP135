public class LambdaVsAnonymous {
    @FunctionalInterface
    public interface Checker<T> {
        boolean check(T object);
        //boolean check2(T object); //moze byc tylko 1 metoda abstrakcyjna w interfejsie funkcyjnym
    }

    public static void main(String[] args) {
        //Checker<Integer> isOddAnonymous = new Checker<Integer>(); //nie da sie utworzyc instancji interfejsu!!!!

        //Instancja klasy anonimowej implementujacej metode abstrakcyjna z danego interfejsu
        Checker<Integer> isOddAnonymous = new Checker<Integer>() {
            @Override
            public boolean check(Integer object) {
                return object % 2 != 0;
            }
        };

        System.out.println(isOddAnonymous.check(123));
        System.out.println(isOddAnonymous.check(124));

        //Wyrazenie lambda (x -> x%2 != 0) realizujace to samo
        Checker<Integer> isOddLambda = x -> x%2 != 0;

        System.out.println(isOddLambda.check(123));
        System.out.println(isOddLambda.check(124));
    }

}
