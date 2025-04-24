package ie.atu.week10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Connection to database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediflow", "root", "password");

        // Create a patient
        Patient patient = new Patient(1, "Sean Sheehan", 34, "Male", "087 906 2587");
        patient.displayPatient();

        // Create a doctor
        Doctor doctor = new Doctor(101, "Mary Daly", "Neurology",  "087 906 2587");
        doctor.displayDoctor();

        // Schedule an appointment
        Appointment appointment = new Appointment(patient.getPatientID(), doctor.getDoctorID(), new Date());
        appointment.displayAppointment();

        // Create a bill
        Billing bill = new Billing(1001, patient.getPatientID(), 250.00, "Unpaid");
        bill.displayBill();

        // Create a user
        User user = new User(5001, "reception1", "pass123", "Receptionist");
        user.displayUser();

        // Simulate a basic login check
        String inputUsername = "reception1";
        String inputPassword = "pass123";

        System.out.println("\n--- Login Attempt ---");
        if (inputUsername.equals(user.getUsername()) && inputPassword.equals(user.getPassword())) {
            System.out.println("Login successful! Welcome " + user.getRole());
        } else {
            System.out.println("Login failed. Invalid credentials.");
        }
    }
}

