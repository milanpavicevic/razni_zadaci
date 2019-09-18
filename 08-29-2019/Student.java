package fax;

public class Student extends Covek {
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
	private static int univId = 0;
	private int brInd, godina;
	private double prosek;

	public Student(String ime, String prezime, int godRodj, int godina, double prosek) {
		super(ime, prezime, godRodj);
		this.brInd = ++univId;
		this.godina = godina;
		this.prosek = prosek;
	}

	public int getBrInd() {
		return brInd;
	}

	public int getGodina() {
		return godina;
	}

	public double getProsek() {
		return prosek;
	}

	public String ispisStudenta() {
		return ime + "_" + prezime + "[" + godRodj + ".] je student " + godina + ". godine studija, sa prosekom "
				+ prosek + ".";
	}
}
