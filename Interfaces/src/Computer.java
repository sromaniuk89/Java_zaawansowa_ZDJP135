import java.util.Scanner;

public class Computer extends MathOperations implements IUserInputFunctions, IUserInterfaceFunctions{
    private MathOperationType mathOperationType;

    @Override
    public void readNumberA() {
        System.out.println("[COMPUTER SCREEN] Type number 1: ");
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextDouble();
    }

    @Override
    public void readNumberB() {
        System.out.println("[COMPUTER SCREEN] Type number 2: ");
        Scanner scanner = new Scanner(System.in);
        b=scanner.nextDouble();
    }

    @Override
    public void readOperationType() {
        System.out.println("[COMPUTER SCREEN] What type of operation?");
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
        System.out.println("[COMPUTER SCREEN] Result equals: " + result);
    }

    @Override
    public void clearResult() {
        result=0.0;
    }

    @Override
    public void getInputValues() {
        readNumberA();
        readNumberB();
        readOperationType();
    }
}
