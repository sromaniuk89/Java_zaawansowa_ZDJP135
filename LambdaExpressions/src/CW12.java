import java.util.function.BiConsumer;

public class CW12 {
    public static void main(String[] args) {
        //a-liczba wierszy; b-liczby kolumny
        BiConsumer<Integer, Integer> drawRectangle = (a, b) -> {
          for(int i=0; i<a; i++)  {
              for(int j=0; j<b; j++){
                  if(i==0 || i==a-1 || j==0 || j==b-1){
                      System.out.print('*');
                  } else {
                      System.out.print(' ');
                  }
              }
              System.out.println();
          }
        };

        drawRectangle.accept(3,4);

        drawRectangle.accept(7, 30);
    }
}
