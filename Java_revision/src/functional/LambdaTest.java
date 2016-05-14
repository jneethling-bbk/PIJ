package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class LambdaTest {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> unary;
		unary = n -> n * 2;
		System.out.println(unary.apply(3));
		unary = n -> n + 1;
		System.out.println(unary.apply(3));
		
		BinaryOperator<Double> binary;
		binary = (x, y) -> x + y;
		System.out.println(binary.apply(5.1, 4.9));
		binary = (x, y) -> x/y;
		System.out.println(binary.apply(5.0, 2.0));
		
		List<String> myList = new ArrayList<>();
		myList.add("Hannes");
		myList.add("Jearelle");
		
		Consumer<List<String>> listWorker;
		listWorker = l -> {
			for (String s : l) {
				System.out.println(s);
			}
		};
		listWorker.accept(myList);
		listWorker = l -> l.clear();
		listWorker.accept(myList);
		System.out.println(myList.isEmpty());
		
		Supplier<Double> myNum;
		myNum = () -> 123.45;
		System.out.println(myNum.get());
		myNum = () -> Math.random() * 100;
		System.out.println(myNum.get());

		Function<Integer, Double> myFunction;
		myFunction = i -> (double) i.intValue();
		System.out.println(myFunction.apply(5));
		
		Predicate<Integer> myTest;
		myTest = n -> (n % 2) == 0;
		System.out.println(myTest.test(4));
		System.out.println(myTest.test(3));
		myTest = n -> {
			boolean answer = true;
			for (int i = 2; i < n; i++) {
				if ((n % i) == 0) {
					answer = false;
				}
			}
			return answer;
		};
		System.out.println(myTest.test(29));
		System.out.println(myTest.test(27));;
	}

}
