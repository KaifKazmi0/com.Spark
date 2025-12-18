package Collection.ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java","Python","DSA","Devops"));
        ListIterator<String> it = list.listIterator();

        System.out.println("Forward drn -> ");
        while (it.hasNext()){
            String data = it.next();
            if (data == "Python"){
                it.set("LangChain");
            }else {
                System.out.print(data+" ");
            }
        }
        System.out.println();

        System.out.println("Backward drn -> ");
        while (it.hasPrevious()){
            System.out.print(it.previous()+" ");
        }
    }
}
