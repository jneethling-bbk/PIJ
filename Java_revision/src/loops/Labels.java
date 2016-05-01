package loops;

public class Labels {

	public static void main(String[] args) {
	
		String[] array = {"Hannes", "Jearelle", "Marni", "Christo"};
		char searchFor = 'r';
			
		search:
			for (String str : array) {
				for (int i = 0; i < str.length(); i++) {
					System.out.println("Testing " + str.charAt(i));
					if (str.charAt(i) == searchFor) {
						System.out.println("Found " + searchFor + " in " + str);
						continue search;
					}
				}
			}
	}
}

