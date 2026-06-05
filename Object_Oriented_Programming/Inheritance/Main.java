package Object_Oriented_Programming.Inheritance;

public class Main {
    public static void main(String[] args) {
        //this is also the example of compile time polymorphism or static polymorphism
        Box b1 = new Box(3.5,3.5,3.5);
//        System.out.println(b1.l+" "+b1.w+ " " +b1.h);
//        Box b2 = new Box(b1);

        Box_weight b3 = new Box_weight();
//        System.out.println(b3.weight);



        //Interesting things
        //1)
        Box b4 = new Box_weight(2,3,4,5);// b4 is type of Box which is referencing to object of Box_weight class
//        System.out.println(b4.weight);//not possible to access the property of child class

        //2)
        Box_weight b5 = new Box_weight(2,3,4,5);//b4 is type of Box_weight which is referencing to the object of Box class
        System.out.println(b5.w);//definitely you can do this ,you can access the propertied of parent class ,excepts those are private

        //3)
//       Box_weight b6 = new Box_weight(2,3,4); //here is problem
        /**
         * there are many variables in both parent and child classes
         * you are given the access to variables that are in the ref. type (i.e. Box_weight)
         * hence, you should have access to weight variable
         * this also means, that the ones you are trying to access should be initialised
         * but here, when the object itself is of type parent class,how will you call the constructor of child class
         */
    }
}
