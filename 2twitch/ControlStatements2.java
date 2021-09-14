class ControlStatements2 {

	public static void main(String[] args) {
		
		int n = 10;

		while(n > 0){
			System.out.println("n is " + n);
			n--;
		}

		for(int i = 0;i < 20; i++)
			System.out.print("-");
		System.out.println();

		do{
			System.out.println("n is " + n);
			n++;
		} while(n < 10);

		for(int i = 0;i < 20; i++)
			System.out.print("-");
		System.out.println();

		for (n = 10; n > 0; n--) {
			System.out.println("n is " + n);
		}


		for(int i = 0;i < 20; i++)
			System.out.print("-");
		System.out.println();

		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};

		int sum = 0;

		for(int num : nums){
			System.out.println("Number: " + num);
			sum += num;
		}

		System.out.println("Sum is " + sum);

		System.out.println("Avg is " + (double)sum/nums.length);
	}
}