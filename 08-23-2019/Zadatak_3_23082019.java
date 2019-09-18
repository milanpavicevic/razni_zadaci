package functions;

import java.util.Scanner;

public class Zadatak_3_23082019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava niz od n celih brojeva i dve metode. Prva
		// metoda vraca proizvod elemenata na neparnim pozicijama, a druga vraca zbir
		// parnih elemenata niza.
		Scanner unos = new Scanner(System.in);
		System.out.print("Koliko clanova zelite da niz ima? ");
		int duzina = unos.nextInt();
		int[] niz = new int[duzina];
		System.out.print("Unesite " + duzina + " clanova niza: ");
		for (int i = 0; i < duzina; i++) {
			niz[i] = unos.nextInt();
		}
		proizvod(niz);
		zbirParnih(niz);
	}

	public static int proizvod(int[] niz) {
		int multi = 1;
		System.out.print("Proizvod elemenata na neparnim pozicijama je ");
		for (int i = 0; i <= niz.length - 1; i++) {
			if (i % 2 != 0) {
				multi *= niz[i];
			}
		}
		System.out.print(multi + ".\n");
		return multi;
	}

	public static int zbirParnih(int[] niz) {
		int zbir = 0;
		for (int i = 0; i <= niz.length - 1; i++) {
			if (niz[i] % 2 == 0) {
				zbir += niz[i];
			}
		}
		System.out.println("Zbir parnih brojeva je " + zbir + ".");
		return zbir;
	}
}
