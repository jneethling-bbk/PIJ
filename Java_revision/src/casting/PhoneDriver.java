package casting;

import inheritance.Phone;
import inheritance.MobilePhone;
import inheritance.SmartPhone;

public class PhoneDriver {

	public static void main(String[] args) {
	
		MobilePhone myPhone = new SmartPhone("Nokia");
		SmartPhone smart = (SmartPhone) myPhone;
		System.out.println(smart.findLocation());
		testPhone(smart);
		MobilePhone brokenPhone = new MobilePhone("Nokia");
		testPhone(brokenPhone);
	}
	
	public static void testPhone(Phone phone) {
		phone.call("6548976");
		SmartPhone smart = (SmartPhone) phone;
		System.out.println(smart.findLocation());
	}
}
