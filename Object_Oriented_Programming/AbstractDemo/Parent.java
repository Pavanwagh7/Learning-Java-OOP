package Object_Oriented_Programming.AbstractDemo;

public abstract class Parent {
    int age;
    final int VALUE;
    Parent (int age) {
        this.age = age;
        this.VALUE = 1234;
    }

    static void hello () {
        System.out.println("Hello");
    }

    void normal () {
        System.out.println("I am a normal method.");
    }

    //abstarct methods must be implemeted in child classes
    abstract void career ();
    abstract void partner ();
}
