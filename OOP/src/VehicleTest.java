public class VehicleTest {
    public static void main(String[] args) {
        //tworzenie nowych obiektow
        Vehicle vehicle1 =  new Vehicle("Audi", 150);
        Vehicle vehicle = new Vehicle();
        vehicle.value=3;//jezeli nie sprecyzowano pakietow to domyslnie w obrebie danego modulu jest
        //ten sam pakiet

        System.out.println(vehicle.color);
        vehicle.color = "red"; //color jest publiczne dlatego mamy stad dostep
        System.out.println(vehicle.color);

        vehicle1.printName();

        vehicle1.setPower(180); //uzycie settera
        System.out.println(vehicle1.getPower());

        //zastosowanie metody toString
        System.out.println(vehicle1);
        vehicle1.setPower(200);
        System.out.println(vehicle1);

        //pola/metody statyczne
        System.out.println(Vehicle.text);//dostep do pola statycznego mamy z poziomu klasy
        System.out.println(vehicle1.text);//oraz z poziomu obiektu!!!

        Vehicle.printStaticText(); //dostep do metody statycznej mamy z poziomu klasy
        vehicle1.printStaticText();//oraz z poziomu obiektu!!!

        System.out.println(Vehicle.exampleNumber);
        System.out.println(vehicle1.exampleNumber);
        System.out.println(vehicle.exampleNumber);

        //pola statyczne sa wspoldzielone przez wszystkie obiekty danej klasy
        vehicle.exampleNumber=2;
        System.out.println(Vehicle.exampleNumber);
        System.out.println(vehicle1.exampleNumber);
        System.out.println(vehicle.exampleNumber);
    }
}
