package Object_Oriented_Programming.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.area();


        Shapes sh = new Square();
        /**
          * Method calls depend on the OBJECT, not the reference
          * Variable access depends on the REFERENCE, not the object  **/
        sh.area();//calls the area() method which is in Square class


        //method overloading example
        Sum add = new Sum();
        //method add() is being overloaded
        System.out.println(add.sum(3,4));
        System.out.println(add.sum(3,4,6));
        add.sum("Pavan",113);
    }
}
