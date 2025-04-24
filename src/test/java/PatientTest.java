package ie.atu.week10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PatientTest {

    @Test
    public void testPatientCreation() {
        Patient patient = new Patient(1, "Sean Sheehan", 34, "Male", "087 906 2587");
        assertEquals(1, patient.getPatientID());
        assertEquals("Sean Sheehan", patient.getName());
        assertEquals(34, patient.getAge());
        assertEquals("087 906 2587", patient.getContactNumber());
    }

    @Test
    public void testPatientSetters() {
        Patient patient = new Patient(1, "Sean Sheehan", 34, "Male", "087 906 2587");
        patient.setName("John Doe");
        patient.setAge(35);
        patient.setContactNumber("089 123 4567");

        assertEquals("John Doe", patient.getName());
        assertEquals(35, patient.getAge());
        assertEquals("089 123 4567", patient.getContactNumber());
    }
}

