package abstractFactory;

public class ChromeVideo implements IVideo {

	@Override
	public void attachVideo() {
		System.out.println("Chrome Video Attached ");
	}

	@Override
	public void playVideo() {
		System.out.println("Chrome Video Playing ");

	}

}