package If;

import java.util.Scanner;

public class Zadatak_1_08092019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji proverava da li je uneti broj paran ili neparan.
		 * Ukoliko jeste, program treba da ispise poruku: Broj je paran! Ukoliko nije,
		 * program treba da ispise poruku: Broj je neparan!
		 */
		Scanner par = new Scanner(System.in);
		System.out.println("Unesite ceo broj razlicit od nule:");
		int unos = par.nextInt();
		if (unos % 2 == 0)
			System.out.println("Broj je paran.");
		else
			System.out.println("Broj je neparan.");
	}

}
