public class GenericMethods {
    public <T> T randomSelection(T x, T y){
        return Math.random()>0.5 ? x: y;
    }
}
