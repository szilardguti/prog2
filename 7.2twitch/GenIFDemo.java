interface MinMax<T extends Comparable<T>> {
	T min();
	T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {

	T[] vals;

	MyClass(T[] o) { vals = o; }

	public T min() {
		T v = vals[0];

		for(int i = 0; i < vals.length; i++)
			if(vals[i].compareTo(v) < 0) v = vals[i];//ilyenkor van előtte
	
		return v;
	}

	public T max() {
		T v = vals[0];

		for(int i = 0; i < vals.length; i++)
			if(vals[i].compareTo(v) > 0) v = vals[i];//ilyenkor mögötte van	
		return v;
	}
}

class GenIFDemo {
	public static void main(String[] args) {
		Integer iNums[] = {4, 2, 0};
		Character chs[] = {'b', 'r', 'w', 'k'};

		MyClass<Integer> iOb = new MyClass<>(iNums);
		MyClass<Character> cOb = new MyClass<>(chs);

		System.out.println("iOb min: " + iOb.min() + " iOb max: " + iOb.max());
		System.out.println("cOb min: " + cOb.min() + " cOb max: " + cOb.max());
	}
}