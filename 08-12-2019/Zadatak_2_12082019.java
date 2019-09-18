package whil;

import java.util.Scanner;

public class Zadatak_2_12082019 {

	public static void main(String[] args) {
		// Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		// od 0 do n. Koristiti jednu petlju.
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti n:");
		int n = sc.nextInt();
		int osnova = 1;
		int sum = 0;
		int proizvod = 1;

		while (osnova <= n) {
				if (osnova % 2 == 0) {
					sum += osnova;
					osnova += 1;
				} else if (osnova % 2 == 1) {
					proizvod *= osnova;
					osnova += 1;
				}
		}
		System.out.println("Zbir parnih brojeva je " + sum + ".");
		System.out.println("Proizvod neparnih brojeva je " + proizvod + ".");
	}

}
