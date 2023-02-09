package grouplearning.springboot.demo1.appcomponents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class Person {
    private static final Logger log = LoggerFactory.getLogger(Person.class);

    private String name;
    private int age;

    @Autowired
    private Shirt shirt;

    @Autowired
    private Shoe shoe;

    public Person() {
        log.info("Person is constructed.");
        this.setName("Foo");
        this.setAge(20);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Shirt getShirt() {
        return shirt;
    }

    public void setShirt(Shirt shirt) {
        this.shirt = shirt;
    }

    public Shoe getShoe() {
        return shoe;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shirt=" + shirt +
                ", shoe=" + shoe +
                '}';
    }
}
