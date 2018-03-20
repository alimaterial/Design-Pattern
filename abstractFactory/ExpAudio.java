package abstractFactory;

public class ExpAudio implements IAudio {

	@Override
	public void attachAudio() {
		System.out.println("IE Audio attached");

	}

	@Override
	public void playAudio() {
		System.out.println("IE Audio Play");

	}

}
