package grouplearning.corejava.basics.property_vs_variable;

public class Property {

    /**
     * In class, a variable is called Property.
     * Property scope is defined by Access Modifier.
     * Properties are hoisted (you can use it before you define it).
     *
     * Access Modifier
     *      public: the public property can be accessed anywhere.
     *      protected: the protected property can be accessed by itself and sub-classes.
     *      private: the property can be accessed by itself only.
     *      default (no access modifier): the property can be accessed by itself and anywhere within the package.
     *
     * Access Modifier are applied to method the same way.
     */
    public String name;
    private int age;
    protected String sex;

    String address;   // This is default no access modifier, address scope is
                      // package "grouplearning.corejava.basics.property_vs_variable" level


    public String getName() {   //this getName() method can be accessed anywhere.
        return this.name;
    }

    private void increaseAge() { //this method can only be accessed within Property class.
        this.age = this.age++;
    }

    protected String sayHello() {  //this method can be accessed by this class and sub-classes.
        return "Hello";
    }

    String sing() {  // this method can be accessed within "grouplearning.corejava.basics.property_vs_variable" package.
        return "I am singing.";
    }

}
