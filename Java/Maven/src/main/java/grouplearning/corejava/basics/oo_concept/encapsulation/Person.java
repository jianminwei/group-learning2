package grouplearning.corejava.basics.oo_concept.encapsulation;

public class Person {

    /**
     * Properties are private. They are not visible to the outside.
     * They are encapsulated inside the class.
     */
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    /**
     * getFullName() can be implemented differently. How is it implemented
     * is up to the designer. The implementation details are hidden from the user.
     */
//    public String getFullName() {
//        return this.firstName + ' ' + this.lastName;
//    }

    /**
     * Another way to implement getFullName()
     */
    public String getFullName() {
        return this.getFirstName() + ' ' + this.getLastName();
    }


}
