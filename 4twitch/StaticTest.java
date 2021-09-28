class StaticDemo {

	static int a = 7;
	static int b = 8;

	static int callMe(int param) {
		return a * b * param;
	} 
}

class UseClass {

	static int a = 10;
	static int b;

	static {
		System.out.println("Static block init");
		b = a * 10;
	}

	static void method(int x) {
		System.out.println("a==" + a);
		System.out.println("b==" + b);
		System.out.println("x==" + x);
	}

	public static void main(String[] args) {
		
		int theAnswer = 42;

		System.out.println(StaticDemo.callMe(theAnswer));

		method(42);
	}
}
/*	static függvény benne van a memóriában anélkül is
	hogy példányosítanánk a class-t amiben benne van */