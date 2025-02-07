package lambda;

public class StudentCheckAge implements StudentCheck{
    @Override
    public boolean check(Student s) {
        return s.getAge()>20;
    }
}
