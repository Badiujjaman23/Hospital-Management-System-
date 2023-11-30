package Smart_Hospital;


import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("Hospital Management System");
            System.out.println("1. Admit Patient");
            System.out.println("2. Display Patients");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.next();
                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter patient disease: ");
                    String disease = scanner.next();

                    Patient patient = new Patient(name, age, disease);
                    hospital.admitPatient(patient);
                    break;
                case 2:
                    hospital.displayPatients();
                    break;
                case 3:
                    System.out.println("Exiting Hospital Management System. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

