package Object_Oriented_Programming.Static_Example;

public class Main {
    public static void main(String[] args) {
//        Human kunal = new Human ("kunal",25,20000);
//        Human pavan = new Human ("Pavan",22,10000);
//        Human chinu = new Human ("Chinu",20,5000);
//
//        System.out.println(Human.population);//static variables are accessed using class name
//        System.out.println(Human.population);//same as above comment
//        System.out.println(Human.population);//same as above comment
//
//
//        System.out.println(kunal.name);
//        System.out.println(pavan.name);
//        System.out.println(chinu.name);

        Main object = new Main();
        object.fun2();

    }

    static void fun() {
/*      greeting();  */ /*  you can't use this because it requires an instance but the function
                            you are using it in does not depends on instance in a static context      */

        //hence here i am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2 () { greeting(); }

    //we know that something which is not static ,belongs to an object
    void greeting() { System.out.println("Hello"); }
}
