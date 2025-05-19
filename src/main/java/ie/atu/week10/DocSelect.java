package ie.atu.week10;

import java.sql.*;

public class DocSelect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mediflow";
        String username = "root";
        String password = "password";

        String selectSQL = "SELECT id, name, specialization, contactNumber FROM doctor";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSQL)) {

            while (resultSet.next()) {
                int patientID = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String specialization = resultSet.getString("specialization");
                String contactNumber = resultSet.getString("contactNumber");

                System.out.println("Patient ID: " + patientID +
                        ", Name: " + name +
                        ", Specialization: " + specialization +
                        ", Contact Number: " + contactNumber);
            }
        } catch (SQLException e) {
            System.out.println("Select operation failed.");
            e.printStackTrace();
        }

    }
}
