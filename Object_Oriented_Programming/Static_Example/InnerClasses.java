package Object_Oriented_Programming.Static_Example;

public class InnerClasses {
    static class Test {
        String name;
        public Test(String name) {
                this.name = name;
            }
    }
    public static void main(String[] args) {
        Test kunal = new Test ("Kunal");
        Test rahul = new Test ("Rahul");
    }
}

//static class A { /*block of code */} // ---->You can only use static with classes in inner classes
