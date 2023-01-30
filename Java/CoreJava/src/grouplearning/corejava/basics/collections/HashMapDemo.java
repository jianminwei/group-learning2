package grouplearning.corejava.basics.collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String args[]){
        HashMap<Integer, String> hmap = new HashMap<>();

        //key and value pairs
        hmap.put(101, "Chaitanya");
        hmap.put(105, "Derick");
        hmap.put(111, "Logan");
        hmap.put(120, "Paul");

        //Note: hmap.keySet() return a Set.
        //      Set is iterable. So you can use foreach loop.
        for(int i : hmap.keySet()) {
            System.out.println("Key: " + i + " Value: " + hmap.get(i));
        }
    }
}
