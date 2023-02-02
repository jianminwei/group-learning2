package grouplearning.corejava.basics.collections;

public class Cat {
    private String color;
    private int age;

    public Cat(String color, int age) {
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public String getColor(){
        return color;
    }

    public int getAge(){
        return age;
    }

    public void setColor(String c){
        this.color = c;
    }

    public void setAge(int a){
        this.age = a;
    }
}
