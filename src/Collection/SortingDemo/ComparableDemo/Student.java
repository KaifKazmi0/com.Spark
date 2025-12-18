package Collection.SortingDemo.ComparableDemo;

public class Student implements Comparable<Student> {
    private int id;
    private String number;
    private String name;

    @Override
    public int compareTo(Student o){
        return Integer.compare(this.id,o.id);
    }

    public Student(int id, String number, String name) {
        this.id = id;
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }



}
