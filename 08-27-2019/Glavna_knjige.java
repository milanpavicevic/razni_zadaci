package knjige;

public class Glavna_knjige {

	public static void main(String[] args) {
		Knjige prva = new Knjige("Java", "Laslo Kraus", 480, 2015);
		Knjige druga = new Knjige("Testiranje softvera", "Jovan Popovic", 280, 2012);
		Knjige treca = new Knjige("Kosingas", "Aleksandar Tesic", 540, 2009);
		System.out.println(prva.getNaslov() + ", " + prva.getAutor() + ", " + prva.getBrojStrana() + " strana, "
				+ prva.getGodina() + ". god.");
		System.out.println(druga.getNaslov() + ", " + druga.getAutor() + ", " + druga.getBrojStrana() + " strana, "
				+ druga.getGodina() + ". god.");
		System.out.println(treca.getNaslov() + ", " + treca.getAutor() + ", " + treca.getBrojStrana() + " strana, "
				+ treca.getGodina() + ". god.");
//		treca.setGodina(2012);
//		System.out.println(treca.getNaslov() + ", " + treca.getAutor() + ", " + treca.getBrojStrana() + " strana, "
//				+ treca.getGodina() + ". god.");
	}

}
