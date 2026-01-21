package org.example.reflectionDemo;

public class Student {

    private Course course;

    public Student(){

    }
    public Student(Course course){
        this.course = course;
    }

    void setCourse(Course course){
        this.course = course;
    }

    public void start1(){
        System.out.println("Invoked by Reflection API..");
    }

    public void start(){
        int start = course.enroll();
        if (start>=1){
            System.out.println("journey started.....");
        }
    }
}
