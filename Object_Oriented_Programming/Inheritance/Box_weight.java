package Object_Oriented_Programming.Inheritance;

public class Box_weight extends  Box {
    double weight;

    public Box_weight() {
        super();
        this.weight = -1;
    }

    public Box_weight(Box_weight other) {
        super(other);
        weight = other.weight;
    }


    public Box_weight(double l, double w, double h, double weight) {
        super(l, w, h);
        this.weight = weight;//this keyword here is actually refering the weight in class Box_weight

        //but let say Box class (Parent class of class Box_weight) has also varible 'weight' (datatype = double),it can be accessed here using super keyword
//        System.out.println(super.weight);//in order to run this code snippet you will have to declare and initialise 'weight' variable in class Box
    }


}
