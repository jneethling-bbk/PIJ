package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class LambdaTest {

	static Double runFunction(UnaryOperator<Double> uo, Double d) {
		return uo.apply(d);
	}
	
	static Double runFunction(BinaryOperator<Double> bo, Double d1, Double d2) {
		return bo.apply(d1, d2);
	}
	
	static Double runFunction(Function<Integer, Double> f, Integer i) {
		return f.apply(i);
	}
	
	public static void main(String[] args) {
		
		UnaryOperator<Double> unary;
		unary = n -> n * 2;
		System.out.println(runFunction(unary, 3.0));
		unary = n -> n + 1;
		System.out.println(runFunction(unary, 3.0));
		
		BinaryOperator<Double> binary;
		binary = (x, y) -> x + y;
		System.out.println(runFunction(binary, 5.1, 4.9));
		binary = (x, y) -> x/y;
		System.out.println(runFunction(binary, 5.0, 2.0));
		
		Function<Integer, Double> myFunction;
		myFunction = i -> (double) i.intValue();
		System.out.println(runFunction(myFunction, 5));
		
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
