package Object_Oriented_Programming.Polymorphism;

public class Sum {

    int sum (int a,int b) {
        return a + b;
    }

    //method overloading
    double sum (double a,int b) {
        return a + b;
    }

    //method overloading
    int sum (int a,int b,int c) {
        return a + b + c;
    }

    //method overloading
    void sum (String b,int a) {
        System.out.println(b  + " " + a);
    }
}
