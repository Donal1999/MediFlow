package ie.atu.week10;

import java.sql.*;

public class UpdateOperation {
    public static boolean updatePatient(int id, String name, int age, String diagnosis, String contactNumber) {
        String sql = "UPDATE patient SET name = ?, age = ?, diagnosis = ?, contactNmuber = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, diagnosis);
            stmt.setString(4, contactNumber);
            stmt.setInt(5, id);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            System.err.println("Error updating record: " + e.getMessage());
            return false;
        }
    }
    //test
    public static void main(String[] args) {
        boolean success = updatePatient(101, "John Doe Updated", 46, "Recovered", "089 765 4321");
        if (success) {
            System.out.println("Update operation completed successfully.");
        } else {
            System.out.println("Update operation failed.");
        }
    }
}
