package Collection.SortingDemo.ComparatorDemo;

import java.util.Comparator;

public class SortById implements Comparator<Emp> {


    @Override
    public int compare(Emp o1, Emp o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}
