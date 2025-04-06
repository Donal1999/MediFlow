package ie.atu.week10;

public class doctorTest {
    public static void main(String[] args) {
        // Create a Doctor object
        Doctor doc = new Doctor(1, "Dr. Acton", "Cardiology", "123-456-7890");

        // Display the doctor's information
        doc.displayDoctor();

        // Test getters
        System.out.println("Testing Getters:");
        System.out.println("ID: " + doc.getDoctorID());
        System.out.println("Name: " + doc.getName());
        System.out.println("Specialization: " + doc.getSpecialization());
        System.out.println("Contact: " + doc.getContactNumber());

        // Test setters
        doc.setName("Dr. Tommy Acton");
        doc.setSpecialization("Neurology");
        doc.setContactNumber("987-654-3210");

        // Display updated info
        System.out.println("\nAfter Updates:");
        doc.displayDoctor();
    }
}
