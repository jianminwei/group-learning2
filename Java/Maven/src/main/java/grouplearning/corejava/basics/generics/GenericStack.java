package grouplearning.corejava.basics.generics;

public class GenericStack <T>{
    private int stackSize;
    private T[] stackArray;
    private int top;

    public GenericStack(int stackSize) {
        this.stackSize = stackSize;
        this.stackArray = (T[]) new Object[stackSize];
        this.top = -1;
    }

    public boolean isStackFull() {
        return top == stackSize - 1;
    }

    public boolean isStackEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void push ( T t) {
        if(! isStackFull()) {
            this.stackArray[++top] = t;
        } else  {
            System.out.println("Stack is full");
        }
    }

    public T pop() {
        if(top >= 0) {
            return stackArray[top--];
        }else {
            System.out.println("Stack is empty");
            return null;
        }
    }
}
