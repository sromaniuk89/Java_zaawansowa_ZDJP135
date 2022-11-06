public abstract class AbstractClassA { //klasa abstrakcyjna
    public static final int num = 213;
    public int d;

    public abstract void printSymbols(); //metoda abstrakcyjna

    //w klasie abstrakcyjnej mozemy miec metody z juz gotowa implementacja!
    public void printText(){
        System.out.println("Text from AbstractClassA");
    }

}
