package Object_Oriented_Programming.AccessControl.PKG2;

import Object_Oriented_Programming.AccessControl.PKG1.Human;

public class Main2 {
    public static void main(String[] args) {
        Human kiran = new Human("ABC","pqr","sec03","Kiran");

        //System.out.println(kiran.password);       //private field cannot be accessed in another package
        //System.out.println(kiran.habbit);         //default field cannot be accessed in another package
        //System.out.println(kiran.family_secrete); //protected field is only accessed by the subclass in another package (Main2 does not 'extends' Human)
        System.out.println(kiran.name);             //public filed can be accesed everywhere
    }
}
