import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person person;

    @BeforeEach
    public void setUp() {
        person = new Person(1, "Isaiah");
    }

    @Test
    public void testConstructor(){
        // When
        long personId = person.getId();
        String personName = person.getName();
        // Then
        Assert.assertEquals(person.getId(), personId);
        Assert.assertEquals(person.getName(),personName);

    }
    @Test
    public void testSetName(){
        person.setName("Replace");
        assertEquals("Replace", person.getName());
    }

}