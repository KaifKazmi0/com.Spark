package LooseCoupling.DependencyInjection;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setCourse(new JavaFullStack());
        student1.learning();

        Student student2 = new Student();
        student2.course = new JavaFullStack();
        student2.learning();

        //constructor dependency
        Student student3 = new Student(new DSA());
        student3.learning();

    }
}
