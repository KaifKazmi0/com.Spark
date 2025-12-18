package Collection.LinkedListDemo;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        for (int i=1;i<=5;i++){
            list.add("i->"+i);
        }
        System.out.println(list);

        System.out.println(list.get(3));
        //since LinkedList doesn't implements RandomAccess
        // internally traverse through loop to get val at idx

    }
}
