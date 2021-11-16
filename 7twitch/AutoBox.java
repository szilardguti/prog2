class AutoBox {

	static int m(Integer v){
		return v;
	}

	public static void main(String[] args) {
		int a = 6;
		double s = 1.5;

		double sa = s*a;

		System.out.println(sa);
	
		Integer iOb = Integer.valueOf(a); //typewrapper

		Integer iOb2 = Integer.valueOf(100);

		Integer iOb3 = 101;

		System.out.println(iOb.intValue());
		System.out.println(iOb2.intValue());
		System.out.println(iOb3);
	
		System.out.println(m(420));//int leterált autoboxol Integerbe, majd visszaadásnál kicsomagolja megint int-be
	}
}