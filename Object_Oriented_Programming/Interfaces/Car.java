package Object_Oriented_Programming.Interfaces;

public class Car implements Engine,Brake, SoundSystem {
    int a = 10;

    @Override
    public void brake() {
        System.out.println("this is the brake of nomal car");
    }

    @Override
    public void start() {
        System.out.println("i start engine as a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine as a normal car");
    }

    @Override
    public void acceleration() {
        System.out.println("I accelearate engine as a normal car");
    }
}
