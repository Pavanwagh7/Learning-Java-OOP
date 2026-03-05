package Object_Oriented_Programming.AccessControl.PKG2;

import Object_Oriented_Programming.AccessControl.PKG1.Human;

public class Main extends Human {

    public Main(String pass, String habbit, String secret, String name) {
        super(pass, habbit, secret, name);
    }

    public static void main(String[] args) {

        Human kunal = new Human("xyz","abc","sec02","Kunal");
        //System.out.println(kunal.password);      // varibale is private can not be accessed
        //System.out.println(kunal.habbit);        // variable is default cannot be accessed in another package

        Main m = new Main("xyz","abc","sec02","Kunal");
        System.out.println(m.family_secrete);      //in another package only subclass can access protected fields

        System.out.println(kunal.name);            //varible is public can be accessed every where
    }
}

