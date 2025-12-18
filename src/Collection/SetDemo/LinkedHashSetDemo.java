package Collection.SetDemo;

import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //order preserved
        //no random access
        //duplicates not allowed
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set);


    }
}
