import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
public class Read {
    public static void main(String[] args){
        try (FileInputStream fis = new FileInputStream("src/example.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } }}

