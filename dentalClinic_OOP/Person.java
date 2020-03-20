package dentalClinic_OOP;

public abstract class Person {
	/* Covek poseduje naziv, jedinstveni automatski identifikator, JMBG i novac.
	 * Naziv i JMBG se zadaju prilikom kreiranja. Svi sadrzani podaci mogu samo da
	 * se dohvate. Novac moze da se doda i da se oduzme, gde je povratna vrednost
	 * indikator uspesnosti oduzimanja novca. Moze da se sastavi tekstualni zapis u
	 * obliku: IME_PREZIME[ID:JMBG:NOVAC]*/
	private String name;
	private static int UID = 0;
	private int id, personalNo;

	public Person(String name, int personalNo) {
		this.name = name;
		this.personalNo = personalNo;
		id = ++UID;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getPersonalNo() {
		return personalNo;
	}

	public abstract int getWallet();

	public abstract int setWallet(int x);

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName())
		.append(" [ID:")
		.append(getId())
		.append("; Personal Number:")
		.append(getPersonalNo())
		.append("; MONEY:");
		return sb.toString();
	}

	public abstract boolean addMoney(int money);

	public abstract boolean chargeTheAmount(int money);
}
