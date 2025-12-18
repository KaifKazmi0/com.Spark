package Collection.SortingDemo;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Sort_INTGR_Obj {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
        list.add(65);
        list.add(5);
        list.add(34);
        list.add(2);


        System.out.println(list);
        Collections.sort(list); //We know sorting will be done on the basis of Integer
        //But on what basis sorting will be done if obj contains multiple data types
        System.out.println(list);
        //we solve this problem with comparator and comparable
    }
}
