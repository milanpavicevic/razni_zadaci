package prinosi;

public abstract class Parcela {
	// Parcela ima jedinstven automatski generisan celobrojan identifikator
	// i zadatu povrsinu(u kvadratnim metrima) prilikom kreiranja.
	// Mogu da joj se dohvate sadrzani podaci, kao i jednoslovna vrsta(char).
	// Moze da joj se odredi prinos u periodu zadatom brojem godina.
	// Moze da se sastavi tekstualni opis u obliku VRSTA-ID[POVRSINA].
	protected static int uniId = 0;
	protected char vrsta;
	protected int id;
	protected double povrsina;

	public Parcela(double povrsina) {
		this.povrsina = povrsina;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public abstract int getId();

	public abstract char getVrsta();

	public abstract double prinos();

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getVrsta()).append("-").append(getId()).append("[").append(this.getPovrsina()).append("]");
		return sb.toString();
	}
}
