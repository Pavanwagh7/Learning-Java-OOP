package Object_Oriented_Programming.AccessControl.PKG1;

/**
 private - this property is accessible only in the class in which it is defined (within the same class)
 default or no modifier - this property can be accessed within the same package only
 protected - this property is accesible within the same class,package(same package - subclass) and in the subclass in different package
 public - this property can be accessed everywhere
 */

public class Human {
    private String password;         // e.g. pawanwagh_7
    //Default Variable
    String habbit;                   // e.g. Sleeping late in the night
    protected String family_secrete; // e.g. Secret_01
    public String name;              // e.g. Pavan Shantilal Wagh

    /** all above veraibles declared are accessible everywhere in this class */

    public Human (String pass,String habbit,String secret,String name) {
        this.password = pass;
        this.habbit = habbit;
        this.family_secrete = secret;
        this.name = name;
    }

}
