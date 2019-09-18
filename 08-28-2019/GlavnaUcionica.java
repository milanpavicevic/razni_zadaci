package ucionica;

public class GlavnaUcionica {

	public static void main(String[] args) {
		// Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
		// Polaznik poseduje i identifikacioni broj koji se moze dohvatiti.
		// Ime i prezime polaznika se moze dohvatiti ali ne i postaviti.
		// Polaznik se ispisuje u obliku: IME_PREZIME{ID}.

		// Laptop poseduje polaznika i marku koji se zadaju prilikom kreiranja.
		// Marka moze samo da se dohvati.
		// Laptop takodje moze da menja polaznika ili da ostane bez polaznika.
		// Moze da se ispise u obliku: MARKA{POLAZNIK}
		Polaznik prvi = new Polaznik("Milan Pavicevic");
		Laptop prviL = new Laptop("Asus");
		prvi.ispisPolaznika();
		prviL.setPolaznik(prvi);
		System.out.println(prviL.ispisi());
		prviL.resetPolaznika();
		System.out.println(prviL.ispisi());
		Polaznik drugi = new Polaznik("Pera Peric");
		prviL.setPolaznik(drugi);
		System.out.println(prviL.ispisi());
		System.out.println("Broj polaznika je " + Polaznik.getUID());
	}

}
