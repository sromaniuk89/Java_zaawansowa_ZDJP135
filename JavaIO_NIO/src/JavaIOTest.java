import java.io.*;

public class JavaIOTest {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Nowy program\\Java - zaawansowana\\JavaIO_NIO\\JavaIOTest.txt";

        File file = new File(filePath); //tworzymy nowy obiekt File, zwiazany z dana sciezka
        //powyzsza instrukcja NIE utworzy jeszcze pliku

        //tworzenie pliku
        try {
            if (file.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already existed.");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        //zapisywanie do pliku
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.append('q'); //append dodaje pojedynczy znak do pliku
            fileWriter.write("asdf\n"); //write zapisuje string do pliku
            fileWriter.write("test");

        } catch (IOException e) {
            e.printStackTrace();
        }

        //odczytywanie z pliku
        try(FileReader fileReader = new FileReader(filePath)){
            int nextChar;
            while((nextChar=fileReader.read())!=-1){ //odczytujemy znak po znaku
                System.out.print((char)nextChar);
            }
            System.out.println();

        } catch (IOException e){
            e.printStackTrace();
        }

        //odczyt za pomoca buforowanego strumienia
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String inputString;
            while((inputString = bufferedReader.readLine())!=null){ //odczytujemy na raz cala linie
                System.out.println(inputString);
            }

            //bufferedReader.lines() //zwraca nam strumien stringow

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
