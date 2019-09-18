package fax;

public class Covek {
	// Covek ima ime, prezime i godinu rodjenja.
	// Ime i prezime mogu da se i dohvate i postave, dok godina rodjenja moze samo
	// da se dohvati.
	// Coveka ispisati u formatu: Ime_Prezime[godina rodjenja].
	// Student je covek koji se kreira sa brojem indeksa i ima trenutnu godinu
	// studija i trenutni prosek.
	// Sva polja mogu samo da se dohvate.
	// Studenta ispisati u formatu:
	// Ime_Prezime[godina rodjenja] je student ___ (god studija) godine studija sa
	// prosekom____ (trenutni prosek).
	// Profesor je covek koji ima titulu i listu predmeta na kojima drzi nastavu.
	// Predmeti mogu da se dodaju i oduzimaju iz liste.
	// Profesora ispisati u formatu:
	// Ime_Prezime[godina rodjenja] je ___(titula) koji drzi nastavu na: <lista
	// predmeta>.
	// Napisati glavni program koji ce imati bar tri studenta i dva profesora.
	protected String ime, prezime;
	protected int godRodj;

	public Covek(String ime, String prezime, int godRodj) {
		this.ime = ime;
		this.prezime = prezime;
		this.godRodj = godRodj;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGodRodj() {
		return godRodj;
	}

	public String ispis() {
		return ime + "_" + prezime + "[" + godRodj + "]";
	}
}
