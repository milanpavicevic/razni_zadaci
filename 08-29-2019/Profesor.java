package fax;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Covek {
//Covek ima ime, prezime i godinu rodjenja.
//Ime i prezime mogu da se i dohvate i postave, dok godina rodjenja moze samo da se dohvati.
//Coveka ispisati u formatu: Ime_Prezime[godina rodjenja].
//Student je covek koji se kreira sa brojem indeksa i ima  trenutnu godinu studija i trenutni prosek.
//Sva polja mogu samo da se dohvate. 
//Studenta ispisati u formatu:
//Ime_Prezime[godina rodjenja] je student ___ (god studija) godine studija sa prosekom____ (trenutni prosek).
//Profesor je covek koji ima titulu i listu predmeta na kojima drzi nastavu.
//Predmeti mogu da se dodaju i oduzimaju iz liste.
//Profesora ispisati u formatu:
//Ime_Prezime[godina rodjenja] je ___(titula)  koji drzi nastavu na: <lista predmeta>.
//Napisati glavni program koji ce imati bar tri studenta i dva profesora.
	private String titula;
	List<String> predmeti = new ArrayList<>();

	public Profesor(String ime, String prezime, int godRodj, String titula) {
		super(ime, prezime, godRodj);
		this.godRodj = godRodj;
		this.titula = titula;
		List<String> predmeti = new ArrayList<>();
	}

	public boolean povecajListu(String x) {
		return predmeti.add(x);
	}

	public boolean smanjiListu(String x) {
		return predmeti.remove(x);
	}

	public String izlistaj(List<String> predmeti) {
		String lista = "";
		if (predmeti.size() < 1) {
			return "0 predmeta";
		}
		for (int i = 0; i < predmeti.size(); i++) {
			lista += predmeti.get(i) + "\n";
		}
		return lista;
	}

	public String ispis() {
		return ime + "_" + prezime + " [" + godRodj + ".] je " + titula + ",\nkoji drzi nastavu na:\n"
				+ izlistaj(predmeti);
	}
}