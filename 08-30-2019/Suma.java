package prinosi;

public class Suma extends Parcela {
//	Suma je parcela koja ima zadate povrsinu koju zauzimaju stabla,
//	prinos po zrelom stablu i period sazrevanja od zasada do sece izrazen u celom broju godina.
//	Oznaka vrste je S.
//	Prinos se ostvaruje formulom:
//	povrsina_parcele/povrsina_stabla*prinos_stabla*(godine/sazrevanje).
//	Tekstualni oblik je *Parcela:(povrsStabla,prinosSt,Period).
//	*Ovo se ostvaruje pozivom super.toString();
	private double povrsStabla, prinosSt;
	private int sazrevanje;

	public Suma(double povrsina, double povrsStabla, double prinosSt, int sazrevanje) {
		super(povrsina);
		this.vrsta = 'S';
		this.id = ++uniId;
		this.povrsStabla = povrsStabla;
		this.prinosSt = prinosSt;
		this.sazrevanje = sazrevanje;
	}

	public double getPovrsStabla() {
		return povrsStabla;
	}

	public double getPrinosSt() {
		return prinosSt;
	}

	public int getSazrevanje() {
		return sazrevanje;
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
		return (povrsina / povrsStabla * prinosSt * (3 / sazrevanje));
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(":(").append(getPovrsStabla()).append(", ").append(getPrinosSt())
				.append(", ").append(getSazrevanje()).append(").");
		return sb.toString();
	}
}
