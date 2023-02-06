package grouplearning.corejava.basics.generics;

public class GenericDemo <T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
