package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentMethods {
    void checkStudent(ArrayList<Student> list, StudentCheck studentCheck) {
        for (Student st : list) {
            if (studentCheck.check(st))
                System.out.println(st);
        }
    }

    //=====================================
    void printStudents(ArrayList<Student> list, int age) {
        for (Student st : list) {
            if (st.getAge() > age)
                System.out.println(st);
        }
    }

    void printStudents(ArrayList<Student> list, double grade) {
        for (Student st : list) {
            if (st.getAverageGrade() > grade)
                System.out.println(st);
        }
    }

    void printStudents(ArrayList<Student> list, int age, double grade) {
        for (Student st : list) {
            if (st.getAge() > age && st.getAverageGrade() > grade)
                System.out.println(st);
        }
    }
}

class StudentTest {
    public static void main(String[] args) {
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

        StudentMethods studentMethods = new StudentMethods();
        studentMethods.printStudents(studentList, 20);
        System.out.println("=================================");
        studentMethods.printStudents(studentList, 8.);
        System.out.println("=================================");
        studentMethods.printStudents(studentList, 20, 8.);
        System.out.println("==================================================");
        //StudentCheckAge studentCheckAge = new StudentCheckAge();

//=======================================================================================================
        studentMethods.checkStudent(studentList, new StudentCheck() { //anonim class
            @Override
            public boolean check(Student s) {
                return s.getAge() > 20;
            }
        });
        System.out.println("---------------------------------");
        studentMethods.checkStudent(studentList, (Student s) -> {
            return s.getAge() > 20;
        });
        studentMethods.checkStudent(studentList, (s) -> s.getAge() > 20);
        System.out.println("=================================");
        studentMethods.checkStudent(studentList, new StudentCheck() {
            @Override
            public boolean check(Student s) {
                return s.getAverageGrade() > 8.;
            }
        });
        System.out.println("---------------------------------");
        studentMethods.checkStudent(studentList, (s) -> s.getAverageGrade() > 8.);
        System.out.println("=================================");
        studentMethods.checkStudent(studentList, new StudentCheck() {
            @Override
            public boolean check(Student s) {
                return s.getAge() > 20 && s.getAverageGrade() > 8.;
            }
        });
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        studentMethods.checkStudent(studentList, (s) -> s.getName().equals("Ivan"));
        //studentMethods.checkStudent(studentList, (s) -> s.getName());   wrong return type
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        studentMethods.checkStudent(studentList, (s) ->
                {
                    if (s.getAge() > 20) {
                        System.out.println("age>20 "+s);
                        return true;
                    } else {
                        System.out.println("age=<20 "+s);
                        return false;
                    }
                }
        );

        //========================new lesson ===============================================
        System.out.println("========================new lesson ===============================================");
//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.getAge() - s2.getAge();
//            }
//        });
        Collections.sort(studentList, (s1, s2) -> s1.getAge() - s2.getAge());
        for (Student s:studentList) {
            System.out.println(s);
        }
        Collections.sort(studentList, (s1, s2) -> ((int)s1.getAverageGrade() - (int)s2.getAverageGrade()));
        for (Student s:studentList) {
            System.out.println(s);
        }
    }
}
