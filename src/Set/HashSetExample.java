package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class HashSetExample {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("apple");
        s.add("banana");
        s.add("orange");
        s.add("banana");
        s.add("mosambi");
        System.out.println(s);

        Set<Integer> s1 = new LinkedHashSet<>();
        s1.add(10);
        s1.add(50);
        s1.add(10);
        s1.add(40);
        s1.add(20);
        s1.add(50);
        System.out.println(s1);

        Set<Integer> s2 = new TreeSet<>();
        s2.add(10);
        s2.add(50);
        s2.add(10);
        s2.add(40);
        s2.add(20);
        s2.add(50);
        System.out.println(s2);

        Set<String> s3 = new TreeSet<>();
        s3.add("orange");
        s3.add("banana");
        s3.add("apple");
        System.out.println(s3);

    }
}
