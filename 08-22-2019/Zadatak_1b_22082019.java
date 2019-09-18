package functions;

import java.util.Scanner;

public class Zadatak_1b_22082019 {

	public static void main(String[] args) {
		// Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve
		// metode(u mainu). Prva metoda vraca proizvod unetih brojeva. Druga metoda
		// ispisuje najmanji od unesenih brojeva.
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite tri realna broja: ");
		double[] niz = new double[3];
		for (int i = 0; i <= 2; i++) {
			niz[i] = unos.nextDouble();
		}
		System.out.println("Proizvod brojeva " + niz[0] + ", " + niz[1] + " i " + niz[2] + " je "
				+ proizvod(niz[0], niz[1], niz[2]) + ".");
		System.out.println("Najmanji je broj " + najmanji(niz[0], niz[1], niz[2]) + ".");
	}

	public static double proizvod(double a, double b, double c) {
		double proizvod = a * b * c;
		return proizvod;

	}

	public static double najmanji(double a, double b, double c) {
		double[] pomocniNiz = { a, b, c };
		double manjiBroj = pomocniNiz[0];
		for (int i = 0; i < pomocniNiz.length - 1; i++) {
			if (pomocniNiz[i] > pomocniNiz[i + 1]) {
				manjiBroj = pomocniNiz[i + 1];
			}
		}
		return manjiBroj;
	}
}
