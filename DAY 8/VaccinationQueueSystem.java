import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class VaccinationQueueSystem {

    public static void main(String[] args) {
        Queue<String> vaccinationQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=== Vaccination Queue Management System ===");

        do {
            System.out.println("\n1. Add Patient to Queue");
            System.out.println("2. Call Next Patient");
            System.out.println("3. View Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    vaccinationQueue.add(name);
                    System.out.println(name + " added to the queue.");
                    break;

                case 2:
                    if (vaccinationQueue.isEmpty()) {
                        System.out.println("No patients in queue.");
                    } else {
                        String nextPatient = vaccinationQueue.poll();
                        System.out.println("Calling patient: " + nextPatient);
                    }
                    break;

                case 3:
                    if (vaccinationQueue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Current Vaccination Queue:");
                        for (String patient : vaccinationQueue) {
                            System.out.println("- " + patient);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting system. Stay safe!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
