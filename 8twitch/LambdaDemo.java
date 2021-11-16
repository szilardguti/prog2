interface MyNumber{ //functional interface-ben egy darab absztrakt függvény lehet
	double getValue();
}

interface NumericTest {
	boolean test(int n);
}

class LambdaDemo {
	public static void main(String[] args) {
		
		MyNumber mynumb;

		//lambda kifejezés:
		mynumb = () -> 123.45;
		//csak olyan assigment lehet, ami egyezik a return type-al

		System.out.println("A fixed value:" + mynumb.getValue());
	
		mynumb = () -> Math.random() * 100;
		//innentől random értéket ad, a getValue-t ezzel állítottuk be

		System.out.println("A fixed value:" + mynumb.getValue());
		System.out.println("A fixed value:" + mynumb.getValue());
	
		NumericTest isEven = (int n) -> (n % 2) == 0; //visszatérési típus jó lesz

		for(int i = 1;i < 6; i++)
			if(isEven.test(i))
				System.out.println("" + i + " is even");
			else
				System.out.println("" + i + " is not even");
	

		NumericTest isNonNegative = (int n) -> n >= 0; //referencia egy funkcionális interface-re
		if(isNonNegative.test(6) && isEven.test(6))
			System.out.println("6 is positive and even");
	}
}