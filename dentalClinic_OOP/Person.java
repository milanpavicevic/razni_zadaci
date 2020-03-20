package dentalClinic_OOP;

public abstract class Person {
	/* 
	 * Person has name, unique ID, personal number and money.
	 * Name and personal number are given during creation. You can only get data, not set.
	 * You can add or remove money, and return value will show is it successfull.
	 * Text form: NAME[ID:personalNumber:MONEY]
	*/
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
