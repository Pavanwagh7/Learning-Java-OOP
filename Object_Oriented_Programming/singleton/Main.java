package Object_Oriented_Programming.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1  = Singleton.getInstance();//getInstance(); method is static so we acces it using class name and dot operator
        Singleton obj2  = Singleton.getInstance();
        Singleton obj3  = Singleton.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
