package nizovi;

import java.util.Scanner;

public class Zadatak_2_21082019 {

	public static void main(String[] args) {
//		//Napisati program koji ucitava duzinu niza i niz, a zatim ispisuje niz inverznim redosledom.
//		Primer niza: 3 54 123 18  Ispis: 18 123 54 3
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite duzinu niza: ");
		int duzina = unos.nextInt();
		if (duzina < 1) {
			System.out.println("Duzina niza mora biti pozitivan ceo broj!");
		} else {
			int niz[] = new int[duzina];
			System.out.print("Unesite clanove niza: ");
			for (int i = 0; i < niz.length; i++) {
				niz[i] = unos.nextInt();
			}
			System.out.print("Niz obrnutim redosledom: ");
			for (int j = niz.length - 1; j >= 0; j--) {
				System.out.print(niz[j] + " ");
			}
		}

	}

}
