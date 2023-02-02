package grouplearning.corejava.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person = new Person();

    @Test
    void getFirstName() {
        person.setFirstName("Foo");
        assertEquals("Foo", person.getFirstName());
    }


    @Test
    void getLastName() {
        person.setLastName("Bar");
        assertEquals("Bar", person.getLastName());
    }


    @Test
    void getFullName() {

        person.setFirstName("Foo");
        person.setLastName("Bar");
        assertEquals("Foo Bar", person.getFullName());

    }
}