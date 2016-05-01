package methods;

public class InitBlock {

	private String a;
	private String b;
	private String c;
	
	{
		if (b == null) {
			b = "a ";
		}
		c = "test string";
	}
	
	public InitBlock(String a) {
		this.a = a + " ";
	}
	
	public InitBlock(String a, String b) {
		this.a = a + " ";
		this.b = b + " ";
		
	}
	
	public String getConcat() {
		return a + b + c;
	}
}
