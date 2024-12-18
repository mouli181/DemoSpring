import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args){
        List<String> list = Arrays.asList("abc","def","ghi");
        Stream<String> stream = list.stream();

        stream.forEach(System.out::println);
    }
}
