public class ExampleClass extends BaseClass implements IMethods, IOutputInterface {
    private int privateExampleInt;
    public int publicExampleInt;

    public String publicExampleString;

    public void publicExampleMethod(int x){
        System.out.println("publicExampleMethod output: " + x);
    }

    private void privateExampleMethod(int x){
        System.out.println("This is only accesible from ExampleClass, output: " + x);
    }

    @Override
    public void printText() {
        System.out.println("This is short text from ExampleClass");
    }

    @Override
    public int returnValue() {
        return 1411;
    }
}
