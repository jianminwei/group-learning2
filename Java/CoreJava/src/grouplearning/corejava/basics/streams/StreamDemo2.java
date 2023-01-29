package grouplearning.corejava.basics.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {

        List <Integer> integers = new ArrayList<>();

        for(int i=1; i <= 10; i++ ) {
            integers.add(i);
        }

        /**
         * use map in the stream.
         */
        //integers.stream().map(i -> i * i).forEach(e -> System.out.println(e));

        /**
         * Use filter in the stream
         */
        //integers.stream().filter(i -> i < 5).forEach(e -> System.out.println(e));

        /**
         * Use collect
         */
//        List<Integer> filteredIntegers =  integers.stream().filter(i -> i < 5).collect(Collectors.toList());
//
//        //use foreach to print out the integers
//        for(Integer i : filteredIntegers) {
//            System.out.println(i);
//        }
//
//        //use stream to print out the integers
//        filteredIntegers.stream().forEach(e -> System.out.println(e));

    }
}
