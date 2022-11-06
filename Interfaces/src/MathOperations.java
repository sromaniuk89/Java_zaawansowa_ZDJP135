public abstract class MathOperations implements IMathOperations{
    protected double result;
    protected double a, b;

    @Override
    public double add() {
        result = a+b;
        return result;
    }

    @Override
    public double subtract() {
        result = a-b;
        return result;
    }

    @Override
    public double multiply() {
        result = a*b;
        return result;
    }

    @Override
    public double divide() {
        result = b!=0 ? a/b : 0;
        return result;
    }

    public abstract void getInputValues();

}
