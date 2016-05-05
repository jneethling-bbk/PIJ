package generics;

public class ListDriver {

	public static void main(String[] args) {
		
		LinkedList<String> hannes = new LinkedList<String>("Hannes");
		LinkedList<String> theList = hannes;
		
		LinkedList<String> jearelle = new LinkedList<String>("Jearelle");
		theList.add(jearelle);
		LinkedList<String> marni = new LinkedList<String>("Marni");
		theList.add(marni);
		LinkedList<String> christo = new LinkedList<String>("Christo");
		theList.add(christo);
		System.out.println(theList.toString());
		theList.delete(christo);
		System.out.println(theList.toString());
		theList = jearelle;
		System.out.println(theList.toString());
		
		
		SortedList<Integer> numbers = new SortedList<Integer>(null);
		numbers.add(new SortedList<Integer>(7));
		numbers.add(new SortedList<Integer>(3));
		numbers.add(new SortedList<Integer>(1));
		numbers.add(new SortedList<Integer>(2));
		numbers.add(new SortedList<Integer>(9));
		numbers.add(new SortedList<Integer>(4));
		System.out.println(numbers.toString());

	}

}
