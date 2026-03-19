package Object_Oriented_Programming.Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] arr;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomArrayList (){
        this.arr = new int[DEFAULT_SIZE];
    }

    public void add (int ele) {
        if (size >= arr.length) reSize();
        arr[size] = ele;
        size++;
    }
    private void reSize () {
        int[] temp = new int[arr.length * 2];

        //now copy the elements to new array
        for (int i = 0;i < arr.length;i++) {
            temp[i] = arr[i];
        }

        arr = temp;//now arr points to temp
    }
    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    //this method returns the array in String form
    public String  print () {
        return Arrays.toString(this.arr);
    }


    //size method returns how many integers are added in Arraylist till now
    public int size () {
        return size;
    }

    public void set(int index,int value) {
        arr[index] = value;
    }

    public int get (int index) {
        return arr[index];
    }

    public int removed (int index){
        int removed = arr[size - 1];
        size--;
        return removed;
    }
    private boolean isFull() {
        return size == arr.length;
    }
}
