package Object_Oriented_Programming.ExceptionHandling;

public class Main {
    public static void main (String[] args) {
        int a = 55;
        int b = 0;
        int c ;
        try {
            //divide(a, b);
            // mimicing
            String name = "Kunal";
            if (name.equals("Kunal")) {
                throw new MyException("name is kunal");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("normal exception");
        } finally {
            System.out.println("this will always execute");
        }
    }
    static int divide (int a,int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("you can not divide by zero");
        }
        return a / b;
    }
}
