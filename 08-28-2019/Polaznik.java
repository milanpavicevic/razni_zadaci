package ucionica;

public class Polaznik {
	// Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
	// Polaznik poseduje i identifikacioni broj koji se moze dohvatiti.
	// Ime i prezime polaznika se moze dohvatiti ali ne i postaviti.
	// Polaznik se ispisuje u obliku: IME_PREZIME{ID}.

	// Laptop poseduje polaznika i marku koji se zadaju prilikom kreiranja.
	// Marka moze samo da se dohvati.
	// Laptop takodje moze da menja polaznika ili da ostane bez polaznika.
	// Moze da se ispise u obliku: MARKA{POLAZNIK}
	private static int uID = 0;
	private int id;
	private String imePrezime;

	public Polaznik(String imePrezime) {
		this.imePrezime = imePrezime;
		id = ++uID;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public int getId() {
		return id;
	}

	public void ispisPolaznika() {
		System.out.println(imePrezime + "{ID: " + id + "}");
	}

	public static int getUID() {
		return uID;
	}
}
