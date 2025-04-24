import ie.atu.week10.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class userTest {
    @Test
    void testUserConstructorAndGetters() {
        User user = new User(1, "Anna_Pierce", "password123", "Doctor");
        assertEquals(1, user.getUserID());
        assertEquals("Anna_Pierce", user.getUsername());
        assertEquals("password123", user.getPassword());
        assertEquals("Doctor", user.getRole());
    }

    @Test
    void testSetUsername() {
        User user = new User(2, "Sean_Burke", "apples456", "Receptionist");
        user.setUsername("new_username");
        assertEquals("new_username", user.getUsername());
    }

    @Test
    void testSetPassword() {
        User user = new User(3, "Mary_Ronan", "mary1999", "Admin");
        user.setPassword("newPassword123");
        assertEquals("newPassword123", user.getPassword());
    }

    @Test
    void testSetRole() {
        User user = new User(4, "Colm_Roche", "pass", "Doctor");
        user.setRole("Admin");
        assertEquals("Admin", user.getRole());
    }
}
