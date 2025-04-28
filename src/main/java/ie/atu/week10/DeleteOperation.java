package ie.atu.week10;

import java.sql.*;

public class DeleteOperation {
    public static boolean delete(String tableName, String idColumn, int id) {
        String sql = "DELETE FROM " + tableName + " WHERE " + idColumn + " = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            System.err.println("Error deleting record: " + e.getMessage());
            return false;
        }
    }
}
