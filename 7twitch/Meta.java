import java.lang.annotation.*;
import java.lang.reflect.*; //ezzel nyerjük ki az annotációkat a programból

@Retention(RetentionPolicy.RUNTIME) //mikor akarjuk használni az interface-t
@interface MyAnno{
	String str();
	int val();
}

class Meta {

	@MyAnno(str = "Annotation example", val = 100)
	public static void myMethod(){

		Meta ob = new Meta();

		try {
			Class<?>/*wild car*/ c = ob.getClass();

			Method m = c.getMethod("myMethod");

			MyAnno anno = m.getAnnotation(MyAnno.class);

			System.out.println(anno.str() + " " + anno.val());
		
		} catch (NoSuchMethodException e) {
			System.out.println("NoSuchMethodException");
		}
	}

	public static void main(String[] args) {
		myMethod();
	}
}