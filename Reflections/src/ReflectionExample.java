import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {
    public static void main(String[] args) {
        //1 sposob odniesienia sie do danej klasy
        //tutaj dana klasa musi juz byc widoczna dla kompilatora
        Class reflectionBaseClass = BaseClass.class;
        //Class reflectionExampleClass = ExampleClass.class;

        //metody zwiazane z klasa:
        System.out.println("Name: " + reflectionBaseClass.getName());
        System.out.println("CanonicalName: " + reflectionBaseClass.getCanonicalName());
        System.out.println("Superclass: " + reflectionBaseClass.getSuperclass());

        //pobieramy pola publicznie dostepne
        Field[] fields = reflectionBaseClass.getFields(); //zwraca nam pola publiczne
        for(Field f:fields){
            System.out.println("BaseClass;   getFields: " + f.getName());
        }

        //pobieramy zadeklarowane pola w klasie (wszystkie)
        Field[] declaredFields = reflectionBaseClass.getDeclaredFields();
        for(Field f:declaredFields){
            System.out.println("BaseClass;   getDeclaredFields: " + f.getName());
        }

        //pobieramy metody
        Method[] methods = reflectionBaseClass.getMethods();
        for(Method m:methods){
            System.out.println("BaseClass;  getMethods: " + m.getName());
        }

        try {
            //2 sposob przekazywania klasy
            //tutaj klasa ktora chcemy sprawdzac nie musi byc widoczna
            //dynamiczne ladowanie
            Class reflectionExampleClass = Class.forName("ExampleClass"); //zastosowanie takie wymaga obslugi wyjatku
            //metody zwiazane z klasa:
            System.out.println("CanonicalName: " + reflectionExampleClass.getCanonicalName());
            System.out.println("Superclass: " + reflectionExampleClass.getSuperclass());

            //metoda odczytujaca zaimplementowane interfejsy danej klasy
            Class[] interfaces=reflectionExampleClass.getInterfaces();
            for(Class c:interfaces){
                System.out.println("Interface of " + reflectionExampleClass.getCanonicalName()+ " is:" + c.getCanonicalName());
            }

            //pobieramy pola publicznie dostepne (rowniez odziedziczone)
            Field[] fieldsExample = reflectionExampleClass.getFields(); //zwraca nam pola publiczne
            for(Field f:fieldsExample){
                System.out.println("ExampleClass;   getFields: " + f.getName());
            }

            //pobieramy zadeklarowane pola w klasie (wszystkie)
            //metoda getDeclaredFields() jak sama nazwa wskazuje nie pokaze pol odziedziczonych
            Field[] declaredFieldsExample = reflectionExampleClass.getDeclaredFields();
            for(Field f:declaredFieldsExample){
                System.out.println("ExampleClass;   getDeclaredFields: " + f.getType() + " " + f.getName());
            }

            //pobieramy metody publicznie dostepne (rowniez te odziedziczone)
            Method[] methodsExample = reflectionExampleClass.getMethods();
            for(Method m:methodsExample){
                System.out.println("ExampleClass;  getMethods: " + m.getReturnType() + " " + m.getName());
            }

            //pobieramy metody zadeklarowane w klasie (bez odziedziczonych)
            Method[] declaredMethodsExample = reflectionExampleClass.getDeclaredMethods();
            for(Method m:declaredMethodsExample){
                System.out.println("ExampleClass;  getDeclaredMethods: " + m.getReturnType() + " " + m.getName() + " " + Arrays.toString(m.getParameterTypes()));
            }


            //ustawianie oraz pobieranie wartosci pol obiektu
            ExampleClass exampleClass = new ExampleClass();

            Field field = reflectionExampleClass.getField("publicExampleInt");
            field.setInt(exampleClass, 3);//ustawianie wartosci pola, obiekt oraz wartosc podajemy jako argumenty metody
            System.out.println(field.get(exampleClass)); //pobieranie wartosci dziala w analogiczny sposob

            Field privateField = reflectionExampleClass.getDeclaredField("privateExampleInt");
            privateField.setAccessible(true); //ta metoda wylacza sprawdzanie dostepnosci do pola
            privateField.setInt(exampleClass, 13);
            System.out.println(privateField.get(exampleClass));
            privateField.setInt(exampleClass, 18);
            System.out.println(privateField.get(exampleClass));


            //wywolywanie metod
            Method method = reflectionExampleClass.getMethod("publicExampleMethod", int.class);
            method.invoke(exampleClass, 2022);

            //pobieranie konstruktora
            Constructor constructor = reflectionExampleClass.getConstructor();
            System.out.println(Arrays.toString(constructor.getParameterTypes()));

            Object myObj = constructor.newInstance();
            Method myMethod = myObj.getClass().getMethod("printText", null);
            myMethod.invoke(myObj, null);

        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}
