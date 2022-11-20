import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.*;
import java.nio.channels.*;

public class JavaNIOTest {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Nowy program\\Java - zaawansowana\\JavaIO_NIO\\JavaIOTest.txt";

        //Teraz bedziemy korzystac z idei kanalow i buforow (Java NIO)

        //odczyt
        //zakladamy ze dany plik juz istnieje
        try(FileInputStream fileInputStream = new FileInputStream(filePath)){
            //kanal uzyskujemy metoda getChannel uzyta na strumieniu wej/wyj
            FileChannel fileChannel = fileInputStream.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(20);//tworzymy nowy bufor

            fileChannel.read(byteBuffer);//odczytujemy z kanalu do bufora

            byteBuffer.rewind();//przewijamy bufor
            while(byteBuffer.remaining()>0){
                System.out.println((char)byteBuffer.get());//dopiero na samym koncu odczytujemy
                //System.out.println(byteBuffer.getChar());
            }

        } catch (IOException e){
            e.printStackTrace();
        }

        //zapis
        try(FileOutputStream fileOutputStream = new FileOutputStream(filePath)){
            //najpierw pobieramy kanał ze strumienia
            FileChannel fileChannel = fileOutputStream.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(30);

            String text = "JAVA NIO";
            for(char c: text.toCharArray()){
                byteBuffer.put((byte)c);
            }

            byteBuffer.rewind();
            fileChannel.write(byteBuffer);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
