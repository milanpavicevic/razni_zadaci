package dentalClinic_OOP;

public class Patient extends Person {
	// Patient is a person whose data can be written in shape: P_PERSON
	private String tag;
	private int wallet;

	public Patient(String name, int personalNo) {
		super(name, personalNo);
		wallet = 0;
		tag = "P";
	}

	public String getTag() {
		return tag;
	}

	public int getWallet() {
		return wallet;
	}

	public int setWallet(int x) {
		this.wallet += x;
		return wallet;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getTag())
		.append(" - ")
		.append(super.toString())
		.append(getWallet())
		.append("]");
		return sb.toString();
	}

	public boolean addMoney(int money) {
		int temp = wallet;
		if (money > 0) {
			this.wallet += money;
			if (temp >= wallet) {
				return false;
			} else {
				return true;
			}
		} else {
			System.out.println("The amount must be greater then zero!");
			return false;
		}
	}

	public boolean chargeTheAmount(int money) {
		int temp = wallet;
		if (money > 0) {
			if (money <= wallet) {
				wallet -= money;
			} else {
				System.out.println("Patient doesn't have enough money, charge it by court procedure!");
			}
			if (temp <= wallet) {
				return false;
			} else {
				System.out.println("Payment unsuccessful.");
				return true;
			}
		} else {
			System.out.println("The amount must be greater then zero!");
			return false;
		}
	}
}
