package com.hospital;

import java.util.Scanner;

public class HospitalApp {

    public static final int EXIT = 0;
    public static final int ADD_PATIENT = 1;
    public static final int SHOW_PATIENTS = 2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();
        int option = 4;

        while (option != EXIT) {
            System.out.println("Dostępne opcje:");
            System.out.println("0 - Wyjdz z programu:");
            System.out.println("1 - Dopisz pacjenta");
            System.out.println("2 - Wyświetl listę pacjentów:");
            option = scanner.nextInt();

            switch (option) {
                case ADD_PATIENT:
                    Patient patient = new Patient();
                    System.out.println("Imię: ");
                    patient.setFirstName(scanner.nextLine());
                    scanner.nextLine();
                    System.out.println("Nazwisko: ");
                    patient.setLastName(scanner.nextLine());
                    System.out.println("PESEL: ");
                    patient.setPesel(scanner.nextLine());
                    hospital.addPatient(patient);
                    break;
                case SHOW_PATIENTS:
                    hospital.showPatients();
                    break;
                case EXIT:
                    System.out.println("Zamykam program");
                    break;
                default:
                    System.out.println("Podana opcja nie istnieje");
            }
        }
        scanner.close();
    }
}