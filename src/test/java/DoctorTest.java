import ie.atu.week10.Doctor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoctorTest {
    @Test
    void testDoctorConstructorAndGetters() {
        Doctor doctor = new Doctor(101, "Dr. Jane Rooney", "Cardiology", "1234567890");
        assertEquals(101, doctor.getDoctorID());
        assertEquals("Dr. Jane Rooney", doctor.getName());
        assertEquals("Cardiology", doctor.getSpecialization());
        assertEquals("1234567890", doctor.getContactNumber());
    }

    @Test
    void testSetName() {
        Doctor doctor = new Doctor(102, "Dr. Smith", "Neurology", "0987654321");
        doctor.setName("Dr. Emily Smith");
        assertEquals("Dr. Emily Smith", doctor.getName());
    }

    @Test
    void testSetSpecialization() {
        Doctor doctor = new Doctor(103, "Dr. Khan", "General", "1122334455");
        doctor.setSpecialization("Pediatrics");
        assertEquals("Pediatrics", doctor.getSpecialization());
    }

    @Test
    void testSetContactNumber() {
        Doctor doctor = new Doctor(104, "Dr. Lynch", "Orthopedics", "5566778899");
        doctor.setContactNumber("6677889900");
        assertEquals("6677889900", doctor.getContactNumber());
    }
}

