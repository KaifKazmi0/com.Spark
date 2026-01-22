package InjectionDemo.src.main.java.org.reflectionDemo;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App
{
    public static void main( String[] args ) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {


        Class c = Class.forName("org.example.reflectionDemo.Student");

        Constructor cons = c.getDeclaredConstructor((Course.class));

        Object obj = cons.newInstance(new DSA());


        Method m = c.getDeclaredMethod("start");
        m.invoke(obj);




//        Student s = new Student(new JavaFullStack());
//
////        Course course = new DSA();
////        s.setCourse(course);
//
//
//        s.start();
    }
}
