package functional;

public class HighTemp {

	private int hTemp;
	
	public HighTemp(int hTemp) {
		this.hTemp = hTemp;
	}
	
	public boolean isSameTemp(HighTemp ht) {
		return hTemp == ht.hTemp;
	}
	
	public boolean isLowerTemp(HighTemp ht) {
		return hTemp < ht.hTemp;
	}
}
