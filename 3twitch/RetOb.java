class Test {
	int a;

	Test(int i) {
		a = i;
	}

	Test incByThen() {
		Test temp = new Test(a + 10);
		return temp; // user defined típusoknál a return referenciát ad vissza
	}
}

class RetOb {
	public static void main(String[] args) {
		
		Test ob1 = new Test(10);
		Test ob2;//referencia

		ob2 = ob1.incByThen();

		System.out.println("ob1: " + ob1.a);
		System.out.println("ob2: " + ob2.a);
	}
}