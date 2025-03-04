package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_insert implements SqlConstants {

    public static void main(String[] args) {
        Student student = new Student(5L, "Sveta", "Svetlakova", 9.55);
        try (Connection connection = DriverManager.getConnection(URL_STUDENTS, USER_NAME, PASSWORD)) {
            PreparedStatement statementInsert = connection.prepareStatement(
                    "insert into students(name, surname, avg_grade) values (?, ?, ?)");
            statementInsert.setString(1, student.getName());
            statementInsert.setString(2, student.getSurname());
            statementInsert.setDouble(3, student.getAvgGrade());
            System.out.println("--> " + statementInsert.executeUpdate());
            statementInsert.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("smth wrong");
        }
    }
}
