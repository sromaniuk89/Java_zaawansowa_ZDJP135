public class InheritanceExample {
    public static void main(String[] args) {
        ClassA aa = new ClassA(); //typ referencyjny ClassA, typ obiektu ClassA
        ClassA ab = new ClassB();   //typ referencyjny ClassA, typ obiektu ClassB
        ClassB bb = new ClassB();
        //ClassB ba = new ClassA(); //oczywiscie to nie zadziala, bo klasa A nie znajduje sie w hierarchii dziedziczenia

        aa.printText(); //wywolana zostaje metoda z ClassA
        ab.printText(); //wywolana zostaje metoda z ClassB
        bb.printText(); //wywolana zostaje metoda z ClassB

        //aa.printText("Additional text");//klasa ClassA nie posiada takiej metody ->dlatego to nie zadziala

        //mimo ze ClassB posiada metode przeciazona, to w przypadku zreferowania
        //na klase bazowa ktora tej metody przeciazonej nie posiada -> to nie mozemy jej uzyc
        //ab.printText("Additional text");
        bb.printText("Additional text");    //zostaje wywolana metoda przeciazona z klasy ClassB

        //gdy zrzutujemy typ obiektu ClassB z typu referencyjnego ClassA na ClassB wowczas mamy dostep do tej metody
        ((ClassB)ab).printText("MANUAL CAST");

        //obiekt ClassB oraz ClassC mozemy zreferowac jako klase ClassA, poniewaz znajduja sie w jej hierarchii
        //dziedziczenia
        //typ referencyjny (w niniejszym przypadku ClassA) mowi do jakich metod mamy dostep!!!
        //typ obiektu decyduje ktore metody przesloniete zostana wywolane!!!
        ClassA ab2 = new ClassB();
        ClassA ac = new ClassC();

        ab2.printText();
        ac.printText();

        //w dziedziczeniu elementy (pola oraz metody) przechodza z pokolenia na pokolenie
        ClassD classD = new ClassD();
        System.out.println(classD.getNumber());

    }
}
