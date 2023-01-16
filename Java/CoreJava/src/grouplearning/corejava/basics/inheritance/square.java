package grouplearning.corejava.basics.inheritance;

public class square extends shape{

    private int sidelen;

    public square(int sidelen) {
        this.sidelen = sidelen;
        this.setName("Square");
        this.setSides(4);
    }

    public int getSidelen() {
        return sidelen;
    }

    public void setSidelen(int sidelen) {
        this.sidelen = sidelen;
    }

    @Override
    public int calcArea() {
        return this.sidelen*this.sidelen;
    }
}
