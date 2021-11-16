class NonGen {
	int num;

	NonGen(int o) { num = o; }

	int getNum() { return num; }
}

class Gen<T> extends NonGen {
	T ob;

	Gen(int num, T o) { 
		super(num);
		ob = o; 
	}

	T getOb() { return ob; }
}

class Gen2<T, V> extends Gen<T> { //figyelni kell, hogy a T-t vigyük tovább
	V ob2;

	Gen2(int num, T o, V o2) {
		super(num, o);
		ob2 = o2;
	}

	V getOb2() { return ob2; }
}

class HierDemo2 {
	public static void main(String[] args) {
		
		Gen2<Integer, String> x = 
			new Gen2<>(123, 100, "This is a nice string!:)");

		System.out.println(x.getNum());
		System.out.println(x.getOb());
		System.out.println(x.getOb2());
	}
}