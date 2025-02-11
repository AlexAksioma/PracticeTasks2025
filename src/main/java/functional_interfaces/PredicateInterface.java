package functional_interfaces;

import lambda.Student;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> predicateInt = (i) -> i > 0;
        System.out.println(predicateInt.test(10));

        Predicate<String> predicateStr = str -> {
            return str.isBlank() || str == null || str.equals("str");
        };
        System.out.println(predicateStr.test("    "));
        System.out.println(predicateStr.test("str"));
        System.out.println(predicateStr.test("string"));
        //==================================================
        Student st1 = new Student("Petr", 22, 8.9);
        Student st2 = new Student("Maria", 25, 7.9);
        Student st3 = new Student("Ivan", 19, 8.1);
        Student st4 = new Student("Alex", 18, 7.3);
        Student st5 = new Student("Dasha", 20, 8.3);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println("==========================================================");
        studentsPredicate(studentList, s -> s.getAge() > 20);
        System.out.println("====================================");
        studentsPredicate(studentList, s -> s.getAverageGrade() < 8);
        System.out.println("====================================");
        studentsPredicate(studentList, s -> s.getName().contains("a"));
        System.out.println("====================================");
        studentsPredicate(studentList, s -> s.getName().contains("a") && s.getName().length()<5);
        System.out.println("====================================");
    }

    static void studentsPredicate(ArrayList<Student> list, Predicate<Student> predicate) {
        for (Student st : list) {
            if (predicate.test(st))
                System.out.println(st);
        }
    }
}
