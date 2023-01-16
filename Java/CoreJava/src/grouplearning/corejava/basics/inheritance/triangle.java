package grouplearning.corejava.basics.inheritance;

public class triangle extends shape {
    private int length;
    private int height;

    public triangle(int length, int height) {
        this.length = length;
        this.height = height;
        this.setName("Triangle");
        this.setSides(3);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    @Override
    public int calcArea() {
        return (length*height)/2;
    }
}
