package mypack;

class Balance {
	String name;
	double bal;

	Balance(String name, double bal) {
		this.name = name;
		this.bal = bal;
	}

	void show() {
		if(bal < 0)
			System.out.print("-->");
		System.out.println(name + ": $" + bal);
	}
}

class AccountTest {
	public static void main(String[] args) {
		Balance current[] = new Balance[3];

		current[0] = new Balance("Endre", 10.323);
		current[1] = new Balance("Béla", -23);
		current[2] = new Balance("János", 42.23);

		for(int i = 0;i < 3; i++) current[i].show();
	}
}