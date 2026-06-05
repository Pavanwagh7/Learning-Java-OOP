package Object_Oriented_Programming.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine Starts");
    }

    @Override
    public void acceleration() {
        System.out.println("Electric Engine acclerates");
    }

    @Override
    public void stop () {
        System.out.println("Electric Engine Stops");
    }
}
