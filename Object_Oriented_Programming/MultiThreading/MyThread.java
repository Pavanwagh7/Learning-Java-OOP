//Way 01
class SumThread implements Runnable {
    int a;
    int b;
    int sum;

    public void run () {
        sum = sum(a, b);
        seeSum();
    }

    //Contructor
    public SumThread (int x,int y) {
        this.a = x;
        this.b = y;
    }

    public int sum (int a,int b) {
        return a + b;
    } 

    public int getSum () {
        return sum;
    }
    public void seeSum () {
        System.out.println (this.sum);
    }
    
}

class ProductThread implements Runnable {
    int a;
    int b;
    int product;

    public void run () {
        this.product = this.product(a, b);
        seeProduct();
    }

    //Contructor
    public ProductThread (int x,int y) {
        this.a = x;
        this.b = y;
    }

    public int product (int a,int b) {
        return a * b;
    } 

    public int getProduct () {
        return product;
    }  
    public void seeProduct () {
        System.out.println (this.product);
    }
}

//Way 02
public class MyThread extends Thread{
    public void run (){
        System.out.println("MyThread is running");
    } 
}

