package Collection.SortingDemo.ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        list.add(new Emp(5,"kaif","100000"));
        list.add(new Emp(2,"Kumail","200000"));
        list.add(new Emp(9,"Ali","50000"));

        System.out.println(list);
        Collections.sort(list,new SortById());
        System.out.println(list);

        Collections.sort(list,new SortByName());
        System.out.println(list);

        Collections.sort(list,new SortBySalary());
        System.out.println(list);
    }
}
