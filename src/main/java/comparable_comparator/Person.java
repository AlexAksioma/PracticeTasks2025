package comparable_comparator;

public class Person implements Comparable<Person>{

    private int age;
    private String name;
    private int weight;

    @Override
    public int compareTo(Person anotherPerson) {  // person.compareTo(anotherPerson)
        return this.age - anotherPerson.age;      // -1 person<anotherPerson, +1 person>anotherPerson
    }                                             // 0 person==anotherPerson

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Person(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
