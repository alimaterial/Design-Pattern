package abstractFactory;

public class ExpFactory implements IFactory {

	@Override
	public IAudio getAudio() {
		
		return new ExpAudio();
	}

	@Override
	public IVideo getVideo() {
		return new ExpVideo();
	}

	@Override
	public IMag getMag() {
				return null;
	}

}
