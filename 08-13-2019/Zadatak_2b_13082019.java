package whil;

import java.util.Scanner;

public class Zadatak_2b_13082019 {

	public static void main(String[] args) {
		// Napisati program koji ce sabrati sve brojeve od 1 do n (n uneti preko
		// konzole). Program treba da ispise zbir.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n:");
		int n = sc.nextInt();
		int a = 1;
		int sum = 0;
		if (n < 1)
			System.out.println("N mora biti vece od 1!");
		else {
			while (a <= n) {
				sum += a;
				a++;
			}
			System.out.println("Zbir brojeva od 1 do " + n + " je " + sum + ".");
		}
	}

}
