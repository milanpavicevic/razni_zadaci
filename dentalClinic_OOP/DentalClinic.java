package dentalClinic_OOP;

import java.util.ArrayList;
import java.util.List;

public class DentalClinic {
	private String name;
	private int budget;
	List<Patient> patients;
	List<Dentist> doctors;

	public DentalClinic(String name) {
		this.name = name;
		budget = 100000;
		patients = new ArrayList<>();
		doctors = new ArrayList<>();
	}

	public void patientsList() {
		System.out.println("Patients list:");
		for (int i = 0; i < patients.size(); i++) {
			System.out.print((i + 1) + ". ");
			System.out.println(patients.get(i));
		}
//		System.out.println("\n");
	}

	public void chargeAmount(int amount, int patientsIndex) {
		int charge = amount - (2 * amount);
		if (amount > 0) {
			Patient chargePatient = patients.get(patientsIndex - 1);
			if (chargePatient.getWallet() < amount) {
				System.out.println("Patient "+ chargePatient + " doesn't have enough money.\nAmount is " + amount + " euros.");
				System.out.println("The amount will be charged by court procedure!");
			} else {
				budget += amount;
				chargePatient.setWallet(charge);
			}
		} else {
			System.out.println("The amount must be greater then zero!");
		}
	}

	public void doctorsList() {
		System.out.println("Doctors list:");
		for (int i = 0; i < doctors.size(); i++) {
			System.out.print((i + 1) + ". ");
			System.out.println(doctors.get(i));
		}
//		System.out.println("\n");
	}

	public void giveSalary(int doctorsIndex, int salary) {
		this.budget -= salary;
		Dentist doctorsSalary = doctors.get(doctorsIndex - 1);
		doctorsSalary.setWallet(salary);
	}

	public void addDentist(Person dentist) {
		doctors.add((Dentist) dentist);
	}

	public void removeDentist(Person dentist) {
		doctors.remove(dentist);

	}

	public void addPatient(Person patient) {
		patients.add((Patient) patient);
	}

	public void removePatient(Person patient) {
		patients.remove(patient);
	}

	public int getNoOfDentists() {
		return doctors.size();
	}

	public int getNoOfPatients() {
		return patients.size();
	}
	
	public int getBudget() {
		return budget;
	}
}
