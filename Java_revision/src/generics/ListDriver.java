package generics;

public class ListDriver {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>("Hannes");
		names.add(new LinkedList<String>("Jearelle"));
		names.add(new LinkedList<String>("Marni"));
		names.add(new LinkedList<String>("Christo"));		
		System.out.println(names.toString());
		
		LinkedList<Integer> numbers = new LinkedList<Integer>(7);
		numbers.add(new LinkedList<Integer>(3));
		numbers.add(new LinkedList<Integer>(1));
		numbers.add(new LinkedList<Integer>(2));		
		System.out.println(numbers.toString());

	}

}
