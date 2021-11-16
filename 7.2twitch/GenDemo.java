class Gen<T> {//nem generálódik le runtime-kor, mint c++-ban

	T ob;

	Gen(T o){
		ob = o;
	}

	T getOb() { return ob; }

	void showType(){
		System.out.println("Type of ob is " + ob.getClass().getName());
		//Object osztályból örökli ezeket a függvényeket
	}
}

class GenDemo {

	public static void main(String[] args) {
		Gen<Integer> iOb; //referenciát kell <> közé adni

		iOb = new Gen<Integer>(420);//működik az autoboxing

		iOb.showType();

		int i = iOb.getOb();

		System.out.println("Value of i: " + i);
	
		Gen<String> sOb = new Gen<>("this is a string");

		sOb.showType();

		String str = sOb.getOb();

		System.out.println("Value of str: " + str);
	
		//iOb = sOb; //ez itt hibát dob, mivel a 
		//				Gen<Integer> és Gen<String> teljesem más típus
	}
}