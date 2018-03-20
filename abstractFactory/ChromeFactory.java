package abstractFactory;

public class ChromeFactory implements IFactory {

	@Override
	public IAudio getAudio() {
		
		return new ChromeAudio();
	}

	@Override
	public IVideo getVideo() {
		return new ChromeVideo();
	}

	@Override
	public IMag getMag() {
				return null;
	}

}

