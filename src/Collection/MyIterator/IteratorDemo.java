package Collection.MyIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(int i=1;i<=5;i++){
            list.add("i->"+i);
        }

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String data = it.next();
            if(data.equals("i->2")){
                it.remove();
            }else {
                System.out.println(data);
            }

        }
    }
}
