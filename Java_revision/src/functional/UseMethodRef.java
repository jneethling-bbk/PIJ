package functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseMethodRef {

	static int compareMC(MyBox a, MyBox b) {
		return a.getValue() - b.getValue();
	}
	
	public static void main(String[] args) {
		List<MyBox> list = new ArrayList<>();
		list.add(new MyBox(1));
		list.add(new MyBox(4));
		list.add(new MyBox(2));
		list.add(new MyBox(9));
		list.add(new MyBox(7));

		MyBox maxBox = Collections.max(list, UseMethodRef :: compareMC);
		System.out.println("Maximum value is " + maxBox.getValue());
	}

}
