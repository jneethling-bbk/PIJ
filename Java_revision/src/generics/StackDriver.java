package generics;

public class StackDriver {

	public static void main(String[] args) {
		NumberStack<Integer> ints = new NumberStack<>();
		System.out.println(ints.isEmpty());
		ints.push(5);
		ints.push(3);
		ints.push(7);
		ints.push(1);
		System.out.println(ints.isEmpty());
		System.out.println(ints.pop());
		System.out.println(ints.pop());
		System.out.println(ints.pop());
		System.out.println(ints.pop());
		System.out.println(ints.pop());

		NumberStack<Double> dobs = new NumberStack<>();
		System.out.println(dobs.isEmpty());
		dobs.push(5.1);
		dobs.push(3.7);
		dobs.push(7.0);
		dobs.push(1.4);
		System.out.println(dobs.isEmpty());
		System.out.println(dobs.pop());
		System.out.println(dobs.pop());
		System.out.println(dobs.pop());
		System.out.println(dobs.pop());
		System.out.println(dobs.pop());
		
		NumberStack<Number> num = new NumberStack<>();
		System.out.println(num.isEmpty());
		num.push(5);
		num.push(3.7);
		num.push(7L);
		num.push(1.4);
		System.out.println(num.isEmpty());
		System.out.println(num.pop());
		System.out.println(num.pop());
		System.out.println(num.pop());
		System.out.println(num.pop());
		System.out.println(num.pop());
	}
}
