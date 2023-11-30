package Smart_Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Hospital {
    private List<Patient> patients;

    public Hospital() {
        patients = new ArrayList<>();
    }

    public void admitPatient(Patient patient) {
        patients.add(patient);
        System.out.println(patient.getName() + " admitted to the hospital.");
    }

    public void displayPatients() {
        System.out.println("List of Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}

