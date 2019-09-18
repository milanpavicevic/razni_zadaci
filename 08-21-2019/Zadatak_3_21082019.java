package nizovi;

import java.util.Scanner;

public class Zadatak_3_21082019 {

	public static void main(String[] args) {
//		Napisati program koji ucitava duzinu niza, niz i proverava da li je niz rastuci.
//		Primer1 niza: 3 54 123 18
//		Ispis: Niz nije rastuci.
//		Primer2 niza: 71 422 1001 5050
//		Ispis: Niz je rastuci.
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite duzinu niza: ");
		int duzina = unos.nextInt();
		if (duzina < 1) {
			System.out.println("Duzina niza mora biti veca od nule!");
		} else {
			int[] niz = new int[duzina];
			System.out.print("Unesite clanove niza: ");
			int i;
			int j;
			for (i = 0; i < niz.length; i++) {
				niz[i] = unos.nextInt();
			}
			for (j = 0; j < niz.length - 1; j++) {
				if (niz[j] > niz[j + 1]) {
					System.out.println("Niz nije rastuci.");
					break;
				}
			}
			if (j == niz.length - 1)
				System.out.println("Niz je rastuci.");
		}
	}

}
