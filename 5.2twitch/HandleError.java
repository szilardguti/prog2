import java.util.Random;

class HandleError {
	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0;
		Random r = new Random();

		for(int i = 0; i < 32000; ++i) {
			try {
				b = r.nextInt();
				c = r.nextInt();
				a = 12345 / (b/c);
			} catch(ArithmeticException e | ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception: " + e);
				a = 0;
			} catch (Exception e1) {
				System.out.println("some Exception: " + e1);
			}
			System.out.println("a==" + a);
		}
	}
}