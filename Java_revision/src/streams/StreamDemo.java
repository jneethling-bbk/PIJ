package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> myList1 = new ArrayList<Integer>(); 
		myList1.add(7);
		myList1.add(5);
		myList1.add(8);
		myList1.add(9);
		myList1.add(3);
		myList1.add(4);
		
		System.out.println("Original list: " + myList1);
		
		Stream<Integer> myStream;
		
		myStream = myList1.stream();
		Optional<Integer> minVal = myStream.min(Integer :: compare);
		if (minVal.isPresent()) {
			System.out.println("Minimum value: " + minVal.get());
		}
		
		myStream = myList1.stream();
		Optional<Integer> maxVal = myStream.max(Integer :: compare);
		if (maxVal.isPresent()) {
			System.out.println("Maximum value: " + maxVal.get());
		}
		
		Stream<Integer> sortedStream = myList1.stream().sorted();
		System.out.print("Sorted stream: ");
		sortedStream.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		Stream<Integer> oddVals = myList1.stream().sorted().filter(n -> (n%2) == 1);
		System.out.print("Odd values: ");
		oddVals.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		List<Double> myList2 = new ArrayList<>();
		myList2.add(7.0);
		myList2.add(5.0);
		myList2.add(8.0);
		myList2.add(9.0);
		myList2.add(3.0);
		myList2.add(4.0);
		
		Stream<Double> sqrtStream = myList2.stream().map(a -> Math.sqrt(a));
		double product = sqrtStream.reduce(1.0, (a,b) -> a * b);
		System.out.println("The product of the square roots is: " + product);
		
	}

}
