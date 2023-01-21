package grouplearning.corejava.basics.property_vs_variable;

public class Variable {
    public static void main(String[] args) {

        // System.out.println(i); this is error

        int i =0;
        System.out.println(i);

        {
            int j = 1;
            System.out.println(j);
            System.out.println(i);
        }

    }
}
