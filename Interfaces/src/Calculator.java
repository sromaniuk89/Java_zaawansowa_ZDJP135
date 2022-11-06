import java.util.Scanner;

public class Calculator extends MathOperations implements IUserInputFunctions, IUserInterfaceFunctions{
    private MathOperationType mathOperationType;

    @Override
    public void getInputValues() {
        readNumberA();
        readOperationType();
        readNumberB();
    }

    @Override
    public void makeCalculation() {
        getInputValues();

        switch(mathOperationType){
            case ADD:
                add();
                break;
            case SUBTRACT:
                subtract();
                break;
            case MULTIPLY:
                multiply();
                break;
            case DIVIDE:
                divide();
                break;
        }

        showResult();
    }

    @Override
    public void showResult() {
        System.out.println("[CALCULATOR SCREEN] Result: " + result);
    }

    @Override
    public void clearResult() {
        result=0.0;
    }

    @Override
    public void readNumberA() {
        System.out.println("[CALCULATOR SCREEN] Provide number 1: ");
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextDouble();
    }

    @Override
    public void readNumberB() {
        System.out.println("[CALCULATOR SCREEN] Provide number 2: ");
        Scanner scanner = new Scanner(System.in);
        b=scanner.nextDouble();
    }

    @Override
    public void readOperationType() {
        System.out.println("[CALCULATOR SCREEN] What type of operation?");
        Scanner scanner = new Scanner(System.in);
        char c=scanner.next().charAt(0);

        switch (c){
            case '+':
                mathOperationType=MathOperationType.ADD;
                break;
            case '-':
                mathOperationType=MathOperationType.SUBTRACT;
                break;
            case '*':
                mathOperationType=MathOperationType.MULTIPLY;
                break;
            case '/':
                mathOperationType=MathOperationType.DIVIDE;
                break;
        }

    }
}
