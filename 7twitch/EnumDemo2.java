enum Apple { //object aminek van egy típusa
	Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8); //final statikus tagok, publikusak is

	private int price;

	Apple(int p) { price = p; }

	Apple() { price = -1; }

	int getPrice() { return price; }
}

class EnumDemo2 {
	public static void main(String[] args) {
		
		System.out.println("Price of Winesap: " + Apple.Winesap.getPrice());
	
		for(var a : Apple.values())
			System.out.println(a + " costs " + a.getPrice() + " cents.");
	}
}