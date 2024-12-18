import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Java");
        list.add(" Programming");

        System.out.println(list);

        List<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        System.out.println(array);

        List c = new ArrayList();
        c.addAll(array);
        c.addAll(list);
        System.out.println(c);


        List a = new ArrayList();
        a.add(10);
        a.add("Mouli");
        System.out.println(a);

        List<String> vector = new Vector<>();
        vector.add("I");
        vector.add("Love");
        vector.add("Java");
        System.out.println(vector);

        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());

    }
}