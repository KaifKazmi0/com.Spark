package LooseCoupling;

public class EngineFactory {

    public static Engine getEngine(String engine){
        if (engine.equalsIgnoreCase("petrol")) return new PetrolEngine();
        else if(engine.equalsIgnoreCase("diesel")) return new DieselEngine();
        else throw new IllegalArgumentException();
    }
}
