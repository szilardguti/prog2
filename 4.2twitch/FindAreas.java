abstract class Figure {
	double dim1, dim2;

	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	abstract double area();
}

class Rectangle extends Figure {

	Rectangle(int a, int b) {
		super(a, b);
	}

	double area() {
		System.out.println("Inside Rectangle()");
		return dim1 * dim2;
	}
}

class Triangle extends Figure {

	Triangle(double a, double b) {
		super(a, b);
	}

	double area() {
		System.out.println("Inside Triangle");
		return dim1 * dim2 / 2;
	}
}

class FindAreas {
	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(5.5, 10.2);
		Triangle triag = new Triangle(2.5, 8.5);

		Figure figref;

		figref = rect;
		System.out.println("Rect area: " + figref.area());

		figref = triagle;
		System.out.println("Triangle area: " + figref.area());
	}
}