//változó argumentum számú függvények
class VarArgs {
	static void vaTest(int ... v) {
		System.out.println("Number of args: " + v.length + ", contents:");
	
		for(var i : v)
			System.out.print(i + " ");
		System.out.println();
	}

	static void vaTest(boolean ... v) {
		System.out.println("Number of args: " + v.length + ", contents:");
	
		for(var i : v)
			System.out.print(i + " ");
		System.out.println();
	}

	static void vaTest(String msg, boolean ... v) {
		System.out.println(msg);
		System.out.println("Number of args: " + v.length + ", contents:");
	
		for(var i : v)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		
		vaTest(10);
		vaTest(10,20,30,40,50);

		vaTest(true);
		vaTest(false, false, true, false);

		vaTest("Kávé ilyen: jó", true);
		vaTest("false", false, true, false);
	}

}