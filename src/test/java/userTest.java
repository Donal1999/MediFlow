package ie.atu.week10;

public class userTest {
    public static void main(String[] args) {
        // Create a sample user (e.g., already "registered")
        User user = new User(101, "adminUser", "pass123", "Admin");

        // Simulate login credentials entered by someone
        String enteredUsername = "adminUser";
        String enteredPassword = "pass123";

        // Authentication logic
        if (enteredUsername.equals(user.getUsername()) && enteredPassword.equals(user.getPassword())) {
            System.out.println("Login successful!");
            user.displayUser(); // Optional: show user info
        } else {
            System.out.println("Login failed! Invalid username or password.");
        }
    }
}
