//w przypadku rozszerzania interfejsu w innym interfejsie uzywamy slowa extends, a nie implements!
public interface IAdvancedMathOperations extends IMathOperations{
    public double power();
    public double sqrt();
}
