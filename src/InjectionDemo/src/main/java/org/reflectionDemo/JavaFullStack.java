package org.example.reflectionDemo;

public class JavaFullStack implements Course{
    @Override
    public int enroll() {
        System.out.println("enrolled to javaFullStack");
        return 1;
    }
}
