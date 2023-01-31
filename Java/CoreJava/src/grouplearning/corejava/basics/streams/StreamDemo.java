package grouplearning.corejava.basics.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("is");
        list.add("pretty");
        list.add("cool");

        /**
            function (x) = {
                System.out.println(x);
            }

            (x) -> {
                System.out.println(x);
            }

         */
        list.stream().forEach(e -> System.out.println(e));

        /**
         * Or this way
         * You can think of this expression is to call
         * the println method with the argument from the stream.
         */
        //list.stream().forEach(System.out::println);
    }
}
