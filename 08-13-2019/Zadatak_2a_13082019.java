package whil;

public class Zadatak_2a_13082019 {

	public static void main(String[] args) {
		// a)Napisati program koji ce sabrati brojeve od 1 do 5. Program treba da ispise
		// zbir.
		int a = 1;
		int sum = 0;
		while (a <= 5) {
			sum += a;
			a++;
		}
		System.out.println("Zbir brojeva od 1 do 5 je " + sum + ".");
	}

}
