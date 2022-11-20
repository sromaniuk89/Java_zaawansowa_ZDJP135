public class Smartphone {
    //uzywajac obiektow innych klas wewnatrz danej klasy dokonujemy tzw. kompozycji
    public Processor processor;
    public Camera camera;

    public static int num;

    public Smartphone(Processor processor, Camera camera) {
        this.processor = processor;
        this.camera = camera;
    }

}
