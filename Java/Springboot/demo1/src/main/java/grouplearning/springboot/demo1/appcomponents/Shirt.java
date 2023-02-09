package grouplearning.springboot.demo1.appcomponents;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Shirt {

    /**
     * Property value can be injected from the application.properties file
     */
    @Value("${shirt.color}")
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "color='" + color + '\'' +
                '}';
    }
}
