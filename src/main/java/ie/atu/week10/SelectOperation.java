package ie.atu.week10;

import java.sql.*;

public class SelectOperation {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mediflow";
        String username = "root";
        String password = "password";

        String selectSQL = "SELECT id, name, age, diagnosis, contactNumber FROM patients";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSQL)) {

            while (resultSet.next()) {
                int patientID = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String diagnosis = resultSet.getString("diagnosis");
                String contactNumber = resultSet.getString("contactNumber");

                System.out.println("Patient ID: " + patientID +
                        ", Name: " + name +
                        ", Age: " + age +
                        ", Diagnosis: " + diagnosis +
                        ", Contact Number: " + contactNumber);
            }
        } catch (SQLException e) {
            System.out.println("Select operation failed.");
            e.printStackTrace();
        }
    }
}





