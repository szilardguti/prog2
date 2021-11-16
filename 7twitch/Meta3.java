import java.lang.annotation.*;
import java.lang.reflect.*; //ezzel nyerjük ki az annotációkat a programból

@Retention(RetentionPolicy.RUNTIME)
@interface What {
	String description();
}

@Retention(RetentionPolicy.RUNTIME) //mikor akarjuk használni az interface-t
@interface MyAnno{
	String str();
	int val();
}

@What(description = "An annotation test class")
@MyAnno(str = "Meta3", val = 42)
class Meta3 {

	@What(description = "An annotation test method")
	@MyAnno(str = "Annotation example", val = 100)
	public static void myMethod(String s, int v){

		Meta3 ob = new Meta3();

		try {

			Annotation annos[] = ob.getClass().getAnnotations();

			System.out.println("Annotations for Meta3:");

			for(Annotation a : annos)
				System.out.println(a);

			Method m = ob.getClass().getMethod("myMethod", String.class, int.class);

			annos = m.getAnnotations();

			System.out.println("Annotations for myMethod:");

			for(Annotation a : annos)
				System.out.println(a);

		} catch (NoSuchMethodException e) {
			System.out.println("NoSuchMethodException");
		}
	}

	public static void main(String[] args) {
		myMethod("test", 10);
	}
}