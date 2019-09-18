package break_cont;

import java.util.Scanner;

public class Zadatak_2_16082019 {

	public static void main(String[] args) {
		// Izracunati sumu prirodnih brojeva u intervalu od k do n cija je cifra
		// jedinica 8.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite K:");
		int k = sc.nextInt();
		System.out.println("Unesite N:");
		int n = sc.nextInt();
		int sum = 0;

		if (k < n) {
			while (k <= n) {
				if (k % 10 == 8 || k % 10 == -8) {
					sum += k;
				}
				k++;
			}
			System.out.println("Zbir je: " + sum);
		} else
			System.out.println("K mora biti manje od N!");
	}
}
