package comparable_comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person(30, "Ivan", 67);
        Person person2 = new Person(20, "Petr", 77);
        Person person3 = new Person(35, "Petr", 88);
        Person person4 = new Person(30, "Ivan", 55);
        Person person5 = new Person(22, "Dasha", 45);
        Person[] people = {person1, person2, person3, person4, person5};
        System.out.println(Arrays.toString(people));
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        //=============================
        Comparator<Person> personComparatorWeight = new PersonComparatorByWeight();
        Arrays.sort(people, personComparatorWeight);
        System.out.println(Arrays.toString(people));
        //==============================
        Arrays.sort(people, new PersonComparatorByNameAge());
        System.out.println(Arrays.toString(people));
        System.out.println("================================================");
        //  p1 -> p2 -> p3 -> p4 .........
//        List<Person> people2 = new ArrayList<>();
//        for (Person p : people){
//            if(p.getAge()<31)
//                people2.add(p);
//        }
        List<Person> people1 = Arrays.stream(people)
                .filter(person -> person.getAge() < 31)
                .limit(2)
                .toList();
        System.out.println(people1);

        System.out.println("================================================");
        Arrays.stream(people)
                .filter(person -> person.getWeight() > 70)
                .forEach(System.out::println);
    }
}
