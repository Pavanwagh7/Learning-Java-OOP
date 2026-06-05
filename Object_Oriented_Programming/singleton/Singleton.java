package Object_Oriented_Programming.singleton;

public class Singleton {
    private Singleton() {

    }

    public static Singleton instance;

    public static Singleton getInstance () {
        //check wheather 1 object only is created or not
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
