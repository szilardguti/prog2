class Box { //alapból minden public a classon belül, meg kell adni ha privateolni szeretnéd
	double width;
	double height;
	double lenght;

	Box() {
		width = 0;
		height = 0;
		lenght = 0;
	}

	Box(Box ob) {
		this.width = ob.width;
		this.height = ob.height;
		this.lenght = ob.lenght;
	}

	Box(double len) {
		lenght = height = width = len;
	}

	Box(double width, double height, double lenght) {
		this.width = width;
		this.height = height;
		this.lenght = lenght;
	}

	double volume() {
		 return width * height * lenght;
	}

	void setDim(double w, double h, double l) {
		width = w;
		height = h;
		lenght = l;
	}

	void setDim(double len) {
		width = height = lenght = len;
	}
}

class BoxDemo {

	public static void main(String[] args) {
		
		Box myBox1; //referenciát foglal csak
		myBox1 = new Box(); /*a new fog memóriát foglalni és hívja a default constructor 
			de a garbage collector összeszedi ha már nem vonatkozik rá referencia
			sporadikusan hívódik az összeszedő
		*/

		myBox1.width = 10;
		myBox1.height = 20;
		myBox1.lenght = 30;

		//double vol = myBox1.width * myBox1.height * myBox1.lenght;
		double vol = myBox1.volume();

		System.out.println("Volume is " + vol);

		Box myBox2 = new Box(myBox1);
		System.out.println("Volume is " + myBox2.volume());

		Box myBox3 = new Box(10.0);
		System.out.println("Volume is " + myBox3.volume());


		Box myBox4 = new Box(10.0, 20.0, 30.0);
		System.out.println("Volume is " + myBox4.volume());

		myBox4.setDim(10.0, 15.0, 20.0);
		System.out.println("Volume is " + myBox4.volume());

		myBox4.setDim(30.0);
		System.out.println("Volume is " + myBox4.volume());
	}
}