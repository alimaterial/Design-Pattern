package abstractFactory;

public class ExpVideo implements IVideo {

	@Override
	public void attachVideo() {
		System.out.println("IE Video Attached ");
	}

	@Override
	public void playVideo() {
		System.out.println("IE Video Playing ");

	}

}
