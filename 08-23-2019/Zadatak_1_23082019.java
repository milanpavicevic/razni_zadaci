package functions;

import java.util.Scanner;

public class Zadatak_1_23082019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava ceo broj n. Taj broj n se prosledjuje metodi
		// koja formira i vraca ceo broj koji predstavlja inverzan broj.
		// Glavni program nakon toga ispisuje taj inverzan broj
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite N: ");
		int n = unos.nextInt();
		System.out.println("Inverzan broj " + n + " je " + inverz(n) + ".");
	}

	public static int inverz(int n) {
		int invert = 0;
		while (n != 0) {
			int pomocna = n % 10;
			invert *= 10;
			invert += pomocna;
			n /= 10;
		}
		return invert;
	}
}
