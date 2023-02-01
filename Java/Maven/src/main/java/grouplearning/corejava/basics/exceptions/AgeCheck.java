package grouplearning.corejava.basics.exceptions;

public class AgeCheck {
    static void ageCheck(int age) throws  AgeException{
        if(age > 180){
            throw new AgeException("This person is too old");
        }
    }

}
