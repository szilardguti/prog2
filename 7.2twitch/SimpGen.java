class Two<T, V> {//nem generálódik le runtime-kor, mint c++-ban
				 //megfelelően castol objektumokra
				 //static member nem lehet, nem ismernénk a típust
				 //generikus osztály nem öröklődhet Sueable-ből???
	T ob1;
	V ob2;

	Two(T o1, V o2){
		ob1 = o1;
		ob2 = o2;
	}

	T getOb1() { return ob1; }
	V getOb2() { return ob2; }

	void showType(){
		System.out.println("Type of ob1 is " + ob1.getClass().getName());
		System.out.println("Type of ob2 is " + ob2.getClass().getName());
		//Object osztályból örökli ezeket a függvényeket
	}
}

class SimpGen {

	public static void main(String[] args) {
		Two<Integer, String> cOb = new Two<Integer, String>(11, "my string");

		cOb.showType();

		int i = cOb.getOb1();

		String str = cOb.getOb2();

		System.out.println("Value of i: " + i);
		System.out.println("Value of str: " + str);
	}
}