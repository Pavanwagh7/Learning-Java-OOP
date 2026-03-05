package Object_Oriented_Programming.AbstractDemo;



public class Main {
    public static void main(String[] args) {
        Son son = new Son(27);
        son.career();
        System.out.println(son.age);

        Daughter d = new Daughter(18);
        d.career();
//        System.out.println(d.age);

        /**
         * You can not create an object of abstract class unless and untill you write a body for methods in the same class or in child class.
         * if this were allowed
        **/
//        Parent p = new Parent() {
//          //implementation of abtracted methods of parent class
//        }


        /**
         * static methods are not overridden,abtract must be overridden ,so there are mot static abstract methods.
         * it is ok to create static methods in abstract class but do not try overriding them.
         * normal methods can exist in abtract class and they can be overridden in child and in the same class.
        */




    }
}
