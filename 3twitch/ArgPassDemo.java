class ValueTest {
	void method(int i, int j) {
		i *= 2;
		j /= 2;
	}
}

class ReferenceTest {

	int a, b;
	ReferenceTest(int i, int j) {
		a = i;
		b = j;
	}

	void method(ReferenceTest obj) {
		obj.a *= 2;
		obj.b /= 2;
	}
}

class ArgPassDemo {
	public static void main(String[] args) {
		
		ValueTest valOb = new ValueTest();

		int a = 25, b = 40;

		System.out.println("a = " + a + " b = " + b);

		valOb.method(a, b);//pass by value

		System.out.println("a = " + a + " b = " + b);

		////////////////////////////////////////////////
		ReferenceTest refOb = new ReferenceTest(25, 40);

		System.out.println("Before call: " + refOb.a + "\t" + refOb.b);

		refOb.method(refOb);// user típusnál referenciát ad át
		//igazából ez is pass by value, csak a value maga egy referencia igazából

		System.out.println("After call: " + refOb.a + "\t" + refOb.b);
	}
}