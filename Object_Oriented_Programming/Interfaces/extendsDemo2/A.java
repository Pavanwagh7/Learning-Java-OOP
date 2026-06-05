package Object_Oriented_Programming.Interfaces.extendsDemo2;

public interface A {
    /** starting from JDK 8 they started providing default implementation */
    default void fun () {
        System.out.println("I am in Interface A");
    }
}
