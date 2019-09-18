package whil;

public class Zadatak_1_12082019 {

	public static void main(String[] args) {
		// Napisati program koji ce ispisati poruku “Hello World!” 10 puta.
		// Koristiti while petlju.
		String hw = "Hello World!";
		int brojac = 1;
		while (brojac <= 10) {
			System.out.println(brojac + ". " + hw);
			brojac += 1;
		}
	}

}
