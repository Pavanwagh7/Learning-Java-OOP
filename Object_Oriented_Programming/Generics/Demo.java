package Object_Oriented_Programming.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo <T>{
    T[] arr;
    int size = 10;

    public Demo(T[] arr) {
        this.arr = arr;
    }

    public void set (T[] arr)  {
        this.arr = arr;
    }
    public T[] get () {
        return arr;
    }

    public static void main(String[] args) {
        Demo<Integer> d = new Demo<>(new Integer[]{1,2});
        System.out.println(Arrays.toString(d.get()));
    }
 }
