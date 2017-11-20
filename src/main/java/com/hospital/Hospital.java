package com.hospital;

public class Hospital {

    public static final int MAX_COUNT_OF_PATIENTS = 10;
    private Patient[] patients;
    private int currentPatient;

    public Hospital() {
        patients = new Patient[MAX_COUNT_OF_PATIENTS];
        currentPatient = 0;
    }

    public void addPatient(Patient patient) {
        if (currentPatient < MAX_COUNT_OF_PATIENTS) {
            patients[currentPatient] = patient;
            currentPatient++;
        } else {
            System.out.println("Nie można zapisać więcej pacjentów");
        }
    }

    public void showPatients() {
        for (int i = 0; i < currentPatient; i++) {
            System.out.println(patients[i].getFirstName() + " " + patients[i].getLastName() +
                    " " + patients[i].getPesel());
        }
    }
}

