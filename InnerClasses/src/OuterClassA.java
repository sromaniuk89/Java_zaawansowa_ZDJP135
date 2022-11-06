public class OuterClassA {
    public int num1 = 1;
    public static final int ANYNUMBER = 123;
    public final int exampleNumber=256;
    //gdy samo final to mamy niezmienna

    //metody oraz klasy statyczne maja dostep do STALYCH oraz metod statycznych klasy otaczajacej
    //metody oraz klasy statyczne NIE maja dostepu do pozostalych elementow
    public static class NestedClassA{
        public int num2 = 2;

        public void printConst(){
            System.out.println(ANYNUMBER);
            //nie zadziala, niezmienna NIE jest dostepna dla elementow statycznych
            //System.out.println(exampleNumber);
        }
    }

    public class InnerClassA{
        public int num3 = 3;

        public void printNum1(){
            System.out.println(num1);
            System.out.println(ANYNUMBER);
            System.out.println(exampleNumber);
        }

    }
}
