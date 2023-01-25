package grouplearning.corejava.basics.property_vs_variable;

public class Variable {
    public static void main(String[] args) {

        /**
         * In Java, variables scope are "block level".
         * A block is {} (within curly bracket).
         *
         * Variables are not hoisted.
         */

        // System.out.println(i); this is error, you can't use i before it's declared.

        int i =0;
        System.out.println(i);

        {
            int j = 1;   // j's scope is within this curly bracket.
            System.out.println(j);

            /**
             * Outside scope can be visible to inside scope, so i is visible here.
             */
            System.out.println(i);

            {
                int k = 2;

                /**
                 * Outside i, j are visible here.
                 */
                System.out.println(i);
                System.out.println(j);
                System.out.println(k);
            }
        }

        //System.out.println(j);  //this is error, j is not visible.

    }
}
