public class Vehicle {
    private String name; //przyklad pola niestatycznego (bez uzycia slowa static)
    private int power;
    public String color = "white";
    public static int exampleNumber = 1;
    public static String text = "This is a static text"; //pole statyczne (static)
    double value; //to jaki jest dostep? - dostep pakietowy(publiczny wewnatrz danego pakietu)

    public static void printStaticText(){
        System.out.println("Text from static method");
        //z poziomu kontekstu statycznego nie mamy dostepu do elementow niestatycznych
        // printName();
    }

    public Vehicle() {
    }

    public Vehicle(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void printName(){
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", color='" + color + '\'' +
                '}';
    }
}
