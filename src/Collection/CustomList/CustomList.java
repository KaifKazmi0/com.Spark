package Collection.CustomList;

import java.util.ArrayList;
import java.util.List;



public class CustomList {
    public static void main(String[] args) {
        Student s1 = new Student(11,"kaif","CS");
        Student s2 = new Student(12,"kumail","Law");
        Student s3 = new Student(13,"Ali","BCA");
        Student s4 = new Student(11,"kaif","CS");

        List<Student> s = new ArrayList<>();

        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);

        System.out.println(s);

        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));

    }
}
