public interface IMathOperations<T extends Number> {
    public T add(T num1, T num2);
    public abstract T subtract(T num1, T num2);
    public abstract T multiply(T num1, T num2);
    public abstract T divide(T num1, T num2);
}