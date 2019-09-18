package do_while;

import java.util.Scanner;

public class Zadatak_1_15082019 {

	public static void main(String[] args) {
		// Napisati program (meni) za izracunavanje i ispis povrsina geometrijskih
		// tela (kocke, kvadra, valjka, lopte). Koristiti do while petlju i switch
		// grananje. Za izlaz koristiti nulu (0).
		Scanner sc = new Scanner(System.in);
		// deklarisanje mogucih unosa:
		double a, b, c, r, h;
		double pi = 3.14;
		int izbor;
		System.out.println("--- Program za izracunavanje povrsine tela ---");
		do {
			System.out.print("Izaberite:\n1 - kocka\n2 - kvadar\n3 - valjak\n4 - lopta\n0 - izlaz\n");
			izbor = sc.nextInt();
			switch (izbor) {
			case 0:
				System.out.println("Kraj programa!");
				break;
			case 1:
				System.out.println("Unesite duzinu stranice a:");
				a = sc.nextDouble();
				System.out.println("Povrsina kocke je " + (6 * (a * a)) + "cm^2");
				break;
			case 2:
				System.out.println("Unesite duzinu stranice a:");
				a = sc.nextDouble();
				System.out.println("Unesite duzinu stranice b:");
				b = sc.nextDouble();
				System.out.println("Unesite duzinu stranice c:");
				c = sc.nextDouble();
				System.out.println("Povrsina kvadra je " + (2 * ((a * b) + (a * c) + (b * c))) + "cm^2");
				break;
			case 3:
				System.out.println("Unesite poluprecnik valjka:");
				r = sc.nextDouble();
				System.out.println("Unesite visinu valjka:");
				h = sc.nextDouble();
				System.out.println("Povrsina valjka je " + ((2 * (r * r * pi)) + (2 * r * pi * h)) + "cm^2");
				break;
			case 4:
				System.out.println("Unesite poluprecnik lopte:");
				r = sc.nextDouble();
				System.out.println("Povrsina lopte je " + (4 * r * r * pi) + "cm^2");
				break;
			default:
				System.out.println("Pogresan unos!");
				break;
			}
		} while (izbor != 0);
	}

}
