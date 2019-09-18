package If;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji u zavisnosti od unesenog stringa racuna povrsine
		 * kvadrata, kruga ili pravougaonika. Ukoliko se unese “pravougaonik” nek pita
		 * korisnika za 2 stranice i ispise povrsinu. Ukoliko se unese “krug” nek pita
		 * korisnika za poluprecnik kruga i izracuna povrsinu. Ukoliko se unese
		 * “kvadrat” nek pita korisnika za unos stranice i izracuna povrsinu kvadrata.
		 */
		Scanner povrsina = new Scanner(System.in);
		System.out.println(
				"Izaberite jednu od ponuđenih geometrijskih figura čiju površinu želite:\nkvadrat, krug ili pravougaonik.");
		String unos = povrsina.nextLine();
		switch (unos) {
		case "kvadrat":
			System.out.println("Unesite zeljenu duzinu stranice:");
			int a = povrsina.nextInt();
			if (a > 0)
				System.out.println("Povrsina kvadrata je " + a * a + ".");
			else
				System.out.println("Pogresan unos!");
			break;
		case "krug":
			System.out.println("Unesite zeljeni poluprecnik:");
			int r = povrsina.nextInt();
			double pi = 3.14;
			if (r > 0)
				System.out.println("Povrsina kruga je " + r * r * pi + ".");
			else
				System.out.println("Pogresan unos!");
			break;
		case "pravougaonik":
			System.out.println("Unesite stranicu A:");
			int str_a = povrsina.nextInt();
			System.out.println("Unesite stranicu B:");
			int str_b = povrsina.nextInt();
			if (str_a > 0 && str_b > 0)
				System.out.println("Povrsina pravougaonika je " + str_a * str_b + ".");
			else
				System.out.println("Pogresan unos!");
			break;
		default:
			System.out.println("Pogresan unos!");
			break;
		}
	}

}
