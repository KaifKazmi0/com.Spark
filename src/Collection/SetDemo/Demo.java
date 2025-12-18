package Collection.SetDemo;

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        //order is not preserved
        //duplicates are not allowed
        { Set<Integer> set = new HashSet<>();
        for (int i=1;i<=5;i++){
            set.add(i);
        }
        System.out.println("Before Duplcation "+set);
        for (int i=1;i<=5;i++){
            set.add(i);
        }
        set.add(23);
        System.out.println("After Duplication "+set);}

        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(10);
        set1.add(20);
        System.out.println(set1);
    }
}
