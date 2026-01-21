package org.example.reflectionDemo;

public class DSA implements Course{
    @Override
    public int enroll() {
        System.out.println("Enrolled to DSA");
        return 1;
    }
}
