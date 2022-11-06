public class AbstractClassTest {
    public static void main(String[] args) {
        //nie zadziala bo nie da sie utowrzyc instancji klasy abstrakcyjnej
        //AbstractClassA abstractClassA = new AbstractClassA();

        AbstractClassA ac = new ClassC();

        ac.printSymbols(); //metoda ta jest zaimplementowana metoda abstakcyjna klasy AbstactClassA
        ac.printText(); //metoda z klasy abstrakcyjnej A

        AbstractClassA ad = new ClassD();
        AbstractClassB bd = new ClassD();

        ad.printSymbols();
        ad.printText();
        //ad.printNumber(); //->nie da sie bo mam referencje na klase abstrakcyjna A gdzie takiej metody nie ma

        bd.printSymbols();
        bd.printText();
        bd.printNumber(); //referencja na AbstractClassB gdzie ta metoda jest
    }
}
