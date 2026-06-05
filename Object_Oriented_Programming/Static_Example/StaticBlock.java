package Object_Oriented_Programming.Static_Example;

public class StaticBlock {
    static int a = 4;
    static int b;

    /**
     * static block will run once, when the first obj is created
     * i.e when the class is loaded for first time (it runs only once,when the first object is created)
     */
    static  {
        System.out.println("I am a static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
