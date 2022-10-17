import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    @Test
    void testAdd(){
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person(03, "Brian");
        Person person2 = new Person(04, "Kevin");

        personList.add(person1);
        personList.add(person2);

        assertTrue(personList.contains(person1));

    }
    @Test
    public void testRemove() {

        List<Person> personList = new ArrayList<>();
        Person person = new Person(9, "Isaiah");

        personList.remove(person);

        assertFalse(personList.contains(person));
    }
    @Test
    public void findById() {
        Student jeffrey = new Student(2,"Jeffrey", 4);

        People people = new People();

        people.add(jeffrey);


        assertEquals(jeffrey,people.findById(2));

    }


}