enum Apple { //object aminek van egy típusa
	Jonathan, GoldenDel, RedDel, Winesap, Cortland //final statikus tagok, publikusak is
}

class EnumDemo {
	public static void main(String[] args) {
		
		Apple ap;

		ap = Apple.Winesap;

		System.out.println("Value of ap: " + ap);

		ap = Apple.GoldenDel;

		System.out.println("Value of ap: " + ap);

		if(ap == Apple.GoldenDel)
			System.out.println("ap contains GoldenDel");

		switch (ap){
			case Jonathan:
				System.out.println("Jonathan is red.");
				break;
			case GoldenDel:
				System.out.println("GoldenDel is yellow.");
				break;
			case RedDel:
				System.out.println("RedDel is red.");
				break;
			case Winesap:
				System.out.println("Winesap is green.");
				break;
			case Cortland:
				System.out.println("Cortland is red.");
				break;
		}

		Apple allApples[] = Apple.values();

		for(var a : allApples)
			System.out.println(a);
	}
}