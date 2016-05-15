package functional;

import java.util.function.BiPredicate;

public class ObjectMethodRefDemo {

	static <T, U> int count(T[] vals, BiPredicate<T,U> bp, U u) {
		int counter = 0;
		for (int i = 0; i < vals.length; i++) {
			if (bp.test(vals[i], u)) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		int counter;
		
		HighTemp[] weekDayHighs = {new HighTemp(89),
									new HighTemp(82),
									new HighTemp(90),
									new HighTemp(89),
									new HighTemp(89),
									new HighTemp(91),
									new HighTemp(84)};
		
		HighTemp refTemp = new HighTemp(89);
		
		counter = count(weekDayHighs, HighTemp :: isSameTemp, refTemp);
		System.out.println(counter + " days had a high of 89");
		
		counter = count(weekDayHighs, HighTemp :: isLowerTemp, refTemp);
		System.out.println(counter + " days had a high of less than 89");
	}

}
