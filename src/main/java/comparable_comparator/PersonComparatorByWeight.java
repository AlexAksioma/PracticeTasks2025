package comparable_comparator;

import java.util.Comparator;

public class PersonComparatorByWeight implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getWeight(), p2.getWeight());
    }
}
