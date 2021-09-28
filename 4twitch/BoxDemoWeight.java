class Box { //alapból minden public a classon belül, meg kell adni ha privateolni szeretnéd
	double width;
	double height;
	double depth;

	Box() {
		width = 0;
		height = 0;
		depth = 0;
	}

	Box(Box ob) {
		this.width = ob.width;
		this.height = ob.height;
		this.depth = ob.depth;
	}

	Box(double len) {
		depth = height = width = len;
	}

	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	double volume() {
		 return width * height * depth;
	}

	void setDim(double w, double h, double l) {
		width = w;
		height = h;
		depth = l;
	}

	void setDim(double len) {
		width = height = depth = len;
	}
}

class BoxWeight extends Box {
	double weight;

	BoxWeight(double w, double d, double h, double m){
		super(w, h, d);//az ősosztálynak átadja
		weight = m;
	} 
}

class BoxDemoWeight {

	public static void main(String[] args) {
		
		BoxWeight weightBox = new BoxWeight(10, 20, 30, 5.5);
		Box plainBox = new BoxWeight();


		double vol = weightBox.volume();
		System.out.println("box1 vol: " + vol);
		System.out.println("box1 weight: " + weightBox.weight);
	

		plainBox = weightBox;//referencia típus számít, nem az obj típus


		vol = plainBox.volume();
		System.out.println("box2 vol: " + vol);
		//System.out.println("box2 weight: " + plainBox.weight);
	}
}