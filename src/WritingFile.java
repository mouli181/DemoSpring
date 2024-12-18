import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;


public class WritingFile {
    public static void main(String[] args) {
        try(FileWriter f = new FileWriter("src/example.txt")){
            f.write("Welcome to Advanced Java");

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
