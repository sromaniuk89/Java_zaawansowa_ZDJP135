public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Renault", 150, 4);

        car.doNothing(); //tutaj uzywamy metody z klasy Car
        car.setPower(345); //tutaj uzywamy metod odziedziczonych z Vehicle
        System.out.println(car.getPower());

        car.color="purple"; //pole color jest public wiec jest dostepne w klasie potomnej Car

        car.printName(); //w tym momencie wywolana zostanie metoda printName z klasy Car
    }
}
