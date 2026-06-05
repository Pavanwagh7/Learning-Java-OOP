package Object_Oriented_Programming.Interfaces.Nested;

public class A {
    public interface NestedInterface {
        public boolean isOdd (int n);
    }
}
class B implements A. NestedInterface{
    public boolean isOdd (int n) {
        return (n & 1) == 1;
    }
}
