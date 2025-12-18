package Collection.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(50);
        list.add(60);

        System.out.println(list);

        System.out.println(list.get(3));

        if (list.isEmpty()) System.out.println("List is Empty");
        else System.out.println("Not Empty...");


        System.out.println(list.size());

        System.out.println(list.set(3,40));  // ele at 3 will be printed
        list.remove(4);
        System.out.println(list);


        List<Integer> list1 = new ArrayList<>();
      for (int i=1;i<=5;i++){
          list1.add(i);
      }

        if (list1.isEmpty()){
            System.out.println("List is empty");
        }else System.out.println(list1);

        list1.clear();
        System.out.println(list1);

        //
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            int data = it.next();
            if (data==30){
                System.out.println("Removing 30...");
                it.remove();
            }else {
                System.out.println(data);
            }
        }



    }
}