package inheritance;

public class Guitar extends WoodenObject implements MusicalInstrument {
	
	@Override
	public void play() {
		System.out.println("Twing twang twing");
	}
	
}
