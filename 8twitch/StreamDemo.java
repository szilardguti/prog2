import java.util.*;
import java.util.stream.*;

class StreamDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<>();

		myList.add(7);
		myList.add(30);
		myList.add(3);
		myList.add(24);
		myList.add(30);
		myList.add(2);

		System.out.println("Original list: " + myList);

		Stream<Integer> myStream = myList.stream();
		//collection interface-ban van a .stream()

		//Stream művelet lehet átmeneti vagy terminális, a min terminális, consume-oltuk a streamet
		//azaz nem lehet vele tovább dolgozni

		Optional<Integer> /*értéket tárol, ha tárol*/ minval =
			myStream.min(Integer::compare); //'predikátumot' kell átadni
	
			if(minval.isPresent()) System.out.println("Minval: " + minval.get());
			//isPresent() ha van benne érték

		myStream = myList.stream();
		Optional<Integer> maxVal = myStream.max(Integer::compare);
		if(maxVal.isPresent()) System.out.println("Maxval: " + maxVal.get());
	

		Stream<Integer> sortedStream = myList.stream().sorted();

		System.out.println("Sorted stream: ");
		sortedStream.forEach((n) -> System.out.print(n + " "));
		System.out.println();


		Stream<Integer> oddVals = myList.stream().sorted().filter((n) -> (n % 2) == 1);
		oddVals.forEach((n) -> System.out.print(n + " "));
		System.out.println();


		oddVals = myList.stream()
			.filter((n) -> (n % 2) == 0)
			.filter((n) -> (n > 5));

		oddVals.forEach((n) -> System.out.print(n + " "));
		System.out.println();
	}
 }