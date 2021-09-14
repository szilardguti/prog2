class Light {

	public static void main(String[] args) {

		int lightspeed = 299792;

		long days = 1000;
		long second = 24 * 60 * 60 * days;
		long distance = second * lightspeed;

		System.out.println("In " + days + " day light travels " 
			+ distance + " km");


		/* 
		variable types we use:

		int, long, byte, short
		float, double
		char
		boolean
		*/
	}
}