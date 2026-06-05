package Object_Oriented_Programming.Interfaces.extendsDemo2;

public class Main implements A,B{
    @Override
    public void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        B.staticMethod();

        Main m = new Main ();
        m.greet();
        m.fun();//deafault method of Intreface A will be called
    }
}
