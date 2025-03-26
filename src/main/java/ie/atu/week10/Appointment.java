package ie.atu.week10;

import java.util.Date;

public class Appointment {
    private int patientID;
    private int doctorID;
    private Date appointmentDate;

    //Constructor
    public Appointment(int patientID, int doctorID, Date appointmentDate) {
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.appointmentDate = appointmentDate;
    }

    // Getters+Setters
    public int getPatientID() { return patientID; }
    public int getDoctorID() { return doctorID; }

    public Date getAppointmentDate() { return appointmentDate; }
    public void setAppointmentDate(Date appointmentDate) { this.appointmentDate = appointmentDate; }

    //display appointment details
    public void displayAppointment() {
        System.out.println("Patient ID: " + patientID + ", Doctor ID: " + doctorID + ", Date: " + appointmentDate);
    }
}

