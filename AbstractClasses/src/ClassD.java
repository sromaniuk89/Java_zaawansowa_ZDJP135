public class ClassD extends AbstractClassB{

    //implementacja metody abstrakcyjnej z klasy abstrakcyjnej A
    @Override
    public void printSymbols() {
        System.out.println("D???");
    }

    //implementacja metody abstrakcyjnej z klasy abstrakcyjnej B
    @Override
    public void printNumber() {
        System.out.println(1523);

    }
}
