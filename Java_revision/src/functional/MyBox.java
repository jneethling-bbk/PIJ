package functional;

public class MyBox {

	private int value;
	
	public MyBox(int value) {
		this.value = value;
	}
	
	public MyBox() {
		value = 0;
	}
	
	public int getValue() {
		return value;
	}
}
