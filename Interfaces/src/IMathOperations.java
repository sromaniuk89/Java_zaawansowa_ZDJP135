public interface IMathOperations {
    double add();
    public double subtract();
    public double multiply();
    public double divide();

    //mozemy w ramach interfejsow dodawac tzw metody domyslne
    //metody domyslne pozwalaja tworzyc pewne implementacje w interfejsach
    default void printAvailableMethods(){
        System.out.println("add, subtract, multpily, divide");
    }

    //OD JAVA 9+
    //dostepne sa w interfejsach metody prywatne
    //metody prywatne moga byc uzywane wewnatrz interfejsu (czyli w metodach domyslnych)
//    private int getNumberOfMethods(){
//        return 4;
//    }
}
