package Object_Oriented_Programming.AbstractDemo;

public class Son extends Parent{
    Son (int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am  a coder");
    }

    @Override
    void partner() {
        System.out.println("I love coder");
    }
}
