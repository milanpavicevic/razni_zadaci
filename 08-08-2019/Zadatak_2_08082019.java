package pp;

import java.util.Scanner;

public class Zadatak_2_08082019 {

	public static void main(String[] args) {
		/*
		 * Zadatak: Napisi program koji ce racunati obim i povrsinu pravougaonika, tako
		 * sto se stranice ucitavaju preko konzole.
		 */
		Scanner oP = new Scanner(System.in);
		double a, b;
		System.out.println("Unesite stranicu a:");
		a = oP.nextDouble();
		System.out.println("Unesite stranicu b:");
		b = oP.nextDouble();
		double o = 2 * (a + b);
		double p = a * b;
		System.out.println("Obim pravougaonika je " + o);
		System.out.println("Povrsina pravougaonika je " + p);
	}

}
