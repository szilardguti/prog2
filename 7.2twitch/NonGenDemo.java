class NonGen {

	Object ob;

	NonGen(Object ob) { this.ob = ob; }

	Object getOb() { return ob; }

	void showType() {
		System.out.println("Type of ob is " + ob.getClass().getName());
	}
}

class NonGenDemo {
	public static void main(String[] args) {
		
		NonGen iOb = new NonGen(88);

		iOb.showType();

		int i = (Integer) iOb.getOb();//Objectet nem lehet convertelni elemi típusba

		System.out.println("Value of i: " + i);
	
		NonGen sOb = new NonGen("this is a string");

		sOb.showType();

		String str = (String) sOb.getOb();

		System.out.println("Value of str: " + str);
	

		iOb = sOb;//ez most működik, sérti a type-safetyt elég durván
	}
}