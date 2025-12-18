package Collection.VectorDemo;

import java.util.Enumeration;
import java.util.Vector;

public class Demo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        //We use vector reference here because Vector have some extra methods
        // these xtra methods are not in the List

        for (int i=1;i<=5;i++){
            vector.add(i);
        }
        System.out.println(vector);

        Enumeration<Integer> elements = vector.elements();
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }

    }
}
