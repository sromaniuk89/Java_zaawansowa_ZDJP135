import java.nio.CharBuffer;
import java.util.Arrays;

public class JavaBufferTest {
    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.allocate(12);
        String text = "SDA:JAVA";

        for (char c : text.toCharArray()) {
            charBuffer.put(c);//wstawiamy znak w bufor i automatycznie przechodzimy na kolejny element buforu
        }

        //wyswietlamy zawartosc charBuffer'a
        System.out.println("Text in CharBuffer: " + Arrays.toString(charBuffer.array()));

        String dataFromCharBuffer = "";
        charBuffer.rewind(); //przewijamy na poczatek buforu
        while (charBuffer.remaining() > 0) {
            dataFromCharBuffer += charBuffer.get();//pobieramy znak i automatycznie przechodzimy na kolejny
        }

        System.out.println("Effect of get() method used on charBuffer: " + dataFromCharBuffer);
    }
}
