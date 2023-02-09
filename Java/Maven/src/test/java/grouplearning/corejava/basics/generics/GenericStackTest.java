package grouplearning.corejava.basics.generics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericStackTest {
    private GenericStack<Integer> stack;

    @BeforeEach
    void init() {
<<<<<<< HEAD
        stack = new GenericStack<Integer>(100);
=======
        stack = new GenericStack<>(100);
>>>>>>> DEV-02-06
    }

    @Test
    void emptyStack() {
        assertTrue(stack.isStackEmpty(), () -> "Stack should be empty.");
    }

    @Test
    void stackHasTwoIntegers() {
        stack.push(10);
        stack.push(20);

        assertEquals(2, stack.size(), () -> "Stack should have 2 integers.");
    }

    @Test
    void stackHasOneInteger() {
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.pop());
        assertEquals(1, stack.size(), () -> "Stack should have 1 integer.");
    }

    @Test
    void stackIsFull() {

        for(int i = 1; i <= 100; i++) {
            stack.push(i);
        }

        assertTrue(stack.isStackFull(), ()-> "Stack should be full.");
    }

}