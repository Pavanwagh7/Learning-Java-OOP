package Object_Oriented_Programming.Interfaces;

public class NiceCar {
    private Engine engine;
    Brake b;
    //by deafault it selects  deisel engine for the nice car
    public NiceCar () {
        engine = new DieselEngine();
        b = new DiscBrake();
    }

    //here you provide the engine to be fitted in the nice car
//    public NiceCar (Engine engine) {
//        this.engine = engine;
//    }

    public void start ()  {
        engine.start();
    }

    public void accelerates () {
        engine.acceleration();
    }


    public void Brake () {
        b.brake();
    }

    public void stop ()  {
        engine.stop();
    }
}
