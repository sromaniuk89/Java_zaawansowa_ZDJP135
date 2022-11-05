public class EnumExample {
    public enum Colour {
        RED(255, 0, 0),
        GREEN(0, 255, 0),
        BLUE(0, 0, 255);

        public static final int a=2;
        public final int r, g, b; //final sprawia ze nikt juz przypadkowo (badz intencyjnie) nie zmieni nam
        // prawidlowo ustawionych wartosci

        Colour(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        public String getInfo() {
            return "r:" + r + " ,g:" + g + " ,b:" + b;
        }
    }

    public static void main(String[] args) {
        Colour colour1 = Colour.RED;
        Colour colour2 = Colour.GREEN;
        Colour colour3 = Colour.BLUE;

        System.out.println(colour1);
        System.out.println(colour1.getInfo());
        System.out.println(colour1.r);

        //metody statyczne moga korzystac jedynie z pol i metod statycznych
        System.out.println(meanValue(2.0,3.0));
    }

    private static double meanValue(double a, double b){
        return (a+b)/2.0;
    }
}
