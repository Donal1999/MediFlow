package ie.atu.week10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class AppointmentTest {

    @Test
    public void testAppointmentCreation() {
        Appointment appointment = new Appointment(1, 1, new Date());
        assertEquals(1, appointment.getPatientID());
        assertEquals(1, appointment.getDoctorID());
        assertNotNull(appointment.getAppointmentDate());
    }

    @Test
    public void testAppointmentSetter() {
        Appointment appointment = new Appointment(1, 1, new Date());
        Date newDate = new Date(123456789L);
        appointment.setAppointmentDate(newDate);

        assertEquals(newDate, appointment.getAppointmentDate());
    }
}

