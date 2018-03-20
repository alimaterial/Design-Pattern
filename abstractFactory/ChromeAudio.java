package abstractFactory;

public class ChromeAudio implements IAudio {

	@Override
	public void attachAudio() {
		System.out.println("Chrome Audio attached");

	}

	@Override
	public void playAudio() {
		System.out.println("Chrome Audio Play");
	}

}

