package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC_select implements SqlConstants{
    public static void main(String[] args) {
        System.out.println(selectAllStudents());
    }

    static List<Student> selectAllStudents(){
        try (Connection connection = DriverManager.getConnection(URL_STUDENTS, USER_NAME, PASSWORD)) {
            PreparedStatement statementSelect = connection.prepareStatement(
                    "select * from students");
            ResultSet resultSet = statementSelect.executeQuery();
            List<Student> studentList = new ArrayList<>();
            while (resultSet.next()){
                Student student = new Student();
                student.setId(resultSet.getLong(1));
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString(3));
                student.setAvgGrade(resultSet.getDouble(4));
                studentList.add(student);
            }
            statementSelect.close();
            resultSet.close();
            return studentList;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("smth wrong");
            return null;
        }
    }
}
