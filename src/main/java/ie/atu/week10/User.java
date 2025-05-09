package ie.atu.week10;

import java.util.Scanner;

public class User {
    private int userID;
    private String username;
    private String password;
    private String role; // "Admin", "Doctor", "Receptionist"

    // Constructor
    public User(int userID, String username, String password, String role) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters and Setters
    public int getUserID() { return userID; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    // Method to display user details
    public void displayUser() {
        System.out.println("User ID: " + userID + ", Username: " + username + ", Role: " + role);
    }



}
