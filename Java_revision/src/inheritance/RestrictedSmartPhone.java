package inheritance;

public class RestrictedSmartPhone extends SmartPhone {

	public RestrictedSmartPhone(String brand) {
		super(brand);
	}
	
	@Override
	public void playGame(String game) {
		System.out.println("Phone is locked down, unable to play " + game + "...");
	}
}
