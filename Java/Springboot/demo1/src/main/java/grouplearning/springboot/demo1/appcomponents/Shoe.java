package grouplearning.springboot.demo1.appcomponents;

import org.springframework.stereotype.Component;

@Component
public class Shoe {
    private String color;

    public Shoe() {
        this.color = "Black";
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "color='" + color + '\'' +
                '}';
    }
}
