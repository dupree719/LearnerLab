import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable{
    List<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }
    public Person findById(long id) {

        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }
    public boolean contains(Person person) {

        if (personList.contains(person)) {
            return true;
        }

        return false;
    }
    public void remove(Person person){
        personList.remove(person);
    }
    public void removePersonById(long id) {

        for (Person p : personList) {
            if (p.getId() == id) {
                personList.remove(p);
            }
        }
    }
    public void removeAll() {

        personList.removeAll(personList);

    }

    public Integer count() {

        return personList.size();
    }

    public Object[] toArray() {

        return personList.toArray();
    }


    @Override
    public Iterator iterator() {
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        return null;
    }


}
