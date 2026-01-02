package Object_Oriented_Programming;

public class Classes_and_Objects {
    public static void main (String[] main) {
        //new keyword is used to allocate a memory dynamically
        Student s1 = new Student(118,"Pavan Shantilal Wagh",9.3f);
        Student s2 = new Student();
        Student s3 = new Student(s2);
        //System.out.println(s2.roll +" "+ s2.name +" "+ s2.marks);
        //System.out.println(s1.roll+" "+s1.name+" "+s1.marks);
        //System.out.println(s3.roll+" "+s3.name+" "+s3.marks);

        //Student2 st1 = new Student2();
        //System.out.println(st1.roll+" "+st1.name+" "+st1.marks);

        //two objects pointing to the same object
        Student2 one = new Student2();
        Student2 two = one;
        one.name = "Something";//make a change in name via object 'one'
        //now see it using object 'two'
        System.out.println(two.name);

    }
}


//Student class
class Student {
    int roll;
    String name;
    float marks;

    //non parametrized constructor
    Student () {
        this.roll = 19;
        this.name = "Saurav Jamadar";
        this.marks = 87.5f;
    }

    //parametrized constructor
    //Student pavan = new Student(56,"Pavan",78.8f);
    //now here,'this' is replaced by pavan
    Student (int roll,String name,float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    //copy constructor : Constructor that copies data from another Student object
    Student (Student other) {
        this.roll = other.roll;
        this.name = other.name;
        this.marks = other.marks;
    }
}



//Student2 class
class Student2 {
    int roll;
    String name;
    float marks;


    //something interesting: You can actually call another constructor using this constructor
    Student2 () {
        //Internally it is something like : new Student2(0,"Default",100.0f);
        this (0,"Default",100.0f);
    }

    public Student2(int roll, String name, float Score) {
        this.roll = roll;
        this.name = name;
        this.marks = Score;
    }
}
