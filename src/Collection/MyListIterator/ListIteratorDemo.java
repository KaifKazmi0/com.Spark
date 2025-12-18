package Collection.MyListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=5;i++){
            list.add(i);
        }

        ListIterator<Integer> li = list.listIterator();

        while (li.hasNext()){
            System.out.print(li.next()+" ");
        }

        System.out.println();
        li = list.listIterator();

        while (li.hasNext()){
            Integer x = li.next();
            if(x.equals(4)){
                li.set(5);
            }
        }

        li = list.listIterator();
        while (li.hasNext()){
            System.out.print(li.next()+" ");
        }

        System.out.println();

        while (li.hasPrevious()){
            System.out.print(li.previous()+" ");
        }
    }
}
