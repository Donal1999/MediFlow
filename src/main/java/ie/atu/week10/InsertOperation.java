package ie.atu.week10;

import java.sql.*;


public class InsertOperation {
    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");

        try {
            conn.setAutoCommit(false);

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO patients (patientID, name, age, contactNumber) VALUES ?, ?");
            stmt.setInt(1, 101);
            stmt.setString(2, "John Doe");
            stmt.setInt(3, 45);
            stmt.setString(4, "089 123 4567");
            stmt.executeUpdate();

            conn.commit();

            System.out.println("Insert operation completed successfully.");
        } catch (SQLException ex) {
            conn.rollback();
            System.out.println("Insert operation failed.");
            ex.printStackTrace();
        } finally {
            conn.setAutoCommit(true);
        }

        conn.close();
    }

    private static int getLastInsertId(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT LAST_INSERT_ID()");
        rs.next();
        int id = rs.getInt(1);
        rs.close();
        stmt.close();
        return id;
    }
}
