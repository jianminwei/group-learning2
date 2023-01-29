package grouplearning.corejava.basics.oo_concept.polymorphism.case1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeTest {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Random random = new Random();

        /**
         * Instantiate 15 different Shapes (Square, Circle, Triangle)
         * randomly and put them in the "shapes" ArrayList.
         */
        for (int i = 0; i < 15; i++) {
            int r = random.nextInt(100);
            Shape s;
            if ( r < 33) {
                s = new Circle();
            } else if (r < 66) {
                s = new Square();
            } else {
                s = new Triangle();
            }
            shapes.add(s);
        }

        /**
         * To me, this is polymorphism. Below Shape has different forms (Square, Circle, Triangle)
         * The same Shape s behaves differently (different forms) at runtime depends on the underneath
         * object.
         */
        for(Shape s : shapes) {
            s.draw();
        }
    }
}
