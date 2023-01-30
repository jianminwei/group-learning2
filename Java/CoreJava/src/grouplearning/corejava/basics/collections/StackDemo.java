package grouplearning.corejava.basics.collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String args[]){
        Stack<String> people = new Stack<>();

        people.push("Foo"); //["Foo"]
        people.push("Bar"); //["Foo", "Bar"]
        people.push("Joe"); //["Foo", "Bar", "Joe"]
        people.pop(); //removes the last element
        people.push("Doe"); //["Foo", "Bar", "Doe"]

        System.out.println("Stack elements: ");
        while (!people.empty()) {
            System.out.println(people.pop());
        }

    }
}
