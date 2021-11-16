class Stats<T extends Number> { //upperbound-ot tudunk megadni, ősosztályt lehet megadni, alapból Object
 
 	T[] numb;

 	Stats(T[] o) { numb = o; }

 	double avarage() {
 		double sum = 0.0;

 		for(int i = 0; i < numb.length; i++)
 			sum += numb[i].doubleValue(); //double-ra alakítja
 		
 		return sum/numb.length;
 	}

 	boolean sameAvg(Stats<?>/*wild card arg*/ ob) {
 		if(avarage() == ob.avarage())
 			return true;
		return false; 
 	}
}

class BoundDemo {
	public static void main(String[] args) {
		
		Integer inums[] = {1, 2, 3, 4, 5, 6, 7, 8 ,9 ,10};

		Stats<Integer> iStats = new Stats<>(inums);
		double iAvg = iStats.avarage();

		System.out.println("iAvg: " + iAvg);


		Double dnums[] = {1.123, 2.32, 3.65, 4.0002, 5.3, 6., 7.8, 8.6 ,9.6 ,10.0001};

		Stats<Double> dStats = new Stats<>(dnums);
		double dAvg = dStats.avarage();

		System.out.println("dAvg: " + dAvg);


		Float fnums[] = {1.123F, 2.32F, 3.65F, 4.0002F, 5.3F, 6.F, 7.8F, 8.6F ,9.6F ,10.0001F};

		Stats<Float> fStats = new Stats<>(fnums);
		double fAvg = fStats.avarage();

		System.out.println("fAvg: " + fAvg);


		if(fStats.sameAvg(dStats))
			System.out.println("Avarages are the same");
		else
			System.out.println("Avarages are not the same");
	}
}