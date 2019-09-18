package ucionica;

public class Laptop {
	// Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
	// Polaznik poseduje i identifikacioni broj koji se moze dohvatiti.
	// Ime i prezime polaznika se moze dohvatiti ali ne i postaviti.
	// Polaznik se ispisuje u obliku: IME_PREZIME{ID}.

	// Laptop poseduje polaznika i marku koji se zadaju prilikom kreiranja.
	// Marka moze samo da se dohvati.
	// Laptop takodje moze da menja polaznika ili da ostane bez polaznika.
	// Moze da se ispise u obliku: MARKA{POLAZNIK}
	private String marka;
	private Polaznik p;

	public Laptop(String marka) {
		this.marka = marka;
		p = null;
	}

	public String getMarka() {
		return marka;
	}

	public Polaznik getPolaznik(Polaznik p) {
		return p;
	}

	public void setPolaznik(Polaznik p) {
		this.p = p;
	}

	public void resetPolaznika() {
		p = null;
	}

	public String ispisi() {
		String s;
		if (p == null) {
			s = "Nema polaznika";
		} else {
			s = p.getImePrezime();
		}
		return marka + "{" + s + "}";
	}
}