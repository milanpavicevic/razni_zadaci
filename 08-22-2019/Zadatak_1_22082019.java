package functions;

import java.util.Scanner;

public class Zadatak_1_22082019 {

	public static void main(String[] args) {
		// Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve
		// metode(u mainu). Prva metoda vraca proizvod unetih brojeva. Druga metoda
		// ispisuje najmanji od unesenih brojeva.
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite tri realna broja: ");
		double x, y, z;
		x = unos.nextDouble();
		y = unos.nextDouble();
		z = unos.nextDouble();
		proizvod(x, y, z);
		najmanji(x, y, z);
	}

	public static void proizvod(double x, double y, double z) {
		double proizvod = x * y * z;
		System.out.println("Proizvod brojeva " + x + ", " + y + " i " + z + " je " + proizvod);
	}

	public static void najmanji(double x, double y, double z) {
		if (x == y && y == z) {
			System.out.println("Svi brojevi su jednaki.");
		} else if (x < y && x < z) {
			System.out.println("Najmanji je " + x + ".");
		} else if (y < x && y < z) {
			System.out.println("Najmanji je " + y + ".");
		} else if (z < x && z < y) {
			System.out.println("Najmanji je " + z + ".");
		} else if (x == y && x < z) {
			System.out.println(x + " i " + y + " su najmanji.");
		} else if (x == z && x < y) {
			System.out.println(x + " i " + z + " su najmanji.");
		} else if (y == z && y < x) {
			System.out.println(y + " i " + z + " su najmanji.");
		} else {
			System.out.println("Greska!");
		}
	}
}
