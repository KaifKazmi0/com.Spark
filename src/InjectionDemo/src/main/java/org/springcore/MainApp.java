package org.example.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car1 = context.getBean(Car.class);
        Car car2 = context.getBean(Car.class);

        System.out.println(car1==car2);

        car1.drive();
    }
}
