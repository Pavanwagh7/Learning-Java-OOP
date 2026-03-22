package Object_Oriented_Programming.Cloning;
import java.util.Arrays;
public class Human implements Cloneable {
    String name;
    int age;
    int[] arr;

    public Human(String name,int age){
        this.name = name;
        this.age = age;
        this.arr = new int[]{3, 4, 5, 6, 9, 1};
    }

    public Human(Human other){
        this.name = other.name;
        this.age = other.age;
    }
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        //this is shallow copy
//        return super.clone();
//    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        // this is deep copy
        Human twin = (Human)super.clone(); // this is actually shallow copy

        // make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        Human pavan = new Human("Pavan",22);
//        Human twin  = new Human(pavan);

        Human twin =  (Human)pavan.clone();


        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(pavan.arr));
    }
}
