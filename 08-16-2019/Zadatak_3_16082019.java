package break_cont;

import java.util.Scanner;

public class Zadatak_3_16082019 {

	public static void main(String[] args) {
		// Izracunati sumu dvocifrenih brojeva kod kojih je suma cifara manja od 7.
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite prvi dvocifreni broj:");
		int a = sc.nextInt();
		System.out.println("Unesite drugi dvocifreni broj:");
		int b = sc.nextInt();
		int sum = 0;

		if (a < b) {
			if ((a > 9 && a < 100) && (b > 9 && b < 100)) {
				for (int i = a; i <= b; i++) {
					int a1 = i % 10;
					int a2 = i / 10;
					int aSum = a1 + a2;
					if (aSum < 7) {
						sum += i;
					}
				}
				System.out.println("Zbir je " + sum);
			} else
				System.out.println("Brojevi moraju biti dvocifreni!");
		} else
			System.out.println("Prvi broj mora biti manji od drugog!");
	}
}
