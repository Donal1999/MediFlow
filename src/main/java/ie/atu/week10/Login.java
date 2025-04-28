package ie.atu.week10;

import java.sql.*;
import java.util.Scanner;

public class Login {

    public boolean checkUser(String username, String password){

        String sql = "SELECT password FROM users WHERE username = ?";

        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediflow", "root", "password")){
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, username );

            try(ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String storedPassword = rs.getString("password");
                    System.out.println("welcome");
                    return password.equals(storedPassword);

                } else {
                    System.out.println("no user found");
                    return false;

                }
            }
        }
        catch(Exception e){
                System.err.println("Database error: " + e.getMessage());
                return false;
            }
        }
    }
