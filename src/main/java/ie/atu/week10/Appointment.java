package ie.atu.week10;

import java.util.Date;

public class Appointment {
    private int patientID;
    private int doctorDr;
    private Date appointmentDate;

    //Constructor
    public Appointment(int patientID, int doctorDr, Date appointmentDate) {
        this.patientID = patientID;
        this.doctorDr = doctorDr;
        this.appointmentDate = appointmentDate;
    }

    // Getters+Setters
    public int getPatientID() { return patientID; }
    public int getDoctorID() { return doctorDr; }

    public Date getAppointmentDate() { return appointmentDate; }
    public void setAppointmentDate(Date appointmentDate) { this.appointmentDate = appointmentDate; }

    //display appointment details
    public void displayAppointment() {
        System.out.println("Date: " + appointmentDate + ", Patient ID: " + patientID + ", Doctor ID: " + doctorDr);
    }
}

