package functions;

import java.util.Scanner;

public class Zadatak_2_23082019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava tri cela broja i metodu koja ispisuje brojeve
		// od prvog do drugog (ukljucujuci i njih) koji su deljivi trecim
		int[] niz = new int[3];
		ucitajNiz(niz);
		ispisi(niz);
	}

	public static void ucitajNiz(int[] niz) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesi tri broja: ");
		for (int i = 0; i <= 2; i++) {
			niz[i] = unos.nextInt();
		}
	}

	public static int ispisi(int[] niz) {
		for (int i = 0; i <= 1; i++) {
			if (niz[2] == 0) {
				System.out.println("Poslednji element ne sme biti nula!");
				break;
			} else if (niz[i] % niz[2] != 0 && niz[i + 1] % niz[2] != 0) {
				System.out.println("Brojevi " + niz[i] + " i " + niz[i + 1] + " nisu deljivi sa " + niz[2] + ".");
			} else if (niz[i] % niz[2] == 0) {
				System.out.print(niz[i] + " ");
			}
		}
		return 0;
	}
}
