package InjectionDemo.src.main.java.org.springcore;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car is moving ");
    }

}
