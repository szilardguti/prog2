class Gen<T> {
	T ob;

	Gen(T o) { ob = o; }

	T getOb() {
		System.out.println("Gen<T> getOb()"); 
		return ob;
	}
}

class Gen2<T> extends Gen<T> { //figyelni kell, hogy a T-t vigyük tovább

	Gen2(T o) {
		super(o);
	}

	T getOb() { 
		System.out.println("Gen2<T> getOb()");
		return ob;
	}
}

class OverrideDemo {
	public static void main(String[] args) {
		
		Gen<Integer> x1 = new Gen<Integer>(100);
		Gen2<Integer> x2 = new Gen2<>(100);
		Gen2<String> xStr = new Gen2<String>("hello");
 		
 		System.out.println(x1.getOb());
 		System.out.println(x2.getOb());
 		System.out.println(xStr.getOb());
	}
}