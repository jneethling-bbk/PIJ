package inheritance;

public class SmartPhone extends MobilePhone {

	public SmartPhone(String brand) {
		super(brand);
	}
	
	@Override
	public void call(String number) {
		if (number.startsWith("00")) {
			System.out.println("Calling " + number + " using VOIP...");
		} else {
			super.call(number);
		}
	}
	
	public void browseWeb(String url) {
		System.out.println("Connecting to " + url + "...");
	}
	public String findLocation() {
		return "51.519403, -0.127005";
	}
}
