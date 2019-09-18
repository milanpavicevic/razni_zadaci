package break_cont;

import java.util.Scanner;

public class Zadatak_1_16082019 {

	public static void main(String[] args) {
		// Napisati program koji za x>y umanjuje vrijednosti obe varijable ( x := x - 2;
		// y := y - 2,), za x<y menja vrijednosti obe varijable na x := x + 2; y := y +
		// 2, a za x=y izbacuje odgovarajuce obavestenje
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite X:");
		double x = sc.nextDouble();
		System.out.println("Unesite Y:");
		double y = sc.nextDouble();

		if (x > y) {
			x /= x - 2;
			y /= y - 2;
			System.out.println("Posto je X vece od Y, vrednosti su promenjene u:\nX =  " + x + "\nY = " + y);
		} else if (x < y) {
			x /= x + 2;
			y /= y + 2;
			System.out.println("Posto je X manje od Y, vrednosti su promenjene u:\nX =  " + x + "\nY = " + y);
		} else
			System.out.println("X je jednako Y,\nunesite razlicite vrednosti.");
	}

}
