package knjige;

public class Knjige {
	// Napisati klasu Knjige koja ima sledeca polja:
	// naziv knjige, autora, broj strana, godinu izdanja.
	// Sva polja mogu da se dohvate, a godina izdanja moze i da se postavi.
	// Napisati glavni program koji kreira tri knjige i ispisuje sve njihove
	// podatke.
	private String naslov;
	private String autor;
	private int brojStrana;
	private int godina;

	public Knjige(String naslov, String autor, int brojStrana, int godina) {
		this.naslov = naslov;
		this.autor = autor;
		this.brojStrana = brojStrana;
		this.godina = godina;
	}

	public String getNaslov() {
		return naslov;
	}

	public String getAutor() {
		return autor;
	}

	public int getBrojStrana() {
		return brojStrana;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}
}
