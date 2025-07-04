/*Hospital Management System example that clearly highlights parameters and arguments using a real-life function like admitting a patient. */

public class HospitalManagement {

    // Parameters: placeholders used in function definition
    static void admitPatient(String name, int age, String disease) {
        System.out.println("\nAdmitting Patient...");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Disease : " + disease);
    }

    public static void main(String[] args) {
        //  Arguments: actual values passed to the function
        admitPatient("Shashank", 28, "Flu");        // arguments
        admitPatient("Aditi", 35, "Fracture");      // arguments
    }
}
