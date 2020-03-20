package dentalClinic_OOP;

public class MainClinic {

	public static void main(String[] args) {
		Person p1 = new Patient("Anna Smith", 1105992715);
		Person p2 = new Patient("John Doyle", 1209977710);
		Person dr1 = new Dentist("Nicolas Benson", 1507952710);
		DentalClinic caninus = new DentalClinic("Caninus");
		p1.addMoney(2500);
		p2.addMoney(3000);
		caninus.addPatient(p1);
		caninus.addPatient(p2);
		caninus.addDentist(dr1);
		caninus.doctorsList();
		caninus.chargeAmount(900, 2);
		caninus.chargeAmount(1100, 1);
		caninus.patientsList();
		caninus.giveSalary(1, 9000);
		System.out.println(dr1.toString());
		System.out.println("Dental clinic budget: " + caninus.getBudget());
	}

}
