package do_while;

import java.util.Scanner;

public class Zadatak_2_15082019 {

	public static void main(String[] args) {
		// Napisati program koji ce ispisati n brojeva Fibonacijevog niza.
		Scanner sc = new Scanner(System.in);
		System.out.println("Odredite koliko clanova treba da ima Vas\nFibonacijev niz:");
		int n = sc.nextInt();
		int a = 1;
		int b = a + a;
		int c = a + b;
		System.out.print(a + ", " + b + ", " + c + ", ");
		for (int i = 1; i <= n - 3; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(c + ", ");
		}
		System.out.print("...");
		// System.out.print("\b\b...");
	}

}
