package functional;

import java.util.function.Function;

public class ConstructorRefDemo {

	static <T, R> R fabricateClass(Function<T, R> cons, T value) {
		return cons.apply(value);
	}
	
	public static void main(String[] args) {
		
		Function<Integer, MyBox> myClassCons2 = MyBox :: new;
		MyBox intBox = fabricateClass(myClassCons2, 7);
		System.out.println("The number is " + intBox.getValue());
		
		Function<String, MyGenBox<String>> myClassCons1 = MyGenBox<String> :: new;
		MyGenBox<String> strBox = fabricateClass(myClassCons1, "Hannes");
		System.out.println("The string is " + strBox.getVal());
	}

}
