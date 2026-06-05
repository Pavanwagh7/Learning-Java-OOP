package Object_Oriented_Programming.Static_Example;

public class Human {
    String name;
    int age;
    int salary;

    static long population;

    static void message () {
        System.out.println("hello World");
//        System.out.println(this.age);//can't use 'this' keyword over here
    }

    public Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

        Human.population += 1;/* As static varibales are independent of objects,
                                 use class name for accessing purpose           */
    }
}
