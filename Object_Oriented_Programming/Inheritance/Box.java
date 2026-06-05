package Object_Oriented_Programming.Inheritance;

public class Box {
    private double l;
    double w;
    double h;

    Box() {
        //super();//Object class
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    //cube
    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    //copy constructor
    Box(Box old_box) {
        this.l = old_box.l;
        this.w = old_box.w;
        this.h = old_box.h;
    }
}
