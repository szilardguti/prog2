interface SomeFunc<T> {
	T func(T n);
}

class GenFuncLambda {
	public static void main(String[] args) {
		
		SomeFunc<Integer> factorial = (n) -> {
			int result = 1;

			for(int i = 1; i <= n; i++)
				result = result * i;

			return result;
		};//konkrét blockot tudunk megadni
		//lényeges, hogy a paraméter és a return fit-eljen az interface-hez

		System.out.println("The factorial of 7 is: " + factorial.func(7));
		System.out.println("The factorial of 10 is: " + factorial.func(10));
	

		SomeFunc<String> reverseStr = (str) -> {
			String result = "";
			int i;

			for(i = str.length()-1; i >= 0; i--)
				result += str.charAt(i);

			return result;
		};

		System.out.println("Lambda reversed is " + reverseStr.func("Lambda"));
	}
}