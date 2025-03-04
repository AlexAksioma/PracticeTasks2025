package db;

import java.sql.*;
import java.util.Scanner;

public class JDBC_update implements SqlConstants{
    public static void main(String[] args) {
        Student student = new Student(5L, "Sveta", "Svetlakova", 9.55);
        try (Connection connection = DriverManager.getConnection(URL_STUDENTS, USER_NAME, PASSWORD)) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter name --> ");
            String enteredName = scanner.nextLine();

//            String sqlQuarry = "update students set avg_grade = 3.33 where name ='"+enteredName+"'";
//            Statement statementUpdate = connection.prepareStatement(sqlQuarry);
//            statementUpdate.executeUpdate(sqlQuarry);
//            statementUpdate.close();

            //"update students set avg_grade = 5.55 where name ='Ivan';
            //"update students set avg_grade = 5.55 where name ='Ivan' or '1'='1';
            PreparedStatement statementUpdate1 = connection.prepareStatement(
                    "update students set avg_grade = 5.55 where name = ?");
            statementUpdate1.setString(1, enteredName);
            System.out.println("--> " + statementUpdate1.executeUpdate());
            statementUpdate1.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("smth wrong");
        }
    }
}
