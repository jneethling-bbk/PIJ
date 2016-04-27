package inheritance;

public class MobilePhone extends OldPhone {
	String[] numberLog = new String[10];
	
	public MobilePhone(String brand) {
		super(brand);
	}
	
	public void ringAlarm(String sound) {
		System.out.println(sound);
	}
	
	public void playGame(String game) {
		System.out.println("Playing " + game + "...");
	}
	
	@Override
	public void call(String number) {
		super.call(number);
		for (int i = numberLog.length -1; i > 0; i--) {
			numberLog[i] = numberLog[i-1];
		}
		numberLog[0] = number;
	}
	public void showNumbers() {
		System.out.println("Call log:");
		System.out.println("---------");
		for (int i = 0; i < numberLog.length; i++) {
			System.out.println(numberLog[i]);
		}
	}
}
