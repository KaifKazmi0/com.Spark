package LooseCoupling;

public class Car{
   private Engine engine;
   Car(Engine engine){
       this.engine = engine;
   }

    public void move(){
        engine.start();
        System.out.println("car is moving");
    }

}
