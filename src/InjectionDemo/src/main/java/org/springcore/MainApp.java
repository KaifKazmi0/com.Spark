package InjectionDemo.src.main.java.org.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("---------Eager Loaded constructor Here----------");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("---------Eager Loading completed---------");

        Car car1 = context.getBean(Car.class);
        System.out.println("-----Car constructor have been called-------");
        Car car2 = context.getBean(Car.class);
        System.out.println("here car2 obj have been assigned car obj but now with new keyword");

        System.out.println(car1==car2);

        car1.drive();
    }
}
