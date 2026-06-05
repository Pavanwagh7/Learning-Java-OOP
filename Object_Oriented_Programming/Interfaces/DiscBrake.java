package Object_Oriented_Programming.Interfaces;

public class DiscBrake implements Brake {
    @Override
    public  void brake () {
        System.out.println("Disc Brakes are applied");
    }
}
