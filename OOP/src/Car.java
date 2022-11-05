public class Car extends Vehicle{
    private int numberOfDoors;

    public Car() {
        super(); //uruchamiamy konstruktor klasy bazowej bezargumentowy
    }

    public Car(String name, int power, int numberOfDoors) {
        super(name, power); //tutaj wywolany zostanie konstruktor z klasy bazowej (Vehicle)
        this.numberOfDoors = numberOfDoors;
    }

    public void doNothing(){
        System.out.println("I do nothing");
        //this.power = 125; nie mamy dostepu do power bo jest private w klasie bazowej
    }

    //mozemy przeslaniac metody klasy bazowej, zmieniajac jej funkcjonalnosc
    @Override
    public void printName() {
        System.out.print("printName method From Car: ");
        //super zmienia kontekst na klase bazowa
        super.printName(); //tutaj wywolamy metode printName z klasy Vehicle

    }
}
