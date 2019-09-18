package whil;

import java.util.Scanner;

public class Zadatak_2c_13082019 {

	public static void main(String[] args) {
		// Napisati program koji ce sabrati sve brojeve od k do n (k i n uneti preko
		// konzole).
		// Program treba da ispise zbir.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvi broj niza za sabiranje:");
		int k = sc.nextInt();
		int k1 = k;
		System.out.println("Unesite poslednji broj niza za sabiranje:");
		int n = sc.nextInt();
		int sum = 0;
		if (k > n)
			System.out.println("Prvi broj mora biti manji od poslednjeg!");
		else {
			while (k <= n) {
				sum += k;
				k++;
			}
			System.out.println("Zbir brojeva od " + k1 + " do " + n + " je " + sum + ".");
		}
	}

}
