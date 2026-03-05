package Object_Oriented_Programming.AbstractDemo;

public class Daughter extends Parent{
    Daughter (int age) {
        super(age);
    }

    @Override
    void career () {
        System.out.println("i am a doctor");
    }

    @Override
    void partner () {
        System.out.println("i love doctor");
    }
}
