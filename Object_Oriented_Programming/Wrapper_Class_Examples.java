package Object_Oriented_Programming;

public class Wrapper_Class_Examples {
    public static void main(String[] args) {
        //now see here, both a and b are premitive type variable(int is premitive)
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a+" "+b);//but you see here ,it is not swapped-->pass by value

        //but if you declare in such a way
        //Integer num1 = new Integer(5); or
        Integer num1 = 2;//now it is the object
        Integer num2 = 4;//now it is the object
        swap(num1,num2);
        System.out.println(num1+" "+num2);/*but still you won't see a swap effect,
                                           because see 'Integer' class is 'final'*/

        //'final' keyword
        final int BONUS = 3000;
        //BONUS = 4000;/*Modification is not allowed in 'final' if data type is premitive */

        final A saurav = new A("Saurav");
        saurav.name = "Ganesh";//this is allowed in objects
        //but reassignment can not be done
        //saurav = new A("new Object");/*Reassigmenth is not allowed- if objects is 'final' variable */


        //Automatic Garbage collection in java
        A obj;
        for (int i = 0; i < 1000000; i++) {
            obj = new A("Random name");
        }

    }
    //pass by value of the reference
    static void swap (Integer a,Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    //pass by value
    static void swap (int a,int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
class A {
    final int BONUS = 20;
    String name ;

    A(String name){
        //System.out.println("Object is Created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed");
    }
}
