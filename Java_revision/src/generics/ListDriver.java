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
		
		
		LinkedList<Integer> numbers = new LinkedList<Integer>(7);
		numbers.add(new LinkedList<Integer>(3));
		numbers.add(new LinkedList<Integer>(1));
		numbers.add(new LinkedList<Integer>(2));		
		System.out.println(numbers.toString());

	}

}
