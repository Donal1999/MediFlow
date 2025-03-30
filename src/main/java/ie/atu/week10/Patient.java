package ie.atu.week10;

public class Patient {
    private int patientID;
    private String name;
    private int age;
    private String contactNumber;

    //Constructor
    public Patient(int patientID, String name, int age, String gender, String contactNumber) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
    }

    // Getters+Setters
    public int getPatientID() { return patientID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    // display patient details
    public void displayPatient() {
        System.out.println("Patient ID: " + patientID + ", Name: " + name + ", Age: " + age +
                ", Contact: " + contactNumber);
    }}
