public class InterfacesExample {
    public static void main(String[] args) {
        Computer computer1= new Computer();

        computer1.printAvailableMethods();

        IUserInterfaceFunctions calculator = new Calculator();
        IUserInterfaceFunctions computer = new Computer();

        calculator.makeCalculation();
        computer.makeCalculation();
        computer.showResult();
        computer.clearResult();
        computer.showResult();


    }
}
