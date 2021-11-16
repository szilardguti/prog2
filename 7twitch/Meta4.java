import java.lang.annotation.*;
import java.lang.reflect.*; //ezzel nyerjük ki az annotációkat a programból

@Retention(RetentionPolicy.RUNTIME)//ez is egy built-in annotation
@interface What {
	String description();
}//ha üres akkor Marker annotációnak hívjuk

@Retention(RetentionPolicy.RUNTIME) //mikor akarjuk használni az interface-t
@interface MyAnno{
	String str() default "Testing";
	int val() default 9999;
}

@What(description = "An annotation test class")
@MyAnno()
class Meta4 {

	@What(description = "An annotation test method")
	@MyAnno(val = 100)
	public static void myMethod(String s, int v){

		Meta4 ob = new Meta4();

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