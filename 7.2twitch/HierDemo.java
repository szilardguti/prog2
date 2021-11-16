class Gen<T> {
	T ob;

	Gen(T o) { ob = o; }

	T getOb() { return ob; }
}

class Gen2<T, V> extends Gen<T> { //figyelni kell, hogy a T-t vigyük tovább
	V ob2;

	Gen2(T o, V o2) {
		super(o);
		ob2 = o2;
	}

	V getOb2() { return ob2; }
}

class HierDemo {
	public static void main(String[] args) {
		
		Gen2<Integer, String> x = 
			new Gen2<>(100, "This is a nice string!:)");

		System.out.println(x.getOb());
		System.out.println(x.getOb2());
	}
}