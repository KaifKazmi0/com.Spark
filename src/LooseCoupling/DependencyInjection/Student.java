package LooseCoupling.DependencyInjection;

public class Student {
    public Course course;
    public Student() {
    }

    public Student(Course course) {
        this.course = course;
    }

    public void setCourse(Course course){
        this.course = course;
    }



    public void learning(){
        int n = course.start();
        if (n>0){
            System.out.println("Learning started....");
        }else {
            System.out.println("Payment failed....");
        }
    }

}
