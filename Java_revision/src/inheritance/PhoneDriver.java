package inheritance;

public class PhoneDriver {

	public static void main(String[] args) {
		PhoneDriver driver = new PhoneDriver();
		driver.launch();
	}
	public void launch() {
		String numbers[] = {"90000001", "80000001","70000001","60000001","50000001","40000001","30000001","20000001","10000001","00000001","90000011"};
		SmartPhone p = new SmartPhone("Nokia");
		for (int i = 0; i < numbers.length; i++) {
			p.call(numbers[i]);
		}
		p.showNumbers();
		p.playGame("Donkey Kong");
		p.ringAlarm("Beep");
		String loc = p.findLocation();
		p.browseWeb("https://www.google.co.uk/maps/@" + loc + "z");
		System.out.println("Powered by " + p.getBrand());
		RestrictedSmartPhone r = new RestrictedSmartPhone("Nokia");
		r.playGame("Donkey Kong");
	
	}

}
