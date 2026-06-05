package Object_Oriented_Programming.Interfaces;

public class DieselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("diesel Engine Starts");
    }

    @Override
    public void acceleration() {
        System.out.println("diesel Engine accelerates");
    }

    @Override
    public void stop() {
        System.out.println("diesel Engine Stops");
    }
}
