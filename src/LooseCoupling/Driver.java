package LooseCoupling;

public class Driver {
    public static void main(String[] args) {

        Car car1 = new Car(new PetrolEngine());
        car1.move();

        Car car2 = new Car(new DieselEngine());
        car2.move();

    }
}
