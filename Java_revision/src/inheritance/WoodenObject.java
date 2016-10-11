package inheritance;

public abstract class WoodenObject {
	
	//Encapsulated private member
	private String burning = "Smoke and flames";
	
	public void burn() {
		System.out.println(burning);
	}
}
