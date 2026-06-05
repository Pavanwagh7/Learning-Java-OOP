package Object_Oriented_Programming.Inheritance;

public class Box_price extends  Box_weight{
    double cost;

    Box_price () {
        super();
        this.cost = -1;
    }

    public Box_price(double cost) {
        this.cost = cost;
    }

    public Box_price(Box_weight other, double cost) {
        super(other);//super class properties
        this.cost = cost;//this class properties
    }

    public Box_price(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);//super class properties
        this.cost = cost;//this class properties
    }
}
