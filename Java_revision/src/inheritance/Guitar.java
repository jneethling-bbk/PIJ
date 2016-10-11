package inheritance;

public class Guitar extends WoodenObject implements MusicalInstrument {
	
	@Override
	public void play(String tune) {
		System.out.println(tune);
	}
	
}
