package dentalClinic_OOP;

public class Dentist extends Person {
	//Dentist is a person whose data can be written in shape: S_PERSON
	private String tag;
	protected int wallet;

	public Dentist(String name, int personalNo) {
		super(name, personalNo);
		wallet = 0;
		tag = "Dr ";
	}

	public int getWallet() {
		return wallet;
	}

	public int setWallet(int x) {
		this.wallet += x;
		return wallet;
	}

	public String getTag() {
		return tag;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getTag())
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
			this.wallet -= money;
			if (temp <= wallet) {
				return false;
			} else {
				return true;
			}
		} else {
			System.out.println("The amount must be greater then zero!");
			return false;
		}
	}
}
