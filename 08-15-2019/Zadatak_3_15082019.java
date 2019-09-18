package do_while;

import java.util.Scanner;

public class Zadatak_3_15082019 {

	public static void main(String[] args) {
		/*
		 * Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		 * Primer: ulaz int m=7, n=3;
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko zvezdica zelite da bude u redu?");
		int m = sc.nextInt();
		System.out.println("U koliko redova zelite da budu poredjane?");
		int n = sc.nextInt();
		String zvezda = "*";
		// spoljna petlja mi odredjuje broj redova, a unutrasnja broj zvezdica po redu
		if (m > 0 && n > 0) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					System.out.print(zvezda + " ");
				}
				System.out.println();
			}
		} else
			System.out.println("Unos mora biti veci od nule!");
	}
}
