import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JavaPathTest {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Nowy program\\Java - zaawansowana\\JavaIO_NIO\\JavaPathTest.txt";

        Path path = Paths.get(filePath); //tworzymy nowy obiekt typu Path

        try{
            if(!Files.exists(path)) //sprawdzamy czy plik juz istnieje
                Files.createFile(path); //utworzenie pliku, jezeli plik juz istnieje to rzuci wyjatek
            //zapis do pliku, tryb zapisu calkowitego (nadpisuje to co juz w danej linii sie znajduje)
            Files.write(path, "A long time ago...".getBytes(), StandardOpenOption.WRITE);
            Files.write(path, "Two thousands years later...\n".getBytes(), StandardOpenOption.WRITE);

            //opcja append powoduje dopisywanie do linii
            Files.write(path, "A man lived in a cave and eat in a forest...".getBytes(), StandardOpenOption.APPEND);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
