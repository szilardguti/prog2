class Exc2 {

	public static void main(String[] args) {
		
	try {
		int d = 0;
		int a = 42 / d;
	} catch (ArithmeticException e) {
		System.out.println("ArithmeticException hiba: ");
		e.printStackTrace();
	}
	System.out.println("After catch");
	}
}