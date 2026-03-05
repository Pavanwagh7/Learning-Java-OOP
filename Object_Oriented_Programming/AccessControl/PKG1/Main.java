package Object_Oriented_Programming.AccessControl.PKG1;

public class Main {
    public static void main(String[] args) {
        Human pavan= new Human ("123@xyz","Sleeping late","Secret_01","Pavan Wagh");

        //System.out.println(pavan.password);      //not accesible : varibale is private
        System.out.println(pavan.habbit);          //variable is default can be accesed in same package in another class
        System.out.println(pavan.family_secrete);  //variable is protected can be accessed in same package in another class
        System.out.println(pavan.name);            //variable is public can be accessed everywhere
    }
}
