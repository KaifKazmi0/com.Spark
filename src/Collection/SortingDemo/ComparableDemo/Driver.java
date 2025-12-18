package Collection.SortingDemo.ComparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(12,"9845","Kaif"));
        list.add(new Student(3,"945","Kumail"));
        list.add(new Student(9,"98","Arif"));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);



    }
}
