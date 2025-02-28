package comparable_comparator;

import java.util.Comparator;

public class PersonComparatorByNameAge implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int result = p1.getName().compareTo(p2.getName());
        if (result != 0)
            return result;
        else
            return p1.getAge() - p2.getAge();
    }
}
