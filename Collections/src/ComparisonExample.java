public class ComparisonExample {
    public static void main(String[] args) {
        String s1= new String("abc");
        String s2= new String("abc"); //operatorem new wymuszamy utworzenie nowego obiektu

        String s3 = "CBA";
        String s4 = "CBA"; //tutaj zostalo stwierdzono ze obiekt "CBA" juz istnieje wiec nie ma potrzeby tworzyc nowego
        //referencja s3 zostala skopiowana do s4, w zwiazku z powyzszym s4 i s3 wskazuja na to samo w pamieci

        System.out.println(s1==s2); //operator == uzyty na obiektach sprawdza ich referencje a nie wartosc!!!!
        System.out.println(s1.equals(s2)); //metoda equals() oczywiscie sprawdza wartosc/zawartosc obiektow

        System.out.println(s3==s4); //tutaj tez sprawdzamy referencje, ALE kompilator nie utworzyl nowego obiektu dla s4
        System.out.println(s3.equals(s4));
    }
}