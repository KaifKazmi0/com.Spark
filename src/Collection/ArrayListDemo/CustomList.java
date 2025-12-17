package Collection;

import java.util.ArrayList;
import java.util.List;

class Student{
    int rollNum;
    String name;
    String course;

    public Student(int rollNum, String name, String course) {
        this.rollNum = rollNum;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return rollNum+" "+name+" "+course;
    }
}

public class CustomList {
    public static void main(String[] args) {
        Student s1 = new Student(11,"kaif","CS");
        Student s2 = new Student(12,"kumail","Law");
        Student s3 = new Student(13,"Ali","BCA");

        List<Student> s = new ArrayList<>();

        s.add(s1);
        s.add(s2);
        s.add(s3);

        System.out.println(s);
    }
}
