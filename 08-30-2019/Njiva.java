package prinosi;

public class Njiva extends Parcela {
	// Njiva je parcela koja ima zadat godisnji prinos po kvadratnom metru.
	// Prinos po kvadratnom metru moze da se promeni.
	// Oznaka vrste je N.
	// Prinos njive se racuna po formuli:
	// povrsina_parcele*prinosPoKvM.
	// Tekstualni oblik je Parcela:PrinosPoKvM.
	private double prinosPoKvM;

	public Njiva(double povrsina, double prinosPoKvM) {
		super(povrsina);
		this.vrsta = 'N';
		this.id = ++uniId;
		this.povrsina = povrsina;
		this.prinosPoKvM = prinosPoKvM;
	}

	public void setPrinosPoKvM(double prinosPoKvM) {
		this.prinosPoKvM = prinosPoKvM;
	}

	public double getPrinosPoKvM() {
		return prinosPoKvM;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public char getVrsta() {
		return vrsta;
	}

	@Override
	public double prinos() {
		return povrsina * prinosPoKvM;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(":").append(this.getPrinosPoKvM()).append("kg/m^2.");
		return sb.toString();
	}

}
