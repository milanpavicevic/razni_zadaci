package nizovi;

import java.util.Scanner;

public class Zadatak_1_21082019 {

	public static void main(String[] args) {
		// Korisnik ucitava niz od n elemenata niza, kao i neko broj br. Program
		// ispisuje elemente niza deljive brojem br.
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite duzinu niza: ");
		int n = unos.nextInt();
		if (n < 1)
			System.out.println("Duzina niza mora biti pozitivan ceo broj!");
		else {
			int[] niz = new int[n];
			System.out.print("Unesite broj: ");
			int br = unos.nextInt();
			if (br == 0) {
				System.out.println("Broj mora biti razlicit od nule!");
			} else {
				System.out.println("Unesi " + n + " clanova niza: ");
				for (int i = 0; i < niz.length; i++) {
					niz[i] = unos.nextInt();
				}
				System.out.print("Clanovi niza koji su deljivi sa brojem " + br + " su: ");
				for (int j = 0; j < niz.length; j++) {
					if (niz[j] % br == 0) {
						System.out.print(niz[j] + " ");
					}
				}
			}
		}
	}
}
